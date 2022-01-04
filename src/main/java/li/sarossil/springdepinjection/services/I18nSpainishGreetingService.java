package li.sarossil.springdepinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nService")
public class I18nSpainishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hola!";
    }
}
