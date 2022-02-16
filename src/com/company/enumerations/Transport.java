package com.company.enumerations;

public enum Transport {
    PLANE(600), TRAIN(80), AUTOMOBILE(50);

    private int speed;
    Transport(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}
