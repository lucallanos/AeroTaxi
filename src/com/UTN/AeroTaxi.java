package com.UTN;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;

public class AeroTaxi implements Serializable {
    private ArrayList<Avion> listaAviones;
    //private ArrayList<Reserva> listaReservas;
    private HashSet<Persona> listaClientes;

    public AeroTaxi(){
        listaAviones = new ArrayList<Avion>();
        //listaReservas = new ArrayList<Reserva>();
        listaClientes = new HashSet<Persona>();
    }

    public boolean agregarAvion(Avion avion){
        boolean flag = false;
        if(avion != null){
            listaAviones.add(avion);
            ManejoArchivos.escribir("Aviones.json", avion);
            flag = true;
        }
        return flag;
    }

    /*
    public boolean agregarReserva(Reserva reserva){
        boolean flag = false;
        if(reserva != null){
            listaReservas.add(reserva);
            flag = true;
        }
        return flag;
    }*/

    public boolean agregarCliente(Cliente cliente){
        boolean flag = false;
        if(cliente != null){
            listaClientes.add(cliente);
            flag = true;
        }
        return flag;
    }

    //Getters
    public ArrayList<Avion> getListaAviones() {
        return listaAviones;
    }

    /*public ArrayList<Reserva> getListaReservas() {
        return listaReservas;
    }*/

    public HashSet<Persona> getListaClientes() {
        return listaClientes;
    }
}
