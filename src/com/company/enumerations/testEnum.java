package com.company.enumerations;

public class testEnum {
    public static void main(String[] args) {
        //Days of week
        Enum day = Enum.SATURDAY;
        System.out.println("1er Dia: "+Enum.MONDAY+", 5to dia: "+day);

        Enum[] days = Enum.values();
        for (Enum oneday: days) {
            System.out.println(oneday);
        }

        switch (days[0]) {
            case MONDAY:
                System.out.println("Mondays are good.");
                break;
            case FRIDAY:
                System.out.println("Fridays are nice");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends are the best");
                break;
            default:
                System.out.println("Midweek are so-so");
                break;
        }

        //Transport
        System.out.println(Transport.AUTOMOBILE+" has "+Transport.AUTOMOBILE.getSpeed()+" km/h");
        Transport[] t1 = Transport.values();
        System.out.println(t1[0]+" has "+t1[0].getSpeed()+ "km/h");
        for (Transport t2: Transport.values()) {
            System.out.println("Speed of "+t2+ " is the number: "+t2.ordinal());
        }

    }
}
