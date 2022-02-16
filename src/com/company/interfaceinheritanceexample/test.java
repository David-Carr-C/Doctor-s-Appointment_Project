package com.company.interfaceinheritanceexample;

public class test {
    public static void doSomething(Readable readable) {
        readable.read();
    }
    public static void main(String[] args) {
        doSomething(new Readable() {
            @Override
            public void read() {
                System.out.println("Ephemeral");
            }
        });
        System.out.println("Wow");
    }
}
