package li.sarossil.springdepinjection.controllers;

import li.sarossil.springdepinjection.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorControllerTest {
    ConstructorController controller;
    @BeforeEach
    void setUp() {
        controller = new ConstructorController(new GreetingServiceImpl());
    }

    @Test
    void getGreeting(){
        System.out.println(controller.getGreeting());
    }
}