package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // DONE - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // DONE - Create tests for `speak`
    // DONE - Create tests for `setBirthDate(Date birthDate)`
    // DONE - Create tests for `void eat(Food food)`
    // DONE - Create tests for `Integer getId()`
    // DONE - Create test to check Animal inheritance; google search `java instanceof keyword`
    // DONE - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "Drake";
        Date expectedBirthDate = new Date();
        Integer expectedID = 302;

        // When
        Dog dog = new Dog(expectedName, expectedBirthDate, expectedID);

        // Then
        String actualName = dog.getName();
        Date actualBirthDate = dog.getBirthDate();
        Integer actualID = dog.getId();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBirthDate, actualBirthDate);
        Assert.assertEquals(expectedID, actualID);
    }

    @Test
    public void testSpeak() {
        // Given
        String expectedName = "Chase";
        Date expectedBirthDate = new Date();
        Integer expectedID = 19382;
        String expected = "bark!";
        // When
        String actual = new Dog(expectedName, expectedBirthDate, expectedID).speak();
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetBirthDate() {
        // Given
        String expectedName = "Stella";
        Date expectedBirthDate = new Date();
        Integer expectedID = 200;
        Dog dog = new Dog(expectedName, expectedBirthDate, expectedID);
        // When
        dog.setBirthDate(expectedBirthDate);
        // Then
        Date actualBirthDate = dog.getBirthDate();
        Assert.assertEquals(expectedBirthDate, actualBirthDate);
    }

    @Test
    public void testEat() {
        Food food = new Food();
        Dog dog = new Dog (null, null, null);
        dog.eat(food);
        Integer numberMealsExpected = 1;
        Assert.assertEquals(numberMealsExpected, dog.getNumberOfMealsEaten());
    }
    @Test
    public void testGetID() {
        // Given
        String expectedName = "Cheddar";
        Date expectedBirthDate = new Date();
        Integer expectedID = 143;
        Dog dog = new Dog(expectedName, expectedBirthDate, expectedID);
        // When
        Integer actualID = dog.getId();
        // Then
        Assert.assertEquals(expectedID, actualID);
    }

    @Test
    public void testAnimalInheritance() {
        String expectedName = "Scout";
        Date expectedBirthDate = new Date();
        Integer expectedID = 724;
        Dog dog = new Dog(expectedName, expectedBirthDate, expectedID);
        Assert.assertTrue(dog instanceof Animal);
    }

    @Test
    public void testMammalInheritance() {
        Dog dog = new Dog(null, null, null);
        Assert.assertTrue(dog instanceof Mammal);
    }
}

