package shelter;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

public class VirtualPetShelterTest {

    VirtualPetShelter underTest;
    VirtualPet pet1;
    VirtualPet pet2;

    @Before
    public void SetUp() {
        underTest = new VirtualPetShelter();
        pet1 = new VirtualPet("Jake", "dog", 1, 1, 1, 8);
        pet2 = new VirtualPet("Molly", "cat", 1, 1, 1, 1);

    }

    @Test
    public void shouldReduceAllPetsHungerByOneWhenFeeding() {
        VirtualPetShelter virtualPet = new VirtualPetShelter();

        Assert.assertEquals(9, virtualPet.feed());
    }

    @Test
    public void shouldReduceAllPetsThirstByOneWhenWatering() {
        VirtualPetShelter virtualPet = new VirtualPetShelter();

        Assert.assertEquals(9, virtualPet.water());
    }

    @Test
    public void shouldReduceBoredomByOneWhenPlaying() {
        VirtualPetShelter virtualPet = new VirtualPetShelter();

        Assert.assertEquals(9, virtualPet.play());
    }

    @Test
    public void nameShouldBeRusty() {
        VirtualPetShelter virtualPet = new VirtualPetShelter();

        Assert.assertEquals("Rusty", virtualPet.getName());
    }

    @Test
    public void descriptionShouldBeDew() {
        VirtualPetShelter virtualPet = new VirtualPetShelter();

        Assert.assertEquals("smells like a Stargazer lily fresh with morning dew", virtualPet.getDescription());
    }

    @Test
    public void shouldFindPetByName(){
        underTest.add(pet1);
        VirtualPet foundPet = underTest.findPetName("Jake");
        Assertions.assertThat(foundPet).isEqualTo(pet1);
    }

    @Test
    public void shouldBeAbleToAdd2Pets(){
        underTest.add(pet1);
        underTest.add(pet2);
        Collection<VirtualPet> allPets = underTest.getAllPets();
        Assertions.assertThat(allPets).contains(pet1, pet2);
    }

    @Test
    public void shouldBeAbleToAdoptDeletePet(){
        underTest.add(pet1);
        underTest.remove(pet1);
        VirtualPet foundPet = underTest.findPetName(pet1.getName());
        Assertions.assertThat(foundPet).isEqualTo(null);
    }

//    @Test
//    public void shouldFeedAllPets(){
//        underTest.add(pet1);
//        underTest.add(pet2);
//        Collection<VirtualPet> allPets = underTest.feedAllPets();
//        Assert
//    }


}