package shelter;


import java.util.*;

public class VirtualPetShelterApp {

    public static void main(String[] args) {
        VirtualPetShelter myShelter = new VirtualPetShelter();
        Scanner input = new Scanner(System.in);
        int userAction = 0;

        myShelter.admit(new VirtualPet("Jake", "Black Lab", 10, 10, 10, 1));
        myShelter.admit(new VirtualPet("Molly", "Calico Cat", 10, 10, 10, 1));
        myShelter.admit(new VirtualPet("Shadow", "Golden Retriever", 10, 10, 10, 1));

        System.out.println("Thank you for volunteering at Big Al's Virtual Pet Shelter!");
        System.out.println("");

        while (userAction != 6) {

        System.out.println("This is the status of your pets:");
        System.out.println("");
        System.out.println("Name   Hunger   Thirst   Boredom");
        myShelter.getAllPets();
        System.out.println("");
        System.out.println("What would you like to do?");
        System.out.println("1. Feed all the pets");
        System.out.println("2. Water all the pets");
        System.out.println("3. Play with a pet");
        System.out.println("4. Adopt a pet");
        System.out.println("5. Admit a pet");
        System.out.println("6. Quit");
        userAction = input.nextInt();

            if (userAction == 1) {
                myShelter.feedAll();
                System.out.println("You gave all the pets food!");
                System.out.println("Their hunger decreased by 5!");
            }else if (userAction == 2) {
                myShelter.waterAll();
                System.out.println("You gave all the pets water!");
                System.out.println("Their thirst decreased by 5!");
            }else if (userAction == 3) {
                System.out.println("Which pet would you like to play with?");
                System.out.println();
                myShelter.getAllNames();
                System.out.println();
                String userInput = input.nextLine();
                System.out.println();
                System.out.println("You played with " + userInput + "!");
                System.out.println(userInput + "'s boredom decreased by 5!");
                myShelter.playWithOnePet(userInput);
            }else if (userAction == 4) {
                System.out.println("You would like to adopt a pet. Which pet would you like to adopt?");
                myShelter.getAllNames();
                String userInput2 = input.nextLine();
                System.out.println("Thank you for adopting " + userInput2);
                myShelter.adopt(myShelter.findPetName(userInput2));
            }else if (userAction == 5) {
                System.out.println("You would like to admit a pet. What is the name of your pet?");
                String userInput3 = input.nextLine();
                input.nextLine();
                myShelter.admit(myShelter.findPetName(userInput3));
                System.out.println("We will take good care of " + userInput3);
            }else if (userAction == 6) {
                System.out.println("");
                System.out.println("Thank you for your help today! Goodbye.");
                break;
            }else {
                myShelter.idle();
                System.out.println("I'm not sure what you mean?");
            }
            myShelter.tick();
        }
    }
}



