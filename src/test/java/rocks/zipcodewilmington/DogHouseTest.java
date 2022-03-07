package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

import static rocks.zipcodewilmington.animals.animal_storage.CatHouse.getCatById;
import static rocks.zipcodewilmington.animals.animal_storage.DogHouse.getDogById;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // DONE - Create tests for `void add(Dog dog)`
    // DONE - Create tests for `void remove(Integer id)`
    // DONE - Create tests for `void remove(Dog dog)`
    // DONE - Create tests for `Dog getDogById(Integer id)`
    // DONE - Create tests for `Integer getNumberOfDogs()`

    DogHouse dogHouse = new DogHouse();

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    @Test
    public void testAdd() {
        // Given
        Dog dog = new Dog("Scout", new Date(), 9);
        String expected = "Scout";
        // When
        dogHouse.add(dog);
        Dog actual = getDogById(9);
        // Then
        Assert.assertEquals(expected, actual.getName());
    }

    @Test
    public void testRemoveById() {
        // Given
        Dog dog = new Dog("Drake", new Date(), 13);
        Integer expected = null;
        // When
        dogHouse.add(dog);
        dogHouse.remove(13);
        Dog actual = getDogById(13);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemove() {
        // Given
        Dog dog = new Dog("Chase", new Date(), 130);
        Integer expected = null;
        // When
        dogHouse.add(dog);
        dogHouse.remove(dog);
        Dog actual = dogHouse.getDogById(130);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetDogById() {
        // Given
        Dog dog = new Dog("Stella", new Date(), 13);
        // When
        dogHouse.add(dog);
        Dog actual = getDogById(13);
        // Then
        Assert.assertEquals(dog, actual);
    }

}
