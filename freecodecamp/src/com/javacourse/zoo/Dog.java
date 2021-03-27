package com.javacourse.zoo;

public class Dog extends Animal{


    public void print(){
        System.out.println("printing...");
    }

    public String message(){
        return "something;";
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating...");
    }
}
