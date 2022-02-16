package com.company.datoprimitivovsobjeto;

import java.util.Objects;

public class JustAObject {
    private String name;
    private String speciality;

    JustAObject() { //El constructor nunca regresara un valor.
        System.out.println("Construyendo el objeto Doctor Default");
        name = "Nombre por defecto";
        speciality = "Especialidad por defecto";
    }
    JustAObject(String name, String speciality) {
        this.name = name;
        System.out.println("El nombre del doctor es: "+ name);
        this.speciality = speciality;
    }
    String getName() {
        return name;
    }
    void setName(String name) {
        if (!Objects.equals(name, ""))
            this.name = name;
        else
            System.out.println("Error, please introduce a valid name!");
    }
    @Override
    public String toString() {
        return "Name: "+name+", Speciality: "+speciality;
    }
}

