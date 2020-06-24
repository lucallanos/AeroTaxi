package com.UTN;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

public class AeroTaxi {
    //Listas
    private ArrayList<Avion> listaAviones;
    private ArrayList<Reserva> listaReservas;
    private ArrayList<Persona> listaClientes;

    //Constructores
    public AeroTaxi(){
        listaAviones = new ArrayList<Avion>();
        listaReservas = new ArrayList<Reserva>();
        listaClientes = new ArrayList<Persona>();
    }

    //Métodos
    public void cargarListasConJSON(){
        listaAviones = ManejoArchivo.volcarArchivo("C:\\Users\\Intel\\IdeaProjects\\AeroTaxi\\file\\aviones.json", Avion.class);
        //listaReservas = ManejoArchivo.volcarArchivo("C:\\Users\\Intel\\IdeaProjects\\AeroTaxi\\file\\reservas.json", Reserva.class);
        //listaClientes = ManejoArchivo.volcarArchivo("C:\\Users\\Intel\\IdeaProjects\\AeroTaxi\\file\\clientes.json", Persona.class);
    }

    public boolean agregarAvion(Avion avion){
        boolean flag = false;
        if(avion != null){
            listaAviones.add(avion);
            flag = true;
        }
        return flag;
    }

    public boolean agregarReserva(Reserva reserva){
        boolean flag = false;
        if(reserva != null){
            listaReservas.add(reserva);
            flag = true;
        }
        return flag;
    }

    public boolean agregarCliente(Cliente cliente){
        boolean flag = false;
        if(cliente != null){
            listaClientes.add(cliente);
            flag = true;
        }
        return flag;
    }

    public void cargarArrayList(){
        ManejoArchivo.arrayListToJSON("C:\\Users\\Intel\\IdeaProjects\\AeroTaxi\\file\\aviones.json", getListaAviones());
    }

    public StringBuilder validarVuelosDisponibles(Reserva reserva){
        StringBuilder msj = new StringBuilder();
        for(Avion a: listaAviones){
            System.out.println("Entre");
            for(Reserva r: listaReservas){
                if(reserva.getFechaReservada().compareTo(r.getFechaReservada()) != 0){
                    if(a instanceof Gold){
                        msj.append(a.toString());
                    }else if(a instanceof Silver){
                        msj.append(a.toString());
                    }else{
                        msj.append(a.toString());
                    }
                }
            }
        }
        return msj;
    }

    public StringBuilder mostrarLista(){
        StringBuilder msj = new StringBuilder();
        for(Avion a: listaAviones){
            if(a instanceof Gold){
                msj.append(a.toString());
            }else if(a instanceof Silver){
                msj.append(a.toString());
            }else{
                msj.append(a.toString());
            }
        }
        return msj;
    }

    //Getters
    public ArrayList<Avion> getListaAviones() {
        return listaAviones;
    }

    public ArrayList<Reserva> getListaReservas() {
        return listaReservas;
    }

    public ArrayList<Persona> getListaClientes() {
        return listaClientes;
    }
}
