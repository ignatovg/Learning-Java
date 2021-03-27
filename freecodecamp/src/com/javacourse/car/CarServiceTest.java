package com.javacourse.car;

import org.junit.Test;
//this is for demonstrate purposes only
public class CarServiceTest {
    @Test
    public void shouldDemonstrateInterfaces(){
        ICar[] cars = {new BMW(), new Audi("George"), new Mercedes() };
        CarService carService = new CarService();
        carService.drive(cars);
    }

}
