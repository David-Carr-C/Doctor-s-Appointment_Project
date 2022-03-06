package com.company.finalexample;

public class testFinalVar {
    public static void main(String[] args) {
        FinalVar finalVar = new FinalVar();
        //finalVar.name = "Daniela"; <- Error, la variable name es final y no puede ser cambiado su valor
        System.out.println(finalVar.name);

        final FinalVar exampleObject = new FinalVar("Daniela");
        //exampleObject = new FinalVar(); <- Error, la variable exampleObject fue declarada como final, por lo tanto
        //No puede ser alterada una vez que ocurre la inicializacion

        FinalVarComprobation finalVarComprobation = new FinalVarComprobation("Daniela");
        System.out.println(finalVarComprobation.name);
    }
}

class FinalVarComprobation extends FinalVar{

    FinalVarComprobation(String name) {
        super(name);
        //this.name = name; <<- Error, aun asi sea en la subclase, la variable final no puede ser cambiada luego de su asignacion en la super clase
        //o en cualquier parte del codigo
    }
}
