package com.company.utilidadesdestatic;

//Miembros static
import static com.company.utilidadesdestatic.Calculadora.sum;
import static java.lang.Math.*;

public class testCalculadora {
    public static void main(String[] args) {
        System.out.println(sum(2.1,2.4));
        System.out.println(sum(2,2));
        System.out.println(PI);

        //Tambien se puede acceder con su nombre de la clase para diferenciar
        System.out.println(Math.PI);
        System.out.println(Calculadora.sum(3.333,3.333));

        //ID incremento
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.getId());
        double result = calculadora.imc(1.70,51);
        System.out.println("El imc es igual a: "+result);
        Calculadora c2 = new Calculadora();
        System.out.println(calculadora.getId());

    }
}
