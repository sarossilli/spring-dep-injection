package li.sarossil.springdepinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("petService")
@Profile("cat")
public class CatPetService implements PetService{
    @Override
    public String getPetType() {
        return "Cat is best!";
    }
}
