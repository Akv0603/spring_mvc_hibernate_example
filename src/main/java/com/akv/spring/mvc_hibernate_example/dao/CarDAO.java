package com.akv.spring.mvc_hibernate_example.dao;

import com.akv.spring.mvc_hibernate_example.entity.Car;

import java.util.List;

public interface CarDAO {

    public List<Car> getAllCars();

    public void saveCar(Car car);
}
