package com.UTN;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Date;

public class Avion implements Serializable {
    private int capacidadCombustible;
    private int costoPorKm;
    private int capacidadMaximaPasajeros;
    private int velocidadMaxima;
    private String tipoPropulsion;
    private HashSet<Reserva> listaFechas;

    Avion(){}

    Avion(int capacidadCombustible, int costoPorKm, int capacidadMaximaPasajeros, int velocidadMaxima, String tipoPropulsion) {
        this.capacidadCombustible = capacidadCombustible;
        this.costoPorKm = costoPorKm;
        this.capacidadMaximaPasajeros = capacidadMaximaPasajeros;
        this.velocidadMaxima = velocidadMaxima;
        this.tipoPropulsion = tipoPropulsion;
        listaFechas = new HashSet<Reserva>();
    }

    public void agregarReserva(Reserva reserva){
        if(reserva != null){
            listaFechas.add(reserva);
        }
    }

    public boolean comprobarFechasPorAvion(Date fecha){
        boolean flag = false;
        if(fecha != null){
            for(Reserva r: listaFechas){
                if(fecha == r.getFechaReservada()){
                    flag = true;
                }
            }
        }
        return flag;
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
        return "\nAvion:\n" + "Capacidad combustible: " +capacidadCombustible+ ", Costo por km: " +costoPorKm+ ", Capacidad maxima de pasajeros: " +capacidadMaximaPasajeros+ ", Velocidad maxima: " +velocidadMaxima;
    }
}
