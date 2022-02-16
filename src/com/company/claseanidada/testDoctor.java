package com.company.claseanidada;

import java.util.Date;

public class testDoctor {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor("Alejandro", "Ophthalmology"); //Inicializacion con constructor parametrizado
        System.out.println(myDoctor); //Desglose del status del objeto

        myDoctor.addAvailableAppointment(new Date(), "4pm"); //Testing Available Appointments - Clase Anidada
        myDoctor.addAvailableAppointment(new Date(), "10am"); //Desde dentro del objeto Doctor se puede acceder a la variable estatica
        myDoctor.addAvailableAppointment(new Date(), "1pm");
        System.out.println(myDoctor.getAvailableAppointments()); //Display de toString de todas las Appointments creados

        for (Doctor.AvailableAppointment index: myDoctor.getAvailableAppointments()) { //Se declara el objeto anidado para, por cada iteracion, hacer display del resultado de la ArrayList que regresara la funcion.
            System.out.println("Hora de la cita: "+index.getTime()+ ", id: "+index.getId());
        }

        Doctor.AvailableAppointment justAnAppointment = myDoctor.new AvailableAppointment(new Date(), "1pm"); //Se crea un objeto anidado
                                        //La forma de poder crear un objeto anidado es al usar un objeto de la clase exterior, el punto '.' y new, dando a entender que se necesita una ejemplar de la clase exterior para poder crear una clase interior
        System.out.println(justAnAppointment.getDate()); //Se obtiene la Date del objeto anidado

    }
}
