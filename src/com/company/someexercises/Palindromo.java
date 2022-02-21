package com.company.someexercises;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palabra = scanner.nextLine();
        System.out.println(isItPalindrome(scanner.nextLine()));
        palabra = palabra.toLowerCase();
        palabra = palabra.replace(" ", "");
        palabra = palabra.replace("á", "a");
        palabra = palabra.replace("é", "e");
        palabra = palabra.replace("í", "i");
        palabra = palabra.replace("ó", "o");
        palabra = palabra.replace("ú", "u");

        int a = palabra.length()-1;
        boolean isItPalindromo = true;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i)==palabra.charAt(a)) {
                System.out.println(palabra.charAt(i) +" en comparacion con: "+palabra.charAt(a));
            } else {
                isItPalindromo = false;
            }
            a--;
        }
        System.out.println("Result: "+isItPalindromo);
    }

    /**
     * Va a verificar si la string es palindromo o no
     *
     * @param string Sera la palabra a verificar
     * @return {@code true} si la palabra es palindromo, si no entonces {@code false}
     * */
    public static boolean isItPalindrome(String string) {
        string = string.toLowerCase();
        string = string.replace("á","a");
        string = string.replace("é", "e");
        string = string.replace("í", "i");
        string = string.replace("ó", "o");
        string = string.replace("ú", "u");
        int j = string.length();
        for (int i = 0; i<string.length(); i++){
            j--;
            if (string.charAt(i)==string.charAt(j)){
                //System.out.println("Igualdad entre "+string.charAt(i)+" y "+string.charAt(j));
            } else {
                return false;
            }
        }
        return true;
    }
}
