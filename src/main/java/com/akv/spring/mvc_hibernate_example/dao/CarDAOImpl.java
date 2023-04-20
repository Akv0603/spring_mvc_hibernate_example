package com.akv.spring.mvc_hibernate_example.dao;

import com.akv.spring.mvc_hibernate_example.entity.Car;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
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

    @Override
    public void saveCar(Car car) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(car);
//метод как для сохранения так и для обновления данных
    }

    @Override
    public Car getCar(int id) {
        Session session = sessionFactory.getCurrentSession();
        Car car = session.get(Car.class, id);
        return car;
    }

    @Override
    public void deleteCar(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<Car> query = session.createQuery("delete from Car where id =:carId");
        query.setParameter("carId", id);
        query.executeUpdate();
    }
}
