package li.sarossil.springdepinjection.config;

import li.sarossil.springdepinjection.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

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


    //Make Primary
    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService(){
        return new PrimaryGreetingService();
    }

    @Profile("EN")
    @Bean
    I18nEnglishGreetingService i18nService(){
        return new I18nEnglishGreetingService();
    }

    @Profile({"ES","default"})
    @Bean("i18nService")
    I18nSpainishGreetingService i18nSpainishGreetingService(){
        return new I18nSpainishGreetingService();
    }
}
