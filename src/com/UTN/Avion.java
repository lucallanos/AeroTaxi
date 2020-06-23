package com.UTN;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "typeName")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Gold.class),
        @JsonSubTypes.Type(value = Silver.class),
        @JsonSubTypes.Type(value = Bronze.class)})
public class Avion {
    //Atributos
    private int capacidadCombustible;
    private int costoPorKm;
    private int capacidadMaximaPasajeros;
    private int velocidadMaxima;
    private String tipoPropulsion;
    private String idAvion;

    //Constructores
    Avion(){}

    Avion(int capacidadCombustible, int costoPorKm, int capacidadMaximaPasajeros, int velocidadMaxima, String tipoPropulsion, String idAvion) {
        this.capacidadCombustible = capacidadCombustible;
        this.costoPorKm = costoPorKm;
        this.capacidadMaximaPasajeros = capacidadMaximaPasajeros;
        this.velocidadMaxima = velocidadMaxima;
        this.tipoPropulsion = tipoPropulsion;
        this.idAvion = idAvion;
    }

    //Getters y setters
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

    public String getIdAvion() {
        return idAvion;
    }

    public void setIdAvion(String idAvion) {
        this.idAvion = idAvion;
    }

    @Override
    public String toString() {
        return "\nAvion:\n" + "Capacidad combustible: " +capacidadCombustible+ ", Costo por km: " +costoPorKm+ ", Capacidad maxima de pasajeros: " +capacidadMaximaPasajeros+ ", Velocidad maxima: " +velocidadMaxima;
    }
}
