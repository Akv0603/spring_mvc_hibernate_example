package com.akv.spring.mvc_hibernate_example.controller;

import com.akv.spring.mvc_hibernate_example.entity.Car;
import com.akv.spring.mvc_hibernate_example.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @RequestMapping("/addNewCar")
    public String addMyCar(Model model){
        Car car = new Car();
        model.addAttribute("car", car);
        return "car-information";
    }

    @RequestMapping("/saveCar")
    public String saveCar(@ModelAttribute("car") Car car){
        carService.saveCar(car);
        return "redirect:/";
    }

    @RequestMapping("/updateCar")
    public String updateCar(@RequestParam("carId") int id, Model model){
        Car car = carService.getCar(id);
        model.addAttribute("car", car);
        return "car-information";
    }

    @RequestMapping("/deleteCar")
    public String deleteCar(@RequestParam("carId") int id){
        carService.deleteCar(id);
        return "redirect:/";
    }
}
