package com.company.overrideobject;

public class ObjectOverride {
    /**
     * El hashCode en variables wrapper primitivas son los mismos datos <- Siendo integer '1' su hashcode sera 1
     * El hashCode en variables Character son su referente en la tabla ascii
     * El hashCode en variables String es el ascii de cada caracter que ocupa
     * El hashCode en variables referenciando a Objetos, tiene la localidad donde se encuentran estos objetos en la memoria Heap
     * El hashCode es utilizado conmunmente para reconocer cuando un Valor es duplicado, por ejemplo, en una HashTable
     * */
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    /**
     * Por default, si es objeto:
     * Regresa la localidad en memoria Heap del objeto, a su vez el tipo de objeto que se trata
     *
     * Por default, si es cadena:
     * Regresa el hashCode de una String, gracias a pasar por cada caracter y realizar una formulacion en funcion del
     * valor en Ascii de cada caracter obteniendo asi el hashCode
     *
     * Por default, si es caracter:
     * Regresa el codigo en ascii del caracter
     *
     * Por default, si es entero:
     * Regresa el valore entero
     *
     * Por convenio (override):
     * Regresa el estado del objeto, esto quiere decir, regresa una cadena de texto con los valores almacenados e informacion
     * relevante para el negocio
     * */
    @Override
    public String toString() {
        return super.toString();
    }

    /**
     * Por default:
     * Compara un objeto, primero si es instancia del mismo y segundo si tienen el mismo hashCode
     *
     * Por convenio (override):
     * Compara un objeto, tomando en cuenta los valores importantes e unicos segun la regla del negocio
     * Esto va desde comparar si un objeto es una instancia de una clase, hasta tener su propio metodo, sobreescrito, de hashCode
     * para que realize la validacion automaticamente
     * */
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
