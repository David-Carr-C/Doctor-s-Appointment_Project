package com.company;

import java.util.Objects;

/**
 * <p>La clase usuario sera la generalizacion entre las demas clases que requieran un login e informacion personal.</p>
 * <p>Nuestro contador/identificador de esta clase sera {@code id}.</p>
 * <p>Tanto {@code name}, {@code email}, {@code address} y {@code phoneNumber} seran aquella informacion personal que
 * el usuario podra tener.</p>
 * */
public abstract class User {

    /**
     * Este sera el identificador de la instancia de la clase
     * */
    protected static int id;

    /**
     * Sera el nombre del usuario
     * */
    private String name;

    /**
     * Sera el email del usuario
     * */
    private String email;

    /**
     * Sera la direccion del usuario, debera ser obtenida y registrada con getters y setters
     * */
    private String address;

    /**
     * El numero de telefono solo podra ser accedido con getters y setters, y no esta disponible aun
     * en un constructor
     * */
    private String phoneNumber;

    /**
     * Constructor que se encargara de asignar el nombre y email de la cuenta, es de la clase User y estos seran
     * los requisitos minimos para optar por este constructor
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

    /**
     * Se obtendra el nombre del usuario
     * @return {@code name} Si el nombre del usuario tiene letras o no es nulo
     * @throws Error si el nombre esta vacio o es null
     * */
    public String getName() {
        if (Objects.equals(name, "") || Objects.equals(name,null))
            return "Error, this object has an invalid name!";
        else
            return name;
    }

    /**
     * Se asginara un nombre al usuario
     * @param name Sera el nuevo nombre que se le asignara
     * @throws Error si el name es una string vacia
     * */
    public void setName(String name) {
        if (!Objects.equals(name, ""))
            this.name = name;
        else
            System.out.println("Introduce a valid name!");
    }

    /**
     * Se obtendra el email del usuario
     * @return {@code email} Sera el email del usuario
     * */
    public String getEmail() {
        return email;
    }

    /**
     * Se le asignara un email al usuario
     * @param email sera el nuevo email que tendra el usuario
     * @throws Error si se le intenta asignar un email nulo o vacio
     * */
    public void setEmail(String email) {
        if (Objects.equals(email,null) || email.equals("")) {
            System.out.println("Introduce a valid email!");
        } else {
            this.email = email;
        }
    }

    /**
     * Obtendra la direccion del usuario
     * @return {@code address} sera la direccion actual del usuario
     * */
    public String getAddress() {
        return address;
    }

    /**
     * Se le asignara una nueva direccion al usuario
     * @param address sera la nueva direccion a asignar
     * @throws Error si la direccion esta vacia o es nula
     * */
    public void setAddress(String address) {
        if (Objects.equals(address,null) || Objects.equals(address,"")) {
            System.out.println("Introduce a valid address");
        } else {
            this.address = address;
        }
    }

    /**
     * Se obtendra el numero de telefono del usuario
     * @return {@code phoneNumber} se retornara el numero de telefono
     * */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Se le asignara un nuevo numero de telefono al usuario
     * @param phoneNumber sera el nuevo numero telefonico a asignar, en formato de String
     * @throws Error si el numero de telefono es una cadena vacia o es nulo
     * */
    public void setPhoneNumber(String phoneNumber) {
        if (Objects.equals(phoneNumber,null) || Objects.equals(phoneNumber,""))
            System.out.println("Introduce a valid phone number");
        else
            this.phoneNumber = phoneNumber;
    }

    /**
     * Se sobreescribira el metodo toString de la clase Object
     * con el objetivo de poder mostrar el {@code name} del user, el {@code email} y el {@code id}
     * @return retornara los atributos anteriormente mencionados
     * */
    @Override
    public String toString() {
        return "Name: "+name+", Email: "+email+" ID: "+id;
    }

    /**
     * Sera un metodo abstracto dado a que cada clase debera implementar su propia forma de usar este metodo
     * @return {@code String}
     * */
    public abstract String showDataUser();
}
