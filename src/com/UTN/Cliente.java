package com.UTN;

import java.util.ArrayList;

public class Cliente extends Persona{
    private ArrayList<Reserva> historialReservas;

    Cliente(){
        super();
    }

    Cliente(String nombre, String apellido, int dni, int edad){
        super(nombre, apellido, dni, edad);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
