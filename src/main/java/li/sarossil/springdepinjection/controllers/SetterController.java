package li.sarossil.springdepinjection.controllers;

import li.sarossil.springdepinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterController {

    @Autowired
    @Qualifier("setterGreetingService")
    private GreetingService greetingService;

    public void setGreetingService(@Qualifier("setterGreetingService")GreetingService greetingService){
        this.greetingService = greetingService;
    }
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
