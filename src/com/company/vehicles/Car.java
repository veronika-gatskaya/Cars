package com.company.vehicles;

import com.company.details.Engine;
import com.company.professionals.Driver;

public class Car {
    private String carClass;
    private String marka;
    private Driver driver;
    private Engine engine;

    public Car(String carClass, String marka, Driver driver, Engine engine) {
        this.carClass = carClass;
        this.marka = marka;
        this.driver = driver;
        this.engine = engine;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car: " +
                "carClass=" + carClass + " " +
                "marka='" + marka;
    }

    public void start() {
        System.out.println("Start");
    }

    public void stop() {
        System.out.println("Stop");
    }

    public void turnRight() {
        System.out.println("Turn Right");
    }

    public void turnLeft() {
        System.out.println("Turn Left");
    }
}
