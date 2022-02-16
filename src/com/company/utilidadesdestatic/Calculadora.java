package com.company.utilidadesdestatic;

public class Calculadora {
    private static int id;
    Calculadora() {
        id++;
    }
    public double imc(double altura,double peso) {
        return peso/(altura*altura);
    }
    public int getId() {
        return id;
    }


    public static int sum(int a, int b) {
        return a+b;
    }
    public static double sum(double a, double b) {
        return a+b;
    }
}
