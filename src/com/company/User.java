package com.company;

import java.util.Objects;

public abstract class User {
    protected static int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    /**
     * Constructor que se encargara de asignar el nombre y email de la cuenta, es de la clase User
     * @param name Sera el nombre de nuestro usuario
     * @param email Sera para registrar el mail que se le pase como parametro
     * */
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    /**
     * Se obtiene el ID del usuario
     * @return {@code id} si es un ID valido, pero si es menor-igual a 0
     * se retornara {@code -1} debido a que es un ID que no existe
     * @throws Error si es un ID invalido*/
    public int getId() {
        if (id>0)
            return id;
        else
            System.out.println("Error!, please stop, maintain the system, test this part, has encountered an error so big");
        return -1;
    }

    /**
     * Se asignara un ID al objeto actual
     * @param id Este sera el ID elegido como remplazo del anterior
     * @throws Error si es un ID invalido
     * */
    public void setId(int id) {
        if (id>0)
            this.id = id;
        else
            System.out.println("Error!, You don't put an invalid ID");
    }

    public String getName() {
        if (!Objects.equals(name, ""))
            return name;
        else
            return "Error, this object has an invalid name!";
    }

    public void setName(String name) {
        if (!Objects.equals(name, ""))
            this.name = name;
        else
            System.out.println("Introduce a valid name!");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Name: "+name+", Email: "+email+" ID: "+id;
    }

    public abstract String showDataUser();
}
