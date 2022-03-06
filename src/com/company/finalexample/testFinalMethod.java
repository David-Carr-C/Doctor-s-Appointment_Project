package com.company.finalexample;

public class testFinalMethod {
    public static void main(String[] args) {
        FinalMehod finalMehod = new FinalMehod();
        finalMehod.methodFinal();
        finalMehod.methodFinal("John");

        FinalMethodComprobation finalMethodComprobation = new FinalMethodComprobation();
        finalMethodComprobation.methodFinal("John");
    }
}

class FinalMethodComprobation extends FinalMehod {
    /*@Override  <- No se puede sobreescribir
    public void methodFinal() {  <-  Los metodos final no pueden ser sobreescritos
        super.methodFinal("Hello");
    }*/

    @Override
    public void methodFinal(String name) {
        super.methodFinal("What's up? "+name);
        //Se llama al metodo de la super clase, el cual recibe por parametro toda la strong "name"
    }
}