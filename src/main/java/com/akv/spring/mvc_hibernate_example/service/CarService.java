package com.akv.spring.mvc_hibernate_example.service;

import com.akv.spring.mvc_hibernate_example.entity.Car;

import java.util.List;

public interface CarService {

    public List<Car> getAllCars();

    public void saveCar(Car car);
}
