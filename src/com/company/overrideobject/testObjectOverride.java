package com.company.overrideobject;

public class testObjectOverride {
    public static void main(String[] args) {
        //Las cadenas de texto tienen un hashCode y estas son iguales cuando contienen la misma cadena, de hecho tiene que ver con la String pool
        String something = "ab";
        System.out.println(something.hashCode());
        System.out.println("ab".hashCode()); //Donde si se repite una cadena son las mismas

        //Mientras que string builder crea una instancia de StringBuilder
        StringBuilder some = new StringBuilder("ab");
        System.out.println(some.hashCode());
        //Siendo que los hashcode de los objetos apuntan a la memoria Heap
        System.out.println(new ObjectOverride().hashCode());

        //Representa el 1 de la tabla Ascii
        System.out.println("1".hashCode());

        //Es el mismo valor
        Integer integer = new Integer(1);
        System.out.println(integer.hashCode());

        System.out.println(new Character('a').hashCode());

        //instanceOf
        if (new Character('a') instanceof Character) {
            //Esta palabra clave (reservada), permite saber si un objeto es una instancia de una clase
            //A su vez nos permite saber si un objeto implementa cierta Interfaz
            System.out.println("End");
        }
    }
}
