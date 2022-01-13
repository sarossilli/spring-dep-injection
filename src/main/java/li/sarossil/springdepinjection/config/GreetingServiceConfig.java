package li.sarossil.springdepinjection.config;

import li.sarossil.pets.PetService;
import li.sarossil.pets.PetServiceFactory;
import li.sarossil.springdepinjection.repositories.EnglishGreetingRepository;
import li.sarossil.springdepinjection.repositories.EnglishGreetingRepositoryImpl;
import li.sarossil.springdepinjection.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Configuration
public class GreetingServiceConfig {

    @Bean
    PetServiceFactory petServiceFactory(){
        return new PetServiceFactory();
    }

    @Profile({"dog", "default"})
    @Bean
    PetService dogPetService(PetServiceFactory petServiceFactory){
        return petServiceFactory.getPetService("dog");
    }

    @Bean
    @Profile("cat")
    PetService catPetService(PetServiceFactory petServiceFactory){
        return petServiceFactory.getPetService("cat");
    }

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
    EnglishGreetingRepository englishGreetingRepository(){
        return new EnglishGreetingRepositoryImpl();
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
    I18nEnglishGreetingService i18nService(EnglishGreetingRepository englishGreetingRepository){
        return new I18nEnglishGreetingService(englishGreetingRepository);
    }

    @Profile({"ES","default"})
    @Bean("i18nService")
    I18nSpainishGreetingService i18nSpainishGreetingService(){
        return new I18nSpainishGreetingService();
    }
}
