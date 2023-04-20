package com.akv.spring.mvc_hibernate_example.controller;

import com.akv.spring.mvc_hibernate_example.entity.Car;
import com.akv.spring.mvc_hibernate_example.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @RequestMapping("/")
    public String showAllCars(Model model){
        List<Car> allCars = carService.getAllCars();
        model.addAttribute("allCars", allCars);
        return "all-cars";
    }
}
