package com.company.vehicles;

import com.company.details.Engine;
import com.company.professionals.Driver;

public class SportCar extends Car {
    private double speed;

    public SportCar(String CarClass, String marka, Engine engine, Driver driver, double speed) {
        super(CarClass, marka, driver, engine);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "SportCar: " +
                "Car class=" + getCarClass() + " " +
                "Marka=" + getMarka() + " " +
                "speed=" + speed;
    }
}
