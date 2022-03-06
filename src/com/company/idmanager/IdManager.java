package com.company.idmanager;

public class IdManager {
    private static int count;
    private final int ID;
    private String name;

    public IdManager(String name) {
        this.name = name;
        ID = count++;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    /**
     * Regresa el numero de objetos creados por esta clase
     * @return {@code count} numero entero que identifica el total de instancias de esta clase
     * */
    public static int totalObjects() {
        return count-1;
    }
}
