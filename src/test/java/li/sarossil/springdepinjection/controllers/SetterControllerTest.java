package li.sarossil.springdepinjection.controllers;

import li.sarossil.springdepinjection.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterControllerTest {
    SetterController controller;
    @BeforeEach
    void setUp() {
        controller = new SetterController();
        controller.setGreetingService(new ConstructorGreetingService());
    }

    @Test
    void setGreeting(){
        System.out.println(controller.getGreeting());
    }

}