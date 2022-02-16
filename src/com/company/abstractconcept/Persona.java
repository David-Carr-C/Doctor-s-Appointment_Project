package com.company.abstractconcept;

public abstract class Persona implements Saltar, DoAll{
    private int id;
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void sleep();

    @Override
    public void jump() {
        System.out.println("Jumping");
    }

    @Override
    public void carry() {
        System.out.println("Carrying");
    }

    @Override
    public void hold() {
        System.out.println("Holding");
    }

    /*@Override
    public void run() {

    }*/ // Podemos no implementar todos los metodos de las interfaces, pero las subclases tendran que desarrollar este metodo

    //void read(); <- Java -11 no funciona
}
