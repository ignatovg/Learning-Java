package com.javacourse.car;

public class CarServiceMain {
    public static void main(String[] args) {
        ICar[] cars = {new BMW(), new Audi("George"), new Mercedes() };
        CarService carService = new CarService();
        carService.drive(cars);
    }
}
