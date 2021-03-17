package com.company.service;

import com.company.details.Engine;
import com.company.professionals.Driver;
import com.company.vehicles.Car;

public class OutputInfoServiceImpl implements OutputInfoService {
    public void printInfo(Car car, Engine engine, Driver driver) {
        System.out.println(car.toString());
        System.out.println(engine.toString());
        System.out.println(driver.toString());
    }

}
