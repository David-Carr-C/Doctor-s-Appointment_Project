package com.company.someexercises;

/*
* 5! = 5*4*3*2*1
* */
public class Factorial {
    /**
     * @author <a href="https://github.com/David-Carr-C">David Carrillo</a>
     * */
    public static void main(String[] args) {
        double result = Factorial(5);
        System.out.println(result);
    }

    /**
     * Calculara el factorial del numero que se le pase
     *
     * @param n sera el indice factorial
     * @return {@code 1} Retornara 1 si el indice es menor o igual a 0, si es mayor a 0 retornara
     * {@code Factorial(n-1)*n} debido a que se empleara la recursividad para ir multiplicando los valores de
     * n*n-1, con cada llamado de n-1 nos aseguramos que este no entrara a un bucle infinito,
     * asi que multiplicara el retorno de esta funcion por n, y cuando por fin se establezca en n=0, se hara 'n * 1'
     * */
    public static int Factorial(int n) {
        if (n<=0) {
            return 1;
        }
        return Factorial(n-1)*n;
    }
}
