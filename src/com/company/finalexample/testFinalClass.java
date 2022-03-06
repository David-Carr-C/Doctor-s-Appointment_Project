package com.company.finalexample;

public class testFinalClass {
    public static void main(String[] args) {
        FinalClassComprobation finalClass = new FinalClassComprobation();
    }
}

                            //La clase final no puede tener sub clases
class FinalClassComprobation /*Error ->  extends FinalClass   <- Error */{

}
