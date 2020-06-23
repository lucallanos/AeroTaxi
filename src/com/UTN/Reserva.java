package com.UTN;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Reserva {
    private Date fechaReservada;
    private String origen;
    private String destino;
    private int cantidadAcompaniantes;
    private int idReserva;
    private String idAvion;
    Scanner scan, scanInt;

    //Constructores
    Reserva(){
        scan = new Scanner(System.in);
        scanInt = new Scanner(System.in);
    }

    //Métodos
    //Pedimos los datos necesarios para realizar la reserva y validamos que los mismos sean correctos, caso contrario
    //se pedirá que se vuelvan a ingresar
    public Reserva reservar(){
        boolean flag = false, flagMetodo = false;
        try {
            do{
                System.out.println("Ingrese la fecha en la que desea viajar (dd/mm/yyyy): ");
                String input = scan.nextLine();
                setFechaReservada(fechaReservada = new SimpleDateFormat("dd/MM/yyyy").parse(input));

                //Validación para comprobar que el lugar que ingrese se encuentre entre los disponibles para
                //realizar los vuelos
                do{
                    System.out.println("Ingrese su lugar de origen: ");
                    flag = setOrigen(scan.nextLine());
                    if(!flag){
                        System.out.println("\nLo sentimos, por el momento no trabajamos con ese lugar, estos son los lugares disponibles:\n-Buenos Aires\n-Cordoba\n-Santiago de Chile\n-Montevideo");
                    }
                }while(!flag);

                do{
                    System.out.println("Ingrese su lugar de destino: ");
                    flag = setDestino(scan.nextLine());
                    if(!flag){
                        System.out.println("\nLo sentimos, por el momento no trabajamos con ese lugar, estos son los lugares disponibles:\n-Buenos Aires\n-Cordoba\n-Santiago de Chile\n-Montevideo");
                    }
                }while(!flag);

                System.out.println("Ingrese la cantidad de personas que van a viajar (contadose usted): ");
                setCantidadAcompaniantes(scanInt.nextInt());

                //Por ultimo comprobamos que origen y destino no se hayan repetido y que la cantidad de acompañantes no supere la tripulación maxima
                //de los aviones Gold, que son los que más personas pueden llevar
                flagMetodo = validacionesReserva(getOrigen(), getDestino(), getCantidadAcompaniantes());
                if(!flagMetodo){
                    System.out.println("Lo sentimos, algún dato ingresado no fue correcto, por favor vuelva a ingresarlos.\n");
                }
            }while(!flagMetodo);
        }catch (ParseException e){
            e.printStackTrace();
        }
        return this;
    }

    //Hacemos las validaciones de que tanto el lugar de origen como el lugar de destino no sean
    //el mismo, y que la cantidad de personas sea menor que el maximo el cual nuestros aviones mas
    //grandes puedan aceptar
    public boolean validacionesReserva(String origen, String destino, int cantPersonas){
        boolean flag = false;
        if(origen.compareTo(destino) != 0 && cantPersonas <= 10){
            flag = true;
        }
        return flag;
    }

    //Getters y setters
    public Date getFechaReservada() {
        return fechaReservada;
    }

    public void setFechaReservada(Date fechaReservada) {
        this.fechaReservada = fechaReservada;
    }

    public String getOrigen() {
        return origen;
    }

    public boolean setOrigen(String origen) {
        boolean flag = false;
        for(lugaresDisponibles lug: lugaresDisponibles.values()){
            if(origen.compareTo(lug.getNombre()) == 0){
                this.origen = origen;
                flag = true;
            }
        }
        return flag;
    }

    public String getDestino() {
        return destino;
    }

    public boolean setDestino(String destino) {
        boolean flag = false;
        for(lugaresDisponibles lug: lugaresDisponibles.values()){
            if(destino.compareTo(lug.getNombre()) == 0){
                this.destino = destino;
                flag = true;
            }
        }
        return flag;
    }

    public int getCantidadAcompaniantes() {
        return cantidadAcompaniantes;
    }

    public void setCantidadAcompaniantes(int cantidadAcompaniantes) {
        this.cantidadAcompaniantes = cantidadAcompaniantes;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public String getIdAvion() {
        return idAvion;
    }

    public void setIdAvion(String idAvion) {
        this.idAvion = idAvion;
    }

    @Override
    public String toString() {
        return "Reserva:\n" + "Fecha: " +fechaReservada+ ", Origen: " +origen+ ", Destino: " +destino+ ", Cant acompañantes: " + cantidadAcompaniantes;
    }
}


