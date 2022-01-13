package li.sarossil.springdepinjection.services;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {
    public SingletonBean() {
        System.out.println("Singleton Created!");
    }

    public String getMyScope(){
        return "Singleton!";
    }
}
