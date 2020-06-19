package com.UTN;

import java.util.ArrayList;
import java.util.Scanner;

public class LogIn {

    Scanner scan = new Scanner(System.in);

    //Recibimos la lista de usuarios registrados para poder comparar con el dni
    //que se ingresa por teclado, si coincide el usuario ya se encontraba registrado,
    //sino se tendrá que registrar
    public boolean ingresar(int dni, ArrayList<Persona> listaCliente){
        boolean flag = false;
        for(Persona p: listaCliente){
            if(p.getDni() == dni){
                flag = true;
            }
        }
        return flag;
    }

    //Si se ingresa el "DNI" que establecimos para el admin se ingresara al menú del admin
    public boolean ingresarAdmin(int dni){
        boolean flag = false;
        if(dni == 1905){
            flag = true;
        }
        return flag;
    }

    public Persona registrarse(){
        Persona persona = null;
        System.out.println("-Ingrese su nombre: ");
        persona.setNombre(scan.nextLine());
        System.out.println("\n-Ingrese su apellido: ");
        persona.setApellido(scan.nextLine());
        System.out.println("\n-Ingrese su DNI:");
        persona.setDni(scan.nextInt());
        System.out.println("\n-Ingrese su edad: ");
        persona.setEdad(scan.nextInt());

        return persona;
    }
}


