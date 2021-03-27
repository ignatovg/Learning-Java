package com.javacourse.car;


public class CarService {
    public void drive(ICar[] cars) {
       // ICar[] cars = {new BMW(), new Audi(), new Mercedes() };
        for(ICar car: cars){
            car.drive();
        }
    }
}
