package com.UTN;

import java.io.Serializable;
import java.util.HashSet;

public class Bronze extends Avion implements Serializable {

    public Bronze(){
    }

    public Bronze(int capacidadCombustible, int costoPorKm, int capacidadMaximaPasajeros, int velocidadMaxima, String tipoPropulsion) {
        super(capacidadCombustible, costoPorKm, capacidadMaximaPasajeros, velocidadMaxima, tipoPropulsion);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
