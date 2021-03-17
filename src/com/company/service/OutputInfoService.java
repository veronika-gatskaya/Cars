package com.company.service;

import com.company.details.Engine;
import com.company.professionals.Driver;
import com.company.vehicles.Car;

public interface OutputInfoService {
    void printInfo(Car car, Engine engine, Driver driver);
}
