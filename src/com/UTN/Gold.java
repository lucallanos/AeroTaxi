package com.UTN;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("gold")

public class Gold extends Avion {
    private boolean catering;
    private boolean wifi;

    public Gold(){}

    public Gold(int capacidadCombustible, int costoPorKm, int capacidadMaximaPasajeros, int velocidadMaxima, String tipoPropulsion, String idAvion, boolean catering, boolean wifi) {
        super(capacidadCombustible, costoPorKm, capacidadMaximaPasajeros, velocidadMaxima, tipoPropulsion, idAvion);
        this.catering = catering;
        this.wifi = wifi;

    }

    public boolean getCatering() {
        return catering;
    }

    public void setCatering(boolean catering) {
        this.catering = catering;
    }

    public boolean getWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    @Override
    public String toString() {
        return super.toString() + ", Gold: " + ", Catering: " + catering + ", Wifi:" + wifi;
    }
}
