package com.UTN;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Admin{
    Scanner scan = new Scanner(System.in);
    private Date FechaAgregada;

    public void verListaUsuarios(ArrayList<Persona> listaClientes){
        for(Persona a : listaClientes){
            System.out.println(a.toString());
        }
    }

    //No funciona correctamente
    /*public StringBuilder verAvionesPorFecha(ArrayList<Avion> listaAviones) {
        StringBuilder msj = new StringBuilder();
        try {
            System.out.println("Ingrese la fecha en la que desea viajar (mm/dd/yyyy): ");
            String input = scan.nextLine();
            Date fecha = new SimpleDateFormat("dd/MM/yyyy").parse(input);
            for (Avion a : listaAviones) {
                if (a.comprobarFechasPorAvion(fecha)) {
                    if (a instanceof Gold) {
                        msj.append(a.toString());
                    } else if (a instanceof Silver) {
                        msj.append(a.toString());
                    } else {
                        msj.append(a.toString());
                    }
                }
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return msj;
    }*/

    public Date getFechaAgregada() {
        return FechaAgregada;
    }

    public void setFechaAgregada(Date fechaAgregada) {
        FechaAgregada = fechaAgregada;
    }
}
