package com.UTN;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Reserva implements Serializable {
    private Date fechaReservada;
    private String origen;
    private String destino;
    private int cantidadAcompaniantes;
    private int idReserva;
    Scanner scan, scanInt;

    Reserva(){
        scan = new Scanner(System.in);
        scanInt = new Scanner(System.in);
    }

    //Métodos
    public StringBuilder reservar(ArrayList<Avion> listaAviones){
        StringBuilder msj = new StringBuilder();
        try {
            System.out.println("Ingrese la fecha en la que desea viajar (mm/dd/yyyy): ");
            String input = scan.nextLine();
            setFechaReservada(fechaReservada = new SimpleDateFormat("dd/MM/yyyy").parse(input));
            System.out.println("Estos son los vuelos disponibles para esa fecha:\n");
            msj = (comprobarVuelosDisponibles(fechaReservada, listaAviones));
            /*System.out.println("Ingrese su lugar de origen: ");
            setOrigen(scan.nextLine());
            System.out.println("Ingrese su lugar de destino: ");
            setDestino(scan.nextLine());*/
        }catch (ParseException e){
            e.printStackTrace();
        }
        return msj;
    }
/*
    public StringBuilder DarBajadeReserva(ArrayList<Avion> ListaAciones){
        StringBuilder msj =  new StringBuilder();
    }
*/
    public StringBuilder comprobarVuelosDisponibles(Date fechaIngresada, ArrayList<Avion> listaAviones){
        StringBuilder msj = new StringBuilder();
        for(Avion a: listaAviones){
            if(!a.comprobarFechasPorAvion(fechaIngresada)){
                if(a instanceof Gold){
                    msj.append(a.toString());
                }else if(a instanceof Silver){
                    msj.append(a.toString());
                }else{
                    msj.append(a.toString());
                }
            }
        }
        return msj;
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

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
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


    @Override
    public String toString() {
        return "Reserva:\n" + "Fecha: " +fechaReservada+ ", Origen: " +origen+ ", Destino: " +destino+ ", Cant acompañantes: " +cantidadAcompaniantes;
    }
}

/*
    public double calcularCostoTotal(double totalGasto){
        return totalGasto = (cantidadKms * costoporKms) + (cantidadPasajeros * 3500) + (tarifa);
    }

 */

