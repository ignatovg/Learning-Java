package com.javacourse.people;

public enum LoginLevel {
    PENDING(1),PROCESSING(2),PROCESSED(3);

    private int i;
    private  LoginLevel(int i){
        this.i=i;
    }
    public int code(){
        return i;
    }

    /*Only add method if you need it
    public boolean isPending(){
        return  this == PENDING;
    }
    */
}
