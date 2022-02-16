package com.company.datoprimitivovsobjeto;

public class referenceVsValue {
    public static void main(String[] args) {
        int a = 2;
        int b = 10;
        a = b;
        System.out.println(a);

        JustAObject object1 = new JustAObject("Anna", "Nutritionist");
        JustAObject obj2 = new JustAObject("Alejandra", "Optometrist");
        object1 = obj2; //Al asignar, solo se paso la referencia que apunta al objeto alejandra, entonces ambas variables apuntan al mismo objeto
        System.out.println(object1); //It references to the same object
        System.out.println(obj2);

        obj2.setName("Diana"); //El cambio afecta a ambas variable, porque estas apuntan a la ubicacion en memoria de un mismo objecto
        System.out.println(obj2);
        System.out.println(object1);

        System.gc(); //El objeto que nadie apunta, pronto sera eliminado por el Garbage Collector, pero se puede llamar para que haga la liberacion de espacio
    }
}
