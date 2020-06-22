package com.UTN;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class ManejoArchivo {

    //Primero comprobamos que exista el archivo, si no existe lo creamos y luego guardamos
    //la lista que ya cargamos anteriormente y que se recibe por parámetro
    public static void arrayListToJSON(String nombreArchivo, ArrayList lista) {
        File archivo = new File(nombreArchivo);
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (archivo.exists()) {
            try {
                ObjectMapper mapper = new ObjectMapper();
                mapper.writeValue(archivo, lista);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {System.out.println("El archivo no existe.");}
    }

    /*public static void verLista(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        if(archivo.exists()){
            try{
                ObjectMapper mapper = new ObjectMapper();
                ArrayList lista = mapper.readValue(archivo, ArrayList.class);
                System.out.println(lista.toString());
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }*/

    public static <T>ArrayList<T> volcarArchivo(String nombreArchivo) throws IOException, ClassNotFoundException
    {
        File archivo = new File(nombreArchivo);
        ArrayList<T> lista = null;
        if(archivo.exists()){
            ObjectMapper mapper = new ObjectMapper();
            lista = (ArrayList<T>) mapper.readValue(archivo, ArrayList.class);
        }
        return lista;
    }

}
