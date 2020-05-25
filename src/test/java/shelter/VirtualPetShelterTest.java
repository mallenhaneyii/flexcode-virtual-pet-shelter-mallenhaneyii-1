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
        pet1 = new VirtualPet("Jake", "dog", 10, 10, 10, 1);
        pet2 = new VirtualPet("Molly", "cat", 10, 10, 10, 1);

    }

    @Test
    public void shouldReduceAllPetsHungerByOneWhenFeeding() {
        underTest.admit(pet1);
        underTest.admit(pet2);
        underTest.feedAll();
        Assert.assertEquals(5, pet1.getHunger());
        Assert.assertEquals(5, pet2.getHunger());
    }

    @Test
    public void shouldReduceAllPetsHungerByOneWhenWatering() {
        underTest.admit(pet1);
        underTest.admit(pet2);
        underTest.waterAll();
        Assert.assertEquals(5, pet1.getThirst());
        Assert.assertEquals(5, pet2.getThirst());
    }

    @Test
    public void shouldReduceBoredomByOneWhenPlaying() {
        VirtualPetShelter virtualPet = new VirtualPetShelter();
        underTest.admit(pet1);
        pet1.play(5);
        Assert.assertEquals(5, pet1.getBoredom());
    }

    @Test
    public void shouldFindPetByName() {
        underTest.admit(pet1);
        VirtualPet foundPet = underTest.findPetName("Jake");
        Assertions.assertThat(foundPet).isEqualTo(pet1);
    }

    @Test
    public void shouldBeAbleToAdoptDeletePet() {
        underTest.admit(pet1);
        underTest.adopt(pet1);
        VirtualPet foundPet = underTest.findPetName(pet1.getName());
        Assertions.assertThat(foundPet).isEqualTo(null);
    }

    @Test
    public void shouldBeAbleToGetAllPetsValues(){
        underTest.admit(pet1);
        underTest.admit(pet2);
        underTest.getAllPets();
        Assert.assertEquals(10, pet1.getHunger());
        Assert.assertEquals(10, pet1.getThirst());
        Assert.assertEquals(10, pet1.getBoredom());
        Assert.assertEquals(10, pet2.getHunger());
        Assert.assertEquals(10, pet2.getThirst());
        Assert.assertEquals(10, pet2.getBoredom());
    }
}