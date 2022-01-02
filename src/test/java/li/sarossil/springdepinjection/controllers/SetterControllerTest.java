package li.sarossil.springdepinjection.controllers;

import li.sarossil.springdepinjection.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterControllerTest {
    SetterController controller;
    @BeforeEach
    void setUp() {
        controller = new SetterController();
        controller.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void setGreeting(){
        System.out.println(controller.getGreeting());
    }

}