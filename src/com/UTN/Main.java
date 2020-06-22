package com.UTN;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Menu menus = new Menu();
        AeroTaxi hangar = new AeroTaxi();
        ArrayList<Avion> lista = null;
        try {
            lista = ManejoArchivo.volcarArchivo("C:\\Users\\Intel\\IdeaProjects\\AeroTaxi\\file\\aviones.json");
        }catch (IOException  | ClassNotFoundException e){
            e.printStackTrace();
        }

        System.out.println(lista);
        /*
        Gold avionG = new Gold(100, 300, 10, 1000, "Caca", true, true);
        hangar.agregarAvion(avionG);
        Gold avionG2 = new Gold(100, 300, 10, 1000, "Caca", true, false);
        hangar.agregarAvion(avionG2);
        Silver avionS = new Silver(80, 200, 5, 800, "Pis", true);
        hangar.agregarAvion(avionS);
        Silver avionS2 = new Silver(80, 200, 5, 800, "Pis", true);
        hangar.agregarAvion(avionS2);
        Silver avionS3 = new Silver(80, 200, 5, 800, "Pis", true);
        hangar.agregarAvion(avionS3);
        Bronze avionB = new Bronze(60, 150, 3, 500, "Pajita");
        hangar.agregarAvion(avionB);
        Bronze avionB2 = new Bronze(60, 150, 3, 500, "Pajita");
        hangar.agregarAvion(avionB2);
        Bronze avionB3 = new Bronze(60, 150, 3, 500, "Pajita");
        hangar.agregarAvion(avionB3);
        Bronze avionB4 = new Bronze(60, 150, 3, 500, "Pajita");
        hangar.agregarAvion(avionB4);
        Bronze avionB5 = new Bronze(60, 150, 3, 500, "Pajota");
        hangar.agregarAvion(avionB5);
        ManejoArchivo.arrayListToJSON("C:\\Users\\Intel\\IdeaProjects\\AeroTaxi\\file\\aviones.json", hangar.getListaAviones());*/
    }
}
