package li.sarossil.pets;

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
