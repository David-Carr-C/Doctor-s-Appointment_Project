package com.company.abstractconcept;

public class Filosofo extends Persona{
    private String descripcion;

    public Filosofo(String name, int age) {
        super(name,age);
    }

    public void setDescripcion(String descripcion) {
        super.hold();
        this.descripcion = descripcion;
    }

    @Override
    public void run() { //Persona tiene como implemento a DoAll, por lo tanto se debe desarrollar este comportamiento
        System.out.println("Running");
    }

    public void sleep() {
        System.out.println("Sleeping");
    }
}
