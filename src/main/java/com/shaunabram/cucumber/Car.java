package com.shaunabram.cucumber;

public class Car {
    private int fuelLevel;

    public Car(int initialFuelLevel) {
        fuelLevel = initialFuelLevel;
    }

    public void addFuel(int fuel) {
        fuelLevel = fuelLevel + fuel;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }
}
