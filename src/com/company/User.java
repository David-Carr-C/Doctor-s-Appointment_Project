package com.company;

import java.util.Objects;

public abstract class User {
    protected static int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public int getId() {
        if (id!=0)
            return id;
        else
            System.out.println("Error!, please stop, maintain the system, test this part, has encountered an error so big");
        return -1;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        if (!Objects.equals(name, ""))
            return name;
        else
            return "Error, this object has an invalid name!";
    }

    public void setName(String name) {
        if (!Objects.equals(name, ""))
            this.name = name;
        else
            System.out.println("Introduce a valid name!");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Name: "+name+", Email: "+email+" ID: "+id;
    }

    public abstract String showDataUser();
}
