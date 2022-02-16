package com.company;

import java.util.Date;

public class testUser {
    public static void main(String[] args) {
        User user = new Doctor("David", "dav@email.com", "Nothing"); //La variable user esta adquiriendo la forma del objeto Doctor
        System.out.println(user); //Se parece a lo que tiene un doctor
        System.out.println(user.getEmail());//Pero sin sus metodos, solo el de toString que pone la speciality
        // new User <-Error ya no se pueden crear objetos de tipo Clase Abstracta

        //Polimorfismo + Abstraccion
        User user1 = new User("David","email@email.com") { //Clase abstracta, cuando es una clase anonima
            @Override
            public String showDataUser() {
                return "Nothing to show";
            }
        };
        System.out.println(user1.showDataUser());
        System.out.println(user1);
    }
}
