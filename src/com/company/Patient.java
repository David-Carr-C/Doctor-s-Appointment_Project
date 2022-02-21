package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends User {
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    //New Feature, los pacientes pueden ver y administrar sus appointments
    private ArrayList<AppointmentDoctor> patientToDoctorAppointments = new ArrayList<>();
    private ArrayList<AppointmentNurse> patientToNurseAppointments = new ArrayList<>();

    Patient(String name, String email) {
        super(name,email);
        id++;
    }

    public void setWeight(double weight) {
        if (weight!=0)
            this.weight = weight;
        else
            System.out.println("Introduce a correct weight");
    }
    public String getWeight() {
        return weight+" kg";
    }
    public String getHeight() {
        return height+" m";
    }
    public void setHeight(double height) {
        if (height!=0)
            this.height = height;
        else
            System.out.println("Introduce a correct height");
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        return super.toString()+", Weight: "+getWeight()+", Height: "+getHeight();
    }

    @Override
    public String showDataUser() {
        return "Paciente\n" +
                "Historial Clinico\n" +
                "Padecimientos";
    }

    //New feature
    public void addPatientToNurseAppointments(Nurse nurse/*, Patient patient*/, Date date, String time) {
        AppointmentNurse appointmentNurse = new AppointmentNurse(this,nurse); //Se crea una cita de Nurse, el constructor necesita un paciente y una nurse
        appointmentNurse.schedulable(date,time); //Se hace un schedule de esta cita, gracias al date y time
        patientToNurseAppointments.add(appointmentNurse); //Se agrega a la array de Patient
    }
    public ArrayList<AppointmentNurse> getPatientToNurseAppointments() {
        return patientToNurseAppointments;
    }
    public void addPatientToDoctorAppointments(Doctor doctor/*, Patient patient <- es this*/, Date date, String time) {
        AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this,doctor);
        appointmentDoctor.schedulable(date,time);
        patientToDoctorAppointments.add(appointmentDoctor);//Se agrega a la array de Patient
    }
    public ArrayList<AppointmentDoctor> getPatientToDoctorAppointments() {
        return patientToDoctorAppointments;
    }

}
