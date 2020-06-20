package com.UTN;

import java.util.HashSet;

public class Silver extends Avion{
    private boolean catering;

    public Silver(){
    }

    public Silver(int capacidadCombustible, int costoPorKm, int capacidadMaximaPasajeros, int velocidadMaxima, String tipoPropulsion, boolean catering) {
        super(capacidadCombustible, costoPorKm, capacidadMaximaPasajeros, velocidadMaxima, tipoPropulsion);
        this.catering = catering;
    }

    public boolean getCatering() {
        return catering;
    }

    public void setCatering(boolean catering) {
        this.catering = catering;
    }

    @Override
    public String toString() {
        return  "Silver: " + super.toString() +"|| Catering: " + catering + " ]";
    }
}