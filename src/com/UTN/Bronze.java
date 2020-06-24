package com.UTN;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("bronze")

public class Bronze extends Avion {

    public Bronze(){}

    public Bronze(int capacidadCombustible, int costoPorKm, int capacidadMaximaPasajeros, int velocidadMaxima, String tipoPropulsion, String idAvion) {
        super(capacidadCombustible, costoPorKm, capacidadMaximaPasajeros, velocidadMaxima, tipoPropulsion, idAvion);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
