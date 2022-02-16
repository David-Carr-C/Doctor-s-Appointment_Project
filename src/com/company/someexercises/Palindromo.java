package com.company.someexercises;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palabra = scanner.nextLine();
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
}
