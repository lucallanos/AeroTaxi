package com.UTN;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.util.JSONPObject;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class ManejoArchivo {
    public static final ObjectMapper JSON_MAPPER = new ObjectMapper();

    //Primero comprobamos que exista el archivo, si no existe lo creamos y luego guardamos
    //la lista que ya cargamos anteriormente y que se recibe por parámetro
    public static void arrayListToJSON(String nombreArchivo, ArrayList<Avion> lista) {
        File archivo = new File(nombreArchivo);
        //JSON_MAPPER.enableDefaultTyping();
        if(!archivo.exists()){
            try {
                archivo.createNewFile();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        if (archivo.exists()) {
            try {
                JSON_MAPPER.writeValue(archivo, lista);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {System.out.println("El archivo no existe.");}
    }

    //Mediante un ArrayList genérico
    public static <T> ArrayList<T> volcarArchivo(String path, Class<T> clazz){
        File archivo = new File(path);
        ArrayList<T> listaP = null;
        JSON_MAPPER.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        JSON_MAPPER.setVisibilityChecker(VisibilityChecker.Std.defaultInstance().withFieldVisibility(JsonAutoDetect.Visibility.ANY));
        try {
            listaP = JSON_MAPPER.readValue(archivo, JSON_MAPPER.getTypeFactory().constructCollectionType(ArrayList.class, clazz));
        }catch(IOException e){
            e.printStackTrace();
        }
        return listaP;
    }
}
