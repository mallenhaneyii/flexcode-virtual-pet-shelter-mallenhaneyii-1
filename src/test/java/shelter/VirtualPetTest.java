package shelter;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import org.assertj.core.api.Assertions;

public class VirtualPetTest {

    VirtualPet underTest;
    VirtualPet underTest1;
    VirtualPet underTest2;
    VirtualPet underTest3;
    VirtualPet foundPet;

    @Before
    public void setUp() {
        underTest = new VirtualPet("Rusty", "smells like a Stargazer lily fresh with morning dew", 10, 10, 10);
        foundPet = new VirtualPet("Rusty", "", 10, 10, 10);
        // doesn't seem to be working so I'm including it in every test
    }

    @Test
    public void shouldFindName() {
        VirtualPet underTest = new VirtualPet("Rusty", "", 10, 10, 10);
        String foundPet = underTest.getName();
        Assertions.assertThat(foundPet).isEqualTo("Rusty");
    }

    @Test
    public void shouldFindDescription() {
        underTest = new VirtualPet("Rusty", "smells like a Stargazer lily fresh with morning dew", 10, 10, 10);
        String foundPet = underTest.getDescription();
        Assertions.assertThat(foundPet).isEqualTo("smells like a Stargazer lily fresh with morning dew");
    }

    @Test
    public void shouldReturnValueOfHunger() {
        underTest = new VirtualPet("Rusty", "smells like a Stargazer lily fresh with morning dew", 10, 10, 10);
        int foundPet = underTest.getHunger();
        Assertions.assertThat(foundPet).isEqualTo(10);
    }

    @Test
    public void shouldReturnValueOfThirst() {
        underTest = new VirtualPet("Rusty", "smells like a Stargazer lily fresh with morning dew", 10, 10, 10);
        int foundPet = underTest.getThirst();
        Assertions.assertThat(foundPet).isEqualTo(10);
    }

    @Test
    public void shouldReturnValueOfBoredom() {
        underTest = new VirtualPet("Rusty", "smells like a Stargazer lily fresh with morning dew", 10, 10, 10);
        int foundPet = underTest.getBoredom();
        Assertions.assertThat(foundPet).isEqualTo(10);
    }

    @Test
    public void shouldReturnValueOfAttributes() {
        underTest = new VirtualPet("Rusty", "smells like a Stargazer lily fresh with morning dew", 10, 10, 10);
        String attributes = underTest.getAttributes();
        Assertions.assertThat(attributes).isEqualTo("10" + "10" + "10");
    }


}