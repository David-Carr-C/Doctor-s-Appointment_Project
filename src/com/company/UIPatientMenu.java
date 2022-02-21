package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import static com.company.UIMenu.scanner;

public class UIPatientMenu {
    private static Patient patientLogged;
    public static void showPatientMenu(Patient patientLogged_){
        patientLogged = patientLogged_;
        int response = 0;
        do {
            System.out.println("Welcome "+ patientLogged.getName());
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Logout");
            response = Integer.parseInt(scanner.nextLine());

            switch (response) {
                case 1:
                    showBookAppointmentMenu();
                    break;
                case 2:
                    showMyAppointmentsMenu();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("No match");
            }

        }while (response!=0);
    }

    private static void showBookAppointmentMenu() {
        int response = 0;
        do {
            System.out.println("::Book an appointment");
            System.out.println("Select a date:");
            Map<Integer, Map<Integer,Doctor>> doctors = new TreeMap<>();
            int k = 0; //Esta variable sera el indice de toda la estructura de arbol
            if (UIDoctorMenu.doctors.isEmpty()){//Si no hay ningun doctor loggeado(y con appointments) entonces se rechaza la peticion
                System.out.println("There's not doctors with available appointments!");
            } else {//Se recorre todos los doctores que hay loggeados y con appointments
                for (int i = 0; i < UIDoctorMenu.doctors.size(); i++) {

                    Map <Integer,Doctor> doctorsInsideDoctors = new HashMap<>(); //Se crea le arreglo treemap que se guadara dentro del treemap anteriormente declarado
                    for (int j = 0; j < UIDoctorMenu.doctors.size(); j++) { //Se crea otro fori debido a que ahora iteraremos UIDoctorMenu.doctors dentro de doctorsInsideDoctors, los meteremos para despues meterlos en el primer treemap, como muñecas rusas
                        doctorsInsideDoctors.put(j,UIDoctorMenu.doctors.get(i)); //Se obtiene cada doctor i dentro de una key j
                        doctors.put(k,doctorsInsideDoctors); //todo este map se mete dentro de doctorsGREAT pero con una key K que perdura fuera de estos for

                        System.out.println(k+". "+UIDoctorMenu.doctors.get(i).getAvailableAppointments().get(j).getDate());
                    }
                }
                int responseDateSel = Integer.parseInt(scanner.nextLine()); //Se obtiene la respuesta del usuario gracias al sout anterior con k
                Map<Integer,Doctor> doctorAvailableSelected = doctors.get(responseDateSel);//Este map que crearemos obtendra lo que doctors tenga dentro, y como? con la key para empezar a extraer data de aqui
                Integer indexDate = null;
                Doctor doctorAvailableSelectedObject = null;
                for (Map.Entry<Integer,Doctor> doc : doctorAvailableSelected.entrySet()) {
                    indexDate = doc.getKey(); //Map.Entry.Integer
                    doctorAvailableSelectedObject = doc.getValue(); //Map.Entry.Doctor
                }

                System.out.println("Confirm your appointment: "+ doctorAvailableSelectedObject.getName()+
                        ", Date: "+doctorAvailableSelectedObject.getAvailableAppointments().get(indexDate).getTime()+
                        ", Time: "+doctorAvailableSelectedObject.getAvailableAppointments().get(indexDate).getDate());
                System.out.println("is it OK?");
                System.out.println("1. Yes");
                System.out.println("2. Change Data");
                responseDateSel = Integer.parseInt(scanner.nextLine());

                if (responseDateSel==1) {
                    response = 0;
                    patientLogged.addPatientToDoctorAppointments(doctorAvailableSelectedObject,
                            doctorAvailableSelectedObject.getAvailableAppointments().get(indexDate).getDate(),
                            doctorAvailableSelectedObject.getAvailableAppointments().get(indexDate).getTime());
                } else if (responseDateSel ==2 ) {
                    response = 2; //Al ser diferente de 0, se volvera a displayear el menu
                } else {
                    response = 2; //Al ser diferente de 0, se volvera a displayear el menu
                }
            }
            
        }while (response!=0);
    }

    private static void showMyAppointmentsMenu() {
        int response = 0;
        do {
            System.out.println("::MyAppointments");
            if (patientLogged.getPatientToDoctorAppointments().size()==0) {
                System.out.println("Don't have appointments");
                break;
            }
            for (int i = 0; i <patientLogged.getPatientToDoctorAppointments().size() ; i++) {
                int j = i+1;
                System.out.println(j+". "+"Date: "+patientLogged.getPatientToDoctorAppointments().get(i).getDate()+
                        "Time: "+patientLogged.getPatientToDoctorAppointments().get(i).getTime()+
                        "\nDoctor: "+patientLogged.getPatientToDoctorAppointments().get(i).getDoctor().getName());
            }
            System.out.println("Press enter to exit.");
            String something = scanner.nextLine();
            if (something!=null) {
                response=1;
            }
        } while (response!=0);
    }
}
