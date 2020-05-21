package shelter;

import java.util.*;
import java.util.ArrayList;

public class VirtualPet {

    String petName;
    String petDescription;
    int hunger;
    int thirst;
    int boredom;
    int tick;

    public VirtualPet(String name, String description, int hunger, int thirst, int boredom, int tick) {
        this.petName = name;
        this.petDescription = description;
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;
        this.tick = tick;
    }

    public String getName() {
        return petName;
    }

    public String getDescription() {
        return petDescription;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getBoredom() {
        return boredom;
    }

    public String getAttributes() {
        String hungString = String.valueOf(hunger);
        String thirString = String.valueOf(thirst);
        String boreString = String.valueOf(boredom);
        return (hungString + thirString + boreString);
    }


}
