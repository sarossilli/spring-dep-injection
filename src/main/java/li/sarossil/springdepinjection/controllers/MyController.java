package li.sarossil.springdepinjection.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHi(){
        System.out.println("Hello");

        return "Hello";

    }
}
