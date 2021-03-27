package com.javacourse.car;

public class Mercedes implements ICar,IAsset,IProperty {
    public void drive(){
        System.out.println("Mercedes is driving...");
    }

    @Override
    public int value() {
        return 0;
    }

    @Override
    public String owner() {
        return null;
    }
}
