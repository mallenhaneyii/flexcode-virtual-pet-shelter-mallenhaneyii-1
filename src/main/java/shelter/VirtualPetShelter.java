package shelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    Map<String, VirtualPet> pets = new HashMap<>();

    private int hunger = 10;
    private int water = 10;
    private int boredom = 10;
    private String name = "Rusty";
    private String description = "smells like a Stargazer lily fresh with morning dew";

    public Object feed() {
        hunger--;
        return hunger;
    }

    public int water() {
        water--;
        return water;
    }

    public int play() {
        boredom--;
        return boredom;
    }

    public String getName() {

        return name;
    }

    public String getDescription() {

        return description;
    }

    public void add(VirtualPet pet) {
        pets.put(pet.getName(), pet);
    }

    public VirtualPet findPetName(String petName) {
        return pets.get(petName);
    }

    public Collection<VirtualPet> getAllPets() {
        return pets.values();
    }

    public void remove(VirtualPet pet) {
        pets.remove(pet.getName(), pet);
    }
}
