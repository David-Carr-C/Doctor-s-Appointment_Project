package com.company;

import java.util.ArrayList;

import static com.company.UIMenu.scanner;
import static com.company.UIMenu.MONTHS;

public class UIDoctorMenu {
    private static Doctor doctorLogged;
    public static ArrayList<Doctor> doctors = new ArrayList<>(); //Intento de persistencia de datos

    public static void showDoctorMenu(Doctor doctorLogged_) {
        doctorLogged = doctorLogged_;
        int response = 0;
        do {
            System.out.println("Welcome "+doctorLogged.getName());
            System.out.println("1. Add Available Appointment");
            System.out.println("2. My Scheduled appointments");
            System.out.println("0. Logout");
            response = scanner.nextInt();
            switch (response) {
                case 1:
                    showAddAvailableAppointment();
                    break;
                case 2:
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Seleccione una opcion correcta!");
            }

        }while (response!=0);
    }

    private static void showAddAvailableAppointment() {
        int response = 0;
        do {
            System.out.println("::Add Available Appointment");
            System.out.println("Select a month");
            for (int i = 0; i < 3; i++) {
                int j = i+1;
                System.out.println(j+". "+MONTHS[i]);
            }
            System.out.println("0. Return");
            response = scanner.nextInt();

            if (response > 0 && response < 4) {
                int monthSelected = response;
                System.out.println(MONTHS[monthSelected-1]);
                System.out.println("Insert the day available: [dd/mm/yyyy]");
                scanner.nextLine();
                String date = scanner.nextLine();

                System.out.println("Your date is: "+date+ "\n1. Correct \n2. Change Date");
                int responseDate = scanner.nextInt();
                if (response < 0 || response > 3) { //response < 0 || response > 3
                    System.out.println("Select a correct option");
                    responseDate =2;
                }
                if (responseDate == 2 )
                    continue;

                String time;
                do {
                    System.out.println("Insert the time available for date: "+date+ " [16:00]");
                    scanner.nextLine();
                    time = scanner.nextLine();
                    System.out.println("Your date is: "+time+ "\n1. Correct \n2. Change Date");
                    responseDate = scanner.nextInt();
                    if (response <= 0 || response >= 3) {
                        System.out.println("Select a correct option");
                        responseDate = 2;
                    }
                }while (responseDate==2);
                doctorLogged.addAvailableAppointment(date,time);
                addDoctorToList(doctorLogged);

            } else if (response==0) {

            } else {

            }
        }while (response!=0);
    }

    private static void addDoctorToList(Doctor doctor) { //Intento de persistencia de datos
        if (doctor.getAvailableAppointments().size() > 0 && !doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }
}
