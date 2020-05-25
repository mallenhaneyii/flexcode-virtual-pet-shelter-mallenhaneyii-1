package shelter;

import java.util.*;
import java.util.ArrayList;

public class VirtualPet {

    String name;
    String description;
    int hunger;
    int thirst;
    int boredom;
    int tick;

    public VirtualPet(String name, String description, int hunger, int thirst, int boredom, int tick) {
        this.name = name;
        this.description = description;
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;
        this.tick = tick;
    }

    public void feed(int food) { hunger -= food; }

    public void water(int liquid){
        thirst -= liquid;
    }

    public void play(int toy){
        boredom -= toy;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
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

    public void tick() {
        hunger += 2;
        thirst += 2;
        boredom++;
    }
}
