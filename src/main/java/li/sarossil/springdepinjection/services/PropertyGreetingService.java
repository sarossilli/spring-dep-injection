package li.sarossil.springdepinjection.services;

import org.springframework.stereotype.Service;

public class PropertyGreetingService implements GreetingService  {

    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}
