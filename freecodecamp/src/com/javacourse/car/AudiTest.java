package com.javacourse.car;

import org.junit.Test;

import static org.junit.Assert.*;

public class AudiTest {
    @Test
    public void shouldCloneStringArray(){
        String[] array = {"one","two","three",};
        String[] copiedArray = array.clone();
        assertNotSame(array,copiedArray);
    }

    @Test
    public void shouldCloneAudi(){
    Audi georgesAudi = new Audi("George");
    Audi ivansAudi = georgesAudi.clone();

    assertNotSame(georgesAudi,ivansAudi);

    ivansAudi.sellTo("Ivan");
    assertEquals("Ivan",ivansAudi.owner());
    assertEquals("George",georgesAudi.owner());
    }
}


