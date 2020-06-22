package com.UTN;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ManejoArchivos {

    public static void escribir(String nombreArchivo, Avion avion) {

        try {
            File file = new File(nombreArchivo);
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(file, avion);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void leer(String nombreArchivo){
        File file = new File(nombreArchivo);
        if(file.exists()){
            try {
                ObjectMapper mapper = new ObjectMapper();
                AeroTaxi obj = mapper.readValue(file, AeroTaxi.class);
                System.out.println("JSON: " +obj.toString());
            }catch(IOException e){
                e.printStackTrace();
            }
        }

    }
}
