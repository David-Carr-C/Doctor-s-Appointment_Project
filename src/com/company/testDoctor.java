package com.company;

import java.util.Date;

public class testDoctor {
    public static void main(String[] args) {
        //Creacion del doctor por default
        Doctor doctor; //Declaracion
        doctor = new Doctor(); //Asignacion con constructor default
        doctor.setName("Jonathan"); //Set del nombre del doctor
        System.out.println(doctor.getName()+" su id: "+doctor.getId()+" su especialidad es: "+doctor.getSpeciality()); //nombre e id del objeto

        Doctor myDoctor = new Doctor("Alejandro","ale.ja@email.com", "Ophthalmology"); //Inicializacion con constructor parametrizado
        System.out.println(myDoctor.getName()+" su id: "+myDoctor.getId()); //nombre e id del objeto
        //System.out.println(Doctor.id); //Variable estatica 'id'

        myDoctor.addAvailableAppointment(new Date(), "4pm"); //Testing Available Appointments - Clase Anidada Estatica
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");
        System.out.println(myDoctor.getAvailableAppointments()); //Display de toString de todas las Appointments creados, en este caso se imprime las direcciones de los objetos

        for (Doctor.AvailableAppointment index: myDoctor.getAvailableAppointments()) { //Se declara el objeto anidado para, por cada iteracion, displayear el resultado de la ArrayList que regresa la funcion.
            System.out.println("Hora de la cita: "+index.getTime()+ ", id: "+index.getId());
        }

        Doctor.AvailableAppointment justAnAppointment = new Doctor.AvailableAppointment(new Date(), "1pm"); //Se crea un objeto anidado
        System.out.println(justAnAppointment.getDate()); //Se obtiene la Date del objeto anidado

        //para acceder a la clase anidada se debe poner el nombre de la Clase exterior '.' el nombre de la clase anidada
        //los metodos de la clase exterior seran los que ya de por si tenia, sin ningun cambio, se ignora todo lo de dentro de "class"
        //los metodos de la clase anidada, seran los de dentro de la palabra class "NombreClaseAnidada" { metodos }
        //pero para tener individualmente un objeto de la clase anidada, su constructor debe ser invocado asi: "ClaseExterior.ClaseAnidada()"

        //ToString implement
        System.out.println("\nToString method");
        System.out.println("Doctor object: ");
        System.out.println(myDoctor);
        System.out.println("Available Appointment object: ");
        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA);
        }
    }
}
