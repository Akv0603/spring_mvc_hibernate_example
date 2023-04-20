package com.akv.spring.mvc_hibernate_example.entity;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String modeL;

    @Column(name = "country")
    private String country;

    @Column(name = "price")
    private int price;

    public Car() {
    }

    public Car(String brand, String modeL, String country, int price) {
        this.brand = brand;
        this.modeL = modeL;
        this.country = country;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModeL() {
        return modeL;
    }

    public void setModeL(String modeL) {
        this.modeL = modeL;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", modeL='" + modeL + '\'' +
                ", country='" + country + '\'' +
                ", price=" + price +
                '}';
    }
}
