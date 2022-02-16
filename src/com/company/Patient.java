package com.company;

public class Patient extends User {
    private String birthday;
    private double weight;
    private double height;
    private String blood;

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
    /*
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    */
}
