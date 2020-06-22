package com.UTN;

import java.util.ArrayList;

public class AeroTaxi {
    private ArrayList<Avion> listaAviones;
    //private ArrayList<Reserva> listaReservas;
    private ArrayList<Persona> listaClientes;

    public AeroTaxi(){
        listaAviones = new ArrayList<Avion>();
        //listaReservas = new ArrayList<Reserva>();
        listaClientes = new ArrayList<Persona>();
    }

    public boolean agregarAvion(Avion avion){
        boolean flag = false;
        if(avion != null){
            listaAviones.add(avion);
            flag = true;
        }
        return flag;
    }

    public void cargarArrayList(){
        ManejoArchivo.arrayListToJSON("C:\\Users\\Intel\\IdeaProjects\\AeroTaxi\\file\\aviones.json", getListaAviones());
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

    public ArrayList<Persona> getListaClientes() {
        return listaClientes;
    }
}
