package com.UTN;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Menu menus = new Menu();
        menus.menuInicial();
        //El código se rompe cuando se intenta bajar del archivo JSON a un ArrayList, lo intentamos solucionar y lo que
        //pudimos conseguir fue que se baje bien pero solo nos mostraba los atributos de la clase padre, por lo que no
        //nos servia y volvimos a dejarlo como estaba

        //Carga de los archivos
        /*AeroTaxi hangar = new AeroTaxi();
        ArrayList<Avion> lista = null;
        try {
            lista = ManejoArchivo.volcarArchivo("C:\\Users\\Intel\\IdeaProjects\\AeroTaxi\\file\\aviones.json");
        }catch (IOException  | ClassNotFoundException e){
            e.printStackTrace();
        }
        System.out.println(lista);
        AeroTaxi hangar = new AeroTaxi();
        Gold avionG = new Gold(100, 300, 10, 1000, "Motor a Reaccion", "1G", true, true);
        hangar.agregarAvion(avionG);
        Gold avionG2 = new Gold(100, 300, 10, 1000, "Motor a Reaccion", "2G", true, false);
        hangar.agregarAvion(avionG2);
        Silver avionS = new Silver(80, 200, 5, 800, "Motor a Helice", "1S", true);
        hangar.agregarAvion(avionS);
        Silver avionS2 = new Silver(80, 200, 5, 800, "Motor a Helice", "2S", true);
        hangar.agregarAvion(avionS2);
        Silver avionS3 = new Silver(80, 200, 5, 800, "Motor a Helice", "3S", true);
        hangar.agregarAvion(avionS3);
        Bronze avionB = new Bronze(60, 150, 3, 500, "Motor de Pistones", "1B");
        hangar.agregarAvion(avionB);
        Bronze avionB2 = new Bronze(60, 150, 3, 500, "Motor de Pistones", "2B");
        hangar.agregarAvion(avionB2);
        Bronze avionB3 = new Bronze(60, 150, 3, 500, "Motor de Pistones", "3B");
        hangar.agregarAvion(avionB3);
        Bronze avionB4 = new Bronze(60, 150, 3, 500, "Motor de Pistones", "4B");
        hangar.agregarAvion(avionB4);
        Bronze avionB5 = new Bronze(60, 150, 3, 500, "Motor de Pistones", "5B");
        hangar.agregarAvion(avionB5);
        ManejoArchivo.arrayListToJSON("C:\\Users\\Intel\\IdeaProjects\\AeroTaxi\\file\\aviones.json", hangar.getListaAviones());
        AeroTaxi lista = new AeroTaxi();
        lista.cargarListasConJSON();
        System.out.println(lista.mostrarLista());*/
    }
}
