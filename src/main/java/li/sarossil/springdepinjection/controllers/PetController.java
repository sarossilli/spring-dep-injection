package li.sarossil.springdepinjection.controllers;

import li.sarossil.pets.PetService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PetController {

    public final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    public String bestPet(){
        return petService.getPetType();
    }
}
