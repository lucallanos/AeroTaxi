package com.UTN;

import java.util.ArrayList;
import java.util.HashSet;

public class Avion {
    private int capacidadCombustible;
    private int costoPorKm;
    private int capacidadMaximaPasajeros;
    private int velocidadMaxima;
    private String tipoPropulsion;
    private HashSet<Reserva> listaFechas;

    public Avion(){

    }

    public Avion(int capacidadCombustible, int costoPorKm, int capacidadMaximaPasajeros, int velocidadMaxima, String tipoPropulsion) {
        this.capacidadCombustible = capacidadCombustible;
        this.costoPorKm = costoPorKm;
        this.capacidadMaximaPasajeros = capacidadMaximaPasajeros;
        this.velocidadMaxima = velocidadMaxima;
        this.tipoPropulsion = tipoPropulsion;
        listaFechas = new HashSet<>();
    }

    public int getCapacidadCombustible() {
        return capacidadCombustible;
    }

    public void setCapacidadCombustible(int capacidadCombustible) {
        this.capacidadCombustible = capacidadCombustible;
    }

    public int getCostoPorKm() {
        return costoPorKm;
    }

    public void setCostoPorKm(int costoPorKm) {
        this.costoPorKm = costoPorKm;
    }

    public int getCapacidadMaximaPasajeros() {
        return capacidadMaximaPasajeros;
    }

    public void setCapacidadMaximaPasajeros(int capacidadMaximaPasajeros) {
        this.capacidadMaximaPasajeros = capacidadMaximaPasajeros;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getTipoPropulsion() {
        return tipoPropulsion;
    }

    public void setTipoPropulsion(String tipoPropulsion) {
        this.tipoPropulsion = tipoPropulsion;
    }

    @Override
    public String toString() {
        return "Avion [" +
                " CapacidadCombustible: " + capacidadCombustible +
                "|| Costo por Km: " + costoPorKm +
                "|| Capacidad Maxima Pasajeros: " + capacidadMaximaPasajeros +
                "|| VelocidadMaxima: " + velocidadMaxima +
                "|| TipoPropulsion: " + tipoPropulsion ;
    }
}
