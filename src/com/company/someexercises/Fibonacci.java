package com.company.someexercises;

/**
 * 0,1,1,2,3,5,8...
 * */
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(Fibonacci(20));
    }

    /**
     * Se obtendra el numero de la serie de Fibonacci del numero elegido
     * @param n Sera el numero elegido de la serie de fibonacci
     * @return {@code 0} Si {@code n} es menor o igual a 0
     * <br>
     * {@code 1} Si {@code n} es igual a 1
     * <br>
     * {@code Fibonacci(n-1)+Fibonacci(n-2)} Si es mayor a 1, por lo tanto entrara en
     * recursion, para que esta no sea infinita sus indices {@code n} iran bajando como -2 o -1
     * y cada retorno de los argumentos obtenidos se sumaran, dando asi que cuando acabe la funcion y se alcance
     * n = 0 o n = 1, este proceso finalziara y se obtendran todas las sumas buscadas, dando asi el resultado querido
     **/
    public static double Fibonacci(double n) {
        if (n<=0) {
            return 0;
        }
        if (n==1) {
            return 1;
        }
        return Fibonacci(n-1)+Fibonacci(n-2);
    }
}
