package com.company.abstractconcept;

public class testFilosofo {
    public static void main(String[] args) {
        Filosofo filosofo = new Filosofo("Jacob",19);
        System.out.println(filosofo.getAge());
        filosofo.setDescripcion("Era hace una vez un filosofo");
        filosofo.hold();
        filosofo.run();
        filosofo.sleep();


    }
}
