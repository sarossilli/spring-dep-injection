package li.sarossil.springdepinjection.config;

import li.sarossil.springdepinjection.services.ConstructorGreetingService;
import li.sarossil.springdepinjection.services.PropertyGreetingService;
import li.sarossil.springdepinjection.services.SetterGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingServiceConfig {

    @Bean
    //Function to construct
    //Use if code not owned
    ConstructorGreetingService constructorGreetingService(){
        return new ConstructorGreetingService();
    }

    @Bean
    PropertyGreetingService propertyGreetingService(){
        return new PropertyGreetingService();
    }


    @Bean
    SetterGreetingService setterGreetingService(){
        return new SetterGreetingService();
    }
}
