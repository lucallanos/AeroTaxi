package com.UTN;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    Scanner scan;

    Menu(){
        scan = new Scanner(System.in);
    }

    //Para tener acceso a los aviones, clientes y reservas
    AeroTaxi listas = new AeroTaxi();
    //Para tener acceso a los métodos de inicio de sesión
    LogIn ingreso = new LogIn();
    //Para tener acceso a los métodos de reserva
    Reserva reserva = new Reserva();
    //Para tener acceso a los metodos de Admin
    Admin admin = new Admin();

    public void menuInicial()  {
        int opcion;
        do{
            System.out.println("[1]- Ingresar");
            System.out.println("[2]- Ingresar como admin");
            System.out.println("[3]- Registrarse");
            System.out.println("[0]- Volver");
            System.out.println("\nIngrese una opcion: ");
            opcion = scan.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Ingrese su DNI: ");
                    int dni = scan.nextInt();
                    if(ingresar(dni)){
                        menuCliente();
                    }
                    break;
                case 2:
                    System.out.println("Ingrese contraseña privada: ");
                    int password = scan.nextInt();
                    if(ingreso.ingresarAdmin(password)){
                        menuAdmin();
                    }
                    break;
                case 3:
                    System.out.println("Solicitudes necesarias para el Registro: ");
                        registroToLista();
                    break;
            }
        }while (opcion != 0);
    }

    private void menuAdmin()  {
        int respuesta;

        do{
            System.out.println("==================================");
            System.out.println("[1]- Ver lista de Usuarios Ingresados");
            System.out.println("[2]- Ver lista de Aviones segun su Fecha");
            System.out.println("[0]- Volver");
            respuesta = scan.nextInt();

            switch (respuesta){
                case 1:
                    System.out.println("Lista de usuarios: ");
                    UsuariosLista();
                    break;
                case 2:
                    System.out.println("Lista de Aviones disponibles para la Fecha: ");
                    System.out.println(admin.verAvionesPorFecha(listas.getListaAviones()));
                    break;
            }
        }while (respuesta != 0);
    }

    public void menuCliente(){
        int opcion ;
        do{
            System.out.println("==================================");
            System.out.println("[1]- Hacer una reserva");
            System.out.println("[2]- Dar de baja una reserva");
            System.out.println("[3]- Ver historial de viajes");
            System.out.println("[0]- Volver");
            opcion = scan.nextInt();

            switch (opcion){
                case 1:
                    System.out.println(reservar(listas.getListaAviones()));
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
        }while(opcion != 0);
    }


    public boolean ingresar(int dni){
        boolean flag = ingreso.ingresar(dni, listas.getListaClientes());
        return flag;
    }

    public StringBuilder reservar(ArrayList<Avion> listaAviones){
        StringBuilder msj = new StringBuilder();
        msj = reserva.reservar(listaAviones);
        return msj;
    }

    public void UsuariosLista(){
        admin.verListaUsuarios(listas.getListaClientes());
    }

    public void registroToLista(){
        boolean flag = false;
        Cliente cliente = new Cliente();
        flag = listas.agregarCliente(ingreso.registro(cliente));
    }
}