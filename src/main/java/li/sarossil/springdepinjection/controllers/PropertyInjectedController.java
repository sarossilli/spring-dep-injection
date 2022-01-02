package li.sarossil.springdepinjection.controllers;

import li.sarossil.springdepinjection.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
