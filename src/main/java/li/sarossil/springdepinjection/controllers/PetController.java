package li.sarossil.springdepinjection.controllers;

import li.sarossil.springdepinjection.services.PetService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PetController {

    @Qualifier("petService")
    public final PetService petService;

    public PetController(@Qualifier("petService") PetService petService) {
        this.petService = petService;
    }

    public String bestPet(){
        return petService.getPetType();
    }
}
