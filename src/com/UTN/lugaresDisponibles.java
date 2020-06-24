package com.UTN;

public enum lugaresDisponibles {
    BSAS ("Buenos Aires"),
    CORDOBA ("Cordoba"),
    SANCHI ("Santiago de Chile"),
    MONT ("Montevideo");

    String nombre;

    lugaresDisponibles(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }


}
