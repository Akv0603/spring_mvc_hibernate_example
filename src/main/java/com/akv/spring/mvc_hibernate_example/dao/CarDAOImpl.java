package com.akv.spring.mvc_hibernate_example.dao;

import com.akv.spring.mvc_hibernate_example.entity.Car;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CarDAOImpl implements CarDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Car> getAllCars() {
        Session session = sessionFactory.getCurrentSession();
        List<Car> allCars =session.createQuery("from Car ", Car.class).getResultList();
        return allCars;
    }
}
