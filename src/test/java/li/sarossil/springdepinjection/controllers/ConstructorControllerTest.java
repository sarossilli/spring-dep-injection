package li.sarossil.springdepinjection.controllers;

import li.sarossil.springdepinjection.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorControllerTest {
    ConstructorController controller;
    @BeforeEach
    void setUp() {
        controller = new ConstructorController(new ConstructorGreetingService());
    }

    @Test
    void getGreeting(){
        System.out.println(controller.getGreeting());
    }
}