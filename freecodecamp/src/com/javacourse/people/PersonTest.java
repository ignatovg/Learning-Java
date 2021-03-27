package com.javacourse.people;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    private static final String[] MY_STATE_VALUES = {"PENDING","PROCESSING","PRECESSED"};

    public String[] states() {
        return Arrays.copyOf(MY_STATE_VALUES,MY_STATE_VALUES.length);
    }

    @Test
    public void shouldReturnHelloWorld(){
        Person george = new Person();
        assertEquals("Hello World",george.helloWorld() );
    }

    @Test
    public  void shouldReturnHelloGeorge(){
        Person person = new Person();
        assertEquals("Hello George",person.hello("George"));
    }

    @Test
    public void shouldReturnNumberOfPersons(){
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();

        assertEquals(3,Person.numberOfPersons());
    }
    @Test
    public void demonstrateArrays(){
        Person[] persons = new Person[3];
        for (int i = 0; i < 4; i++){
            persons[i] = new Person();
        }

        for(Person person:persons){
            person.helloWorld();
        }

        LoginLevel state = LoginLevel.PROCESSING;
        switch (state){
            /*falls through*/
            case PENDING: return;
            case PROCESSING:
                break;
            default:
                /* throw Error*/
        }

        for(LoginLevel states: LoginLevel.values()){
            if(state == LoginLevel.PENDING){
                /*Do something*/
            }else if(state == LoginLevel.PROCESSING){
                /*Do something*/
            }else if(state == LoginLevel.PROCESSED){
                /*Do something*/
            }
        }
    }
}
