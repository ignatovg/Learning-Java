package com.javacourse.zoo;

public  class Zoo {
    public static void main(String[] args){
        Animal[] animals = {new Dog(), new Gorilla(), new Lion(), new Tiger(),};
        feedAnimals(animals);
    }

    public static void feedAnimals(Animal[] animals){
        for(Animal animal: animals){
            animal.eat();
            animal.age();
        }
    }

}
