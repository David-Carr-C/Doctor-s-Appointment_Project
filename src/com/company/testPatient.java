package com.company;

public class testPatient {
    public static void main(String[] args) {
        Patient patient = new Patient("Alejandra", "ale.jandra@email.com"); //Instancia de la clase
        patient.setWeight(0); //Test de setWeight
        patient.setWeight(52.5); //Test de setWeight
        System.out.println(patient.getWeight()); //Print de weight

        patient.setHeight(1.70);
        System.out.println(patient);
    }
}
