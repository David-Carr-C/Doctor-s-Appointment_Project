package com.company.idmanager;

public class testIdManager {
    public static void main(String[] args) {
        IdManager idManager = new IdManager("Daniela");
        IdManager idManager2 = new IdManager("John");
        IdManager idManager3 = new IdManager("Jonathan");
        IdManager idManager4 = new IdManager("George");

        System.out.println(idManager.getID());
        System.out.println(idManager2.getID());
        System.out.println(idManager3.getID());
        System.out.println(idManager4.getID());

        System.out.println("Numero total de objetos creados: "+ IdManager.totalObjects());
    }
}
