package li.sarossil.springdepinjection.controllers;

import li.sarossil.springdepinjection.services.GreetingService;

public class SetterController {
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
