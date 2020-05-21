package shelter;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class VirtualPetShelterTest {
    private VirtualPetShelter underTest;
    private VirtualPet pet1;
    private VirtualPet pet2;

    @Before
    public void SetUp(){
        underTest = new VirtualPetShelter();
        pet1 = new VirtualPet("Jake", "dog", 1,1,1);
        pet2 = new VirtualPet("Molly", "cat", 1,1,1);

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

//    @Test
//    public void shouldFeedAllThePets(){
//        underTest.add(pet1);
//        underTest.add(pet2);
//        String hungers = underTest.feedAll();
//        Assertions.assertThat(hungers).isEqualTo("9 + 9 + 9 +9");
//    }


}