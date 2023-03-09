package edu.umb.cs681.hw02;

import java.util.ArrayList;

public class Car {

    private String make, model;
    private int mileage, year;
    private float price;
    private int dominationCount;

    public Car(String make, String model, int mileage, int year, float price) {
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.year = year;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getMileage() {
        return mileage;
    }

    public int getYear() {
        return year;
    }

    public float getPrice() {
        return price;
    }

    public int getDominationCount() {
        return dominationCount;
    }

    public void setDominationCount(ArrayList<edu.umb.cs681.hw01.Car> cars) {
        int x = 0;
        for (edu.umb.cs681.hw01.Car car : cars) {
            if (!car.equals(this)) {
                if ((this.getYear() >= car.getYear()) &&
                        (this.getMileage() <= car.getMileage()) &&
                        (this.getPrice() <= car.getPrice())) {

                    if ((this.getYear() > car.getYear()) ||
                            (this.getMileage() < car.getMileage()) ||
                            (this.getPrice() < car.getPrice())) {
                        x = x + 1;
                    }

                }
            }
        }
        this.dominationCount = x;

    }

}
