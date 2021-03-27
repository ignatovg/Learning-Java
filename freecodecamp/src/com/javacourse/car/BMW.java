package com.javacourse.car;

public class BMW implements ICar,IAsset,IProperty{
    public void drive(){
        System.out.println("BMW is driving...");
    }

    @Override
    public int value() {
        return 5000;
    }

    @Override
    public String owner() {
        return null;
    }
}
