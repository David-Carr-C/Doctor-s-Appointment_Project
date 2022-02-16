package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{
    private String speciality;

    //private static int id = 0; //Autoincrement

    public Doctor() { //El constructor nunca regresara un valor.
        super("Nombre por defecto", "Email por defecto");
        System.out.println("Construyendo el objeto Doctor Default");
        speciality = "Especialidad por defecto";
    }
    public Doctor(String name, String email ,String speciality) {
        super(name,email);
        id++;
        //System.out.println("El nombre del doctor es: "+ name);
        this.speciality = speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    private ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time) {
        availableAppointments.add(new AvailableAppointment(date,time));
    }
    public void addAvailableAppointment(String date2, String time) {
        Date date;
        try {
            date = AvailableAppointment.format.parse(date2);
            availableAppointments.add(new AvailableAppointment(date,time));
        } catch (ParseException error) {
            System.out.println("Available Appointment not added!");
            error.printStackTrace();
        }
    }
    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    public String toString() {
        return super.toString()+", Speciality: "+speciality+" "+availableAppointments;
    }

    @Override
    public String showDataUser() {
        return "Hospital: Cruz Roja\n" +
                "Departamento: Estomatologia";
    }

    public static class AvailableAppointment { //Solo el doctor puede poner las citas disponibles
        private int id; //Por lo tanto esta clase solo puede ser accedida desde la clase exterior
        private Date date;
        private String time;
        public static SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        public AvailableAppointment(Date date, String time) { //Su constructor puede ser accedido desde NombreClaseExterior.NombreClaseAnidada
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
        public String getDate(int flag) {
            return format.format(date);
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
            return "Available Appointments\n" +
                    "Date: "+date+
                    "\nTime: "+time;
        }
    }
}

/*
* Nombre de la clase
* ----------------------
* Atributos
* ---------------------
* Metodos
* */