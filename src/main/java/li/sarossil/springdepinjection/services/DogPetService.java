package li.sarossil.springdepinjection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


@Service("petService")
@Profile({"dog","default"})
public class DogPetService implements PetService{
    @Override
    public String getPetType() {
        return "Dog is best!";
    }
}
