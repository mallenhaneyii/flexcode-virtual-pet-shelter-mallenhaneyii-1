package shelter;

import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    private VirtualPetShelter pets;
    private int hunger = 10;
    private int water = 10;
    private int boredom = 10;
    private String name = "Rusty";
    private String description = "smells like a Stargazer lily fresh with morning dew";

    public Object feed(){
        hunger--;
        return hunger;
    }

    public int water() {
        water--;
        return water;
    }

    public int play(){
        boredom--;
        return water;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void add(VirtualPet pet) {
    }


//    public String feedAll() {
//
//    }


}
