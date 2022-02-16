package com.company;

import java.util.ArrayList;
import java.util.Scanner;

import static com.company.UIDoctorMenu.showDoctorMenu;
import static com.company.UIPatientMenu.showPatientMenu;

public class UIMenu {
    public static Scanner scanner; //Escaner a utilizar en la clase UIMenu, aunque este scanner tambien puede ser reutilizado
    public static final String[] MONTHS = {"January","February","March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}; //Meses del anio
    private static Doctor doctorLogged;
    private static Patient patientLogged;

    public static void showMenu() { //1er menu - Entrada
        System.out.println("Welcome to My Appointments");
        System.out.println("Select a option");

        int response = 0;
        scanner = new Scanner(System.in);
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Exit");

            response = scanner.nextInt();

            switch (response) {
                case 1:
                    System.out.println("Doctor");
                    authUser(1);
                    showDoctorMenu(doctorLogged);
                    break;
                case 2:
                    authUser(2);
                    showPatientMenu(patientLogged);
                    break;
                case 0:
                    System.out.println("Thank you for visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        } while (response!=0);
    }
    /*private static void showPatientMenu() { //2do Menu - Entrada de Patient
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            response = scanner.nextInt();

            switch (response) {
                case 1:
                    System.out.println("::Book an appointment");
                    int i = 1;
                    for (String month: MONTHS) {
                        System.out.println(i+". "+month);
                        i++;
                        if (i>3)
                            break;
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    System.out.println("Returning...");
                    break;
                default:
                    System.out.println("Select a correct option");
            }
        } while (response!=0);
    } //Return - Entrada*/


    private static void authUser(int userType) { //Simulacion de base de datos
        //userType = 1::Doctor, userType = 2::Patient
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Alejandro Salgado", "alejan.sal@email.com", "Estomatologia"));
        doctors.add(new Doctor("Karen Sosa", "karen.sosa@email.com", "Pedriatria"));
        doctors.add(new Doctor("Daniela Rosas", "daniela.rosas@email.com", "Nutricion"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Anahi Salgado", "anahi@email.com"));
        patients.add(new Patient("Roberto Rodriguez", "roberto@email.com"));
        patients.add(new Patient("Carlos Sanchez", "carlos@email.com"));

        boolean emailCorrect = false;
        do {
            System.out.println("Insert your email: [name@example.com]");
            scanner.nextLine(); //Quita el salto de linea
            String email = scanner.nextLine();
            if (userType==1) {
                for (Doctor doctor: doctors) {
                    if (doctor.getEmail().equals(email)) {
                        emailCorrect = true;
                        //Obtener los datos del usuario logeado -> Esto se realiza al salir de este menu
                        doctorLogged = doctor;

                        //Show Doctor Menu -> Esto se realiza al salir de este menu
                    }
                }
            }
            if (userType==2) {
                for (Patient patient: patients) {
                    if (patient.getEmail().equals(email)) {
                        emailCorrect = true;
                        patientLogged = patient;

                        //Show Patient Menu
                    }
                }
            }
        }while (!emailCorrect);
    }
}
