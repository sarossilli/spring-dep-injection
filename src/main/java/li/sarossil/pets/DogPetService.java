package li.sarossil.pets;

public class DogPetService implements PetService{
    @Override
    public String getPetType() {
        return "Dog is best!";
    }
}
