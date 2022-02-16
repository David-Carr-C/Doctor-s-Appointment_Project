package com.company;

import static com.company.UIMenu.showMenu;

public class testUIMenu {
    public static void main(String[] args) {
        /*for (int i = 0; i < 10; i++) {
            Doctor newDoctor = new Doctor();
            System.out.println(newDoctor.hashCode());
        }*/ //Cada vez que se pone la palabra new Constructor(); se crea un objeto nuevo, esto nos damos cuenta gracias al hashcode
        showMenu(); //Aqui inicia el programa
    }
}
