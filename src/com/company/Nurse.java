package com.company;

public class Nurse extends User{
    private String speciality;

    public Nurse(String name, String email) {
        super(name,email);
    }

    @Override
    public String showDataUser() {
        return "Hospital: Cruz Roja\n" +
                "Departamentos: Nutriologia, Estomatologia";
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
