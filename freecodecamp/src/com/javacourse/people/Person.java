package com.javacourse.people;

public class Person {
    private String personName;
    private static int personCounter;

    public Person(String personName ){
        this.personName = personName;
    }

    public Person(){
        personCounter = personCounter + 1;
        /*
        empty on purpose - default constructor
        */
    }

    public String hello (String name){
        return "Hello " + name;
    }

    public String helloWorld() {
        return "Hello World";

    }

    public static int numberOfPersons() {
        return personCounter;
    }
}
