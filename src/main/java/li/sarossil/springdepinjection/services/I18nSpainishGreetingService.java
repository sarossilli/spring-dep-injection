package li.sarossil.springdepinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


public class I18nSpainishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hola!";
    }
}
