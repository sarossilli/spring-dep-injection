package li.sarossil.springdepinjection.controllers;

import li.sarossil.springdepinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorController {
    @Autowired
    public final GreetingService greetingService;

    public ConstructorController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
