package com.UTN;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


public class LogIn {

    public LogIn(){}

    Scanner scan = new Scanner(System.in);

    //Recibimos la lista de usuarios registrados para poder comparar con el dni
    //que se ingresa por teclado, si coincide el usuario ya se encontraba registrado,
    //sino se tendrá que registrar
    public boolean ingresar(int dni, ArrayList<Persona> listaClientes){
        boolean flag = false;
        for(Persona p: listaClientes){
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

    public Cliente registrarse(Cliente cliente){
        System.out.println("-Ingrese su nombre: ");
        cliente.setNombre(scan.next());
        System.out.println("\n-Ingrese su apellido: ");
        cliente.setApellido(scan.next());
        System.out.println("\n-Ingrese su DNI:");
        cliente.setDni(scan.nextInt());
        System.out.println("\n-Ingrese su edad: ");
        cliente.setEdad(scan.nextInt());

        return cliente;
    }
}


