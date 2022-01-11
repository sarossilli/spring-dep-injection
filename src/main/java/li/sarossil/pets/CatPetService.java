package li.sarossil.pets;

import org.springframework.context.annotation.ComponentScan;



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
