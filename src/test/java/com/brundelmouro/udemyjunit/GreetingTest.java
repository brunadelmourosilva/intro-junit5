package com.brundelmouro.udemyjunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    @Test
    void helloWorld() {
        Greeting greeting = new Greeting();

        System.out.println(greeting.helloWorld());
    }

    @Test
    void testHelloWorld() {
        Greeting greeting = new Greeting();

        System.out.println(greeting.helloWorld("Bruna"));
    }
}