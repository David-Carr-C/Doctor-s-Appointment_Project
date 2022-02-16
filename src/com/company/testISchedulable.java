package com.company;

import java.util.Date;

public class testISchedulable {
    public static void main(String[] args) {
        ISchedulable iSchedulable = new ISchedulable() {//Ephemeral - lambda
            @Override
            public void schedulable(Date date, String time) {
                System.out.println("Date: "+date+", Time: "+time);
            }

            /*public void hello() {
                System.out.println("Hello");
            }*/
        }; //La clase anonima solo tiene como metodos los metodos abstractos que se pongan aqui
        iSchedulable.schedulable(new Date(), "10am");
        /*iSchedulable.hello();*/ //<- Error, este metodo no es abstracto

        ISchedulable iSchedulable1 = new AppointmentDoctor(); //Cuando esto ocurre, se ejecuta
        iSchedulable1.schedulable(new Date(),"1pm"); //el metodo que este en la interfaz y en el objeto asignado, lo que compartan, es ese metodo el que se ejecuta
    }
}
