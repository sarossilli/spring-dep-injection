package li.sarossil.pets;

public class CatPetService implements PetService{
    @Override
    public String getPetType() {
        return "Cat is best!";
    }
}
