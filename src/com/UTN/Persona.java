package com.UTN;

public abstract class Persona{
    private String nombre;
    private String apellido;
    private int dni;
    private int edad;

    //Constructores
    Persona(){}

    Persona(String nombre, String apellido, int dni, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
    }

    //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni){
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona: " +
                "[ Nombre: " + nombre +
                "|| Apellido: " + apellido +
                "|| Dni: " + dni +
                "|| Edad: " + edad +
                " ]";
    }
}
