package com.akv.spring.mvc_hibernate_example.service;

import com.akv.spring.mvc_hibernate_example.dao.CarDAO;
import com.akv.spring.mvc_hibernate_example.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDAO carDAO;

    @Override
    @Transactional
    public List<Car> getAllCars() {
        return carDAO.getAllCars();
    }
}
