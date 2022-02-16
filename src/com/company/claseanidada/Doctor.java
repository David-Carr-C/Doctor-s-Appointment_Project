package com.company.claseanidada;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Doctor {
    private static int id = 0; //Autoincrement
    private String name;
    private String speciality;

    public Doctor() { //El constructor nunca regresara un valor.
        System.out.println("Construyendo el objeto Doctor Default");
        name = "Nombre por defecto";
        speciality = "Especialidad por defecto";
    }
    public Doctor(String name, String speciality) {
        id++;
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
    int getId() {
        if (id!=0)
            return id;
        else
            System.out.println("Error!, please stop, maintain the system, test this part, has encountered an error so big");
            return -1;
    }

    public String toString() {
        return "Nombre: "+name+", ID: "+id;
    }
    private ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time) {
        availableAppointments.add(new AvailableAppointment(date,time));
    }
    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    public class AvailableAppointment { //Solo el doctor, si este esta creado, puede poner las citas disponibles
        private int id; //Por lo tanto esta clase solo puede ser accedida desde la clase exterior y con un ejemplar de la clase exterior
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) { //Su constructor puede ser accedido desde EjemplarClaseExterior.new
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        } //Y al crear un objeto de esta clase, puedes acceder a los metodos desde el objeto ya creado

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "Date: "+date+", Time: "+time;
        }
    }
}

/*
* Nombre de la clase
* ----------------------
* Atributos
* ---------------------
* Metodos
* --------------
*       Clase interna
*          //...
* */