package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // DONE - Create tests for `void setName(String name)`
    // DONE - Create tests for `speak`
    // DONE - Create tests for `setBirthDate(Date birthDate)`
    // DONE - Create tests for `void eat(Food food)` --- Mer note: (Mammal and Animal Classes - ?add food to eaten meals array?)
    // DONE - Create tests for `Integer getId()`
    // DONE - Create test to check Animal inheritance; google search `java instanceof keyword`
    // DONE - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void testSetName() {
        // Given
        String expectedName = "Naomi";
        Date expectedBirthDate = new Date();
        Integer expectedID = 9;
        Cat cat = new Cat(expectedName, expectedBirthDate, expectedID);
        // When
        cat.setName(expectedName);
        // Then
        String actualName = cat.getName();
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSpeak() {
        // Given
        String expectedName = "Naomi";
        Date expectedBirthDate = new Date();
        Integer expectedID = 9;
        String expected = "meow!";
        // When
        String actual = new Cat(expectedName, expectedBirthDate, expectedID).speak(); // https://stackoverflow.com/questions/17004003/how-do-i-call-a-non-static-method-from-a-main-method
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetBirthDate() {
        // Given
        String expectedName = "NiNi";
        Date expectedBirthDate = new Date();
        Integer expectedID = 22021;
        Cat cat = new Cat(expectedName, expectedBirthDate, expectedID);
        // When
        cat.setBirthDate(expectedBirthDate);
        // Then
        Date actualBirthDate = cat.getBirthDate();
        Assert.assertEquals(expectedBirthDate, actualBirthDate);
    }

    @Test
    public void testEat() {
        // Given
        String expectedName = "Ellie";
        Date expectedBirthDate = new Date();
        Integer expectedID = 34;
        Food food = new Food();
        Cat cat = new Cat(expectedName, expectedBirthDate, expectedID);
        // When
        cat.eat(food);
        // Then
        Integer numberOfMealsExpected = 1;
        Assert.assertEquals(numberOfMealsExpected, cat.getNumberOfMealsEaten()); // can't directly pull from eat method bc there is no "get" and ArrayList<Food> eatenMeals is private
    }

    @Test
    public void testGetID() {
        // Given
        String expectedName = "Pretty Girl";
        Date expectedBirthDate = new Date();
        Integer expectedID = 143;
        Cat cat = new Cat(expectedName, expectedBirthDate, expectedID);
        // When
        Integer actualID = cat.getId();
        // Then
        Assert.assertEquals(expectedID, actualID);
    }

    @Test
    public void testAnimalInheritance() {
        String expectedName = "NiNi the Science Cat";
        Date expectedBirthDate = new Date();
        Integer expectedID = 724;
        Cat cat = new Cat(expectedName, expectedBirthDate, expectedID);
        Assert.assertTrue(cat instanceof Animal);
    }

    @Test
    public void testMammalInheritance() {
        Cat cat = new Cat(null, null, null);
        Assert.assertTrue(cat instanceof Mammal);
    }
}
