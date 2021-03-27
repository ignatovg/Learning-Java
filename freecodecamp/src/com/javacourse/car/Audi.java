package com.javacourse.car;

public class Audi implements ICar,IProperty,IAsset,Cloneable{

    private String ownersName;
    public Audi(String ownersName){
        this.ownersName=ownersName;
    }

    @Override
    public void drive() {
        System.out.println("Audi is driving...");
    }

    public int value(){
        return 8000;
    }

    public String owner(){
        return this.ownersName;
    }

    public void sellTo(String newOwner){
        this.ownersName = newOwner;
    }

    //This is for testing purposes/ Creates only shadow copy not a deep copy
    @Override
    public Audi clone(){
        try {
            return (Audi)super.clone();
        } catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }
}
