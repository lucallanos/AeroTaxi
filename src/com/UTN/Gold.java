package com.UTN;


import java.io.Serializable;

public class Gold extends Avion implements Serializable {
    private boolean catering;
    private boolean wifi;

    public Gold(){
    }

    public Gold(int capacidadCombustible, int costoPorKm, int capacidadMaximaPasajeros, int velocidadMaxima, String tipoPropulsion, boolean catering, boolean wifi) {
        super(capacidadCombustible, costoPorKm, capacidadMaximaPasajeros, velocidadMaxima, tipoPropulsion);
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
