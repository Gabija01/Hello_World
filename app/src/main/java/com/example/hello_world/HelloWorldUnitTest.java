package com.example.hello_world;

import static org.junit.Assert.assertEquals;

import com.example.hello_world.helloworld;

import org.junit.Test;

public class HelloWorldUnitTest {

    @Test
    public void testGetMessage() {
        helloworld helloWorld = new helloworld();
        assertEquals("Hello, World!", helloWorld.getMessage());
    }
}