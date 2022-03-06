package com.company.finalexample;

public class FinalVar {
    public final String name;//Opcionalmente se puede asignar el valor y ya no volverlo a cambiar en esta declaracion
    //Las variables finales llevan el convenio de letras mayusculas, ejemplo: NAME

    public FinalVar(String name) {
        this.name = name; //Si bien la variable es final, esta variable recolectara un valor (asignacion) y posterior
        //a eso no podra ser cambiada nuevamente
    }

    public FinalVar() {//Cada uno es un cosntructor diferente
        this.name = "John";
    }

    /*public void setName(String name) {
        this.name = name; <- La variable name es final, por lo tanto es constante y no puede ser alterado su valor
    }*/
}
