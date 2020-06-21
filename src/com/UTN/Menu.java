package com.UTN;

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
    public void menuInicial(){
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
                    System.out.println(reservar(listas.getListaAviones()));
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
}
