package com.company.vehicles;

import com.company.details.Engine;
import com.company.professionals.Driver;

public class Lorry extends Car {
    private int carrying;

    public Lorry(String CarClass, String marka, Engine engine, Driver driver, int carrying) {
        super(CarClass, marka, driver, engine);
        this.carrying = carrying;
    }

    public double getCarrying() {
        return carrying;
    }

    public void setSpeed(int carrying) {
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return "SportCar: " +
                "Car class=" + getCarClass() + " " +
                "carrying=" + carrying;
    }
}
