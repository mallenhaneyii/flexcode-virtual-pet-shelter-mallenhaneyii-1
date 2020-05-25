package shelter;

import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    Map<String, VirtualPet> pets = new HashMap<>();

    private int hunger = 10;
    private int thirst = 10;
    private int boredom = 10;
    private int tick = 1;

    public void tick() {
        for (VirtualPet allPets : pets.values()) {
            allPets.tick();
        }
    }
    public VirtualPet getPetName(String name){
        return pets.get(name);
    }

    public VirtualPet getPetDescription(String description) {
        return pets.get(description);
    }

    public void admit(VirtualPet pet) {
        pets.put(pet.getName(), pet);
    }

    public VirtualPet findPetName(String petName) {
        return pets.get(petName);
    }

    public void adopt(VirtualPet pet) {
        pets.remove(pet.getName(), pet);
    }

    public String getAllPets() {
        for (VirtualPet petValues : pets.values()) {
            String name = petValues.getName();
            int hunger = petValues.getHunger();
            int thirst = petValues.getThirst();
            int boredom = petValues.getBoredom();
            System.out.println(name + "     " + hunger + "   " + thirst + "   " + boredom);
        }
        return "";
    }

    public String getAllNames() {
        for (VirtualPet petValues : pets.values()) {
            String name = petValues.getName();
            System.out.println(name);
        }
        return "";
    }

    public void feedAll() {
        for (VirtualPet allPets : pets.values()) {
            allPets.feed(5);
        }
    }

    public void waterAll() {
        for (VirtualPet allPets : pets.values()){
            allPets.water(5);
        }
    }

    public void idle(){
        for (VirtualPet allPets : pets.values()){
            hunger -= 2;
            thirst -= 2;
            boredom--;
        }
    }

    public void playWithOnePet(String petName){
        VirtualPet petToPlayWith = findPetName(petName);
        petToPlayWith.play(5);
    }


}
