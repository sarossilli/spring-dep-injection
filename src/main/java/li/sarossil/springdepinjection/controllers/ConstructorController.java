package li.sarossil.springdepinjection.controllers;

import li.sarossil.springdepinjection.services.GreetingService;

public class ConstructorController {
    public final GreetingService greetingService;

    public ConstructorController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
