package com.UTN;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner scan;

    public Menu(){
        scan = new Scanner(System.in);
    }

    //Para tener acceso a los aviones, clientes y reservas
    AeroTaxi listas = new AeroTaxi();
    //Para tener acceso a los métodos de inicio de sesión
    LogIn ingreso = new LogIn();
    //Para tener acceso a los métodos de reserva
    Reserva reserva = new Reserva();
    //Para tener acceso a los métodos de admin
    Admin admin = new Admin();
    //Menus
    public void menuInicial(){
        //System.out.println("Cargando los archivos...");
        //listas.cargarListasConJSON();
        int opcion = 0;
        do{
            System.out.println("1- Ingresar");
            System.out.println("2- Ingresar como admin");
            System.out.println("3- Registrarse");
            System.out.println("0- Salir");
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
                    if(ingresarAdmin()){
                        menuAdmin();
                    }else{
                        System.out.println("Contrasenia incorrecta, volvera al menu inicial");
                    }
                    break;
                case 3:
                    if(guardarCliente()){
                        System.out.println("Usuario registrado con exito");
                    }else{
                        System.out.println("No se pudo registrar su usuario, vuelva a intentarlo");
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción incorrecta, vuelva a ingresarla");
            }
        }while (opcion != 0);
    }

    public void menuCliente(){
        int opcion = 0;
        do{
            System.out.println("1- Hacer una reserva");
            System.out.println("2- Dar de baja una reserva");
            System.out.println("3- Ver historial de viajes");
            System.out.println("0- Volver");
            opcion = scan.nextInt();

            switch (opcion){
                case 1:
                    System.out.println(reservar());
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción incorrecta, vuelva a ingresarla");
            }
        }while(opcion != 0);
    }

    private void menuAdmin()  {
        int respuesta;

        do{
            System.out.println("\n||==============ADMIN==============|| ");
            System.out.println("[1]- Ver lista de Usuarios Ingresados");
            System.out.println("[2]- Ver lista de Aviones segun su Fecha");
            System.out.println("[0]- Volver");
            System.out.println("||=================================||");

            respuesta = scan.nextInt();

            switch (respuesta){
                case 1:
                    System.out.println("||Lista de usuarios|| ");
                    UsuariosLista();
                    break;
                case 2:
                    System.out.println("||Lista de Aviones disponibles para la Fecha|| ");
                    // System.out.println(admin.verAvionesPorFecha(listas.getListaAviones()));
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcion erronea! Vuelva a elegir una opcion...");
                    break;
            }
        }while (respuesta != 0);
    }

    //Métodos que consumen los menus
    public boolean ingresar(int dni){
        boolean flag = ingreso.ingresar(dni, listas.getListaClientes());
        return flag;
    }

    public boolean ingresarAdmin(){
        boolean flag = false;
        System.out.println("Ingrese su DNI: ");
        int dniAdmin = scan.nextInt();
        flag = ingreso.ingresarAdmin(dniAdmin);
        return flag;
    }

    public StringBuilder reservar(){
        StringBuilder msj = new StringBuilder();
        Reserva r = reserva.reservar();
        System.out.println("\nAviones disponibles:\n");
        msj = listas.validarVuelosDisponibles(r);
        return msj;
    }

    public boolean guardarCliente(){
        boolean flag = false;
        Cliente cliente = new Cliente();
        flag = listas.agregarCliente(ingreso.registrarse(cliente));
        return flag;
    }

    public void UsuariosLista(){
        admin.verListaUsuarios(listas.getListaClientes());
    }
}
