package com.company;

import java.util.Scanner;
import static com.company.UIMenu.showMenu;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. CLI");
        System.out.println("2. GUI");
        Scanner scanner = new Scanner(System.in);
        String selection = scanner.nextLine();
        if (selection.equals("CLI") || selection.equals("1"))
            showMenu();
        else if (selection.equals("GUI") || selection.equals("2"))
            showMenu();
        else
            System.out.println("No match");
        scanner.close();
    }
}
