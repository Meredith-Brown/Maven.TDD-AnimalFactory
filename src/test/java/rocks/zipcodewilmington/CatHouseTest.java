package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

import static rocks.zipcodewilmington.animals.animal_storage.CatHouse.getCatById;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // DONE - Create tests for `void add(Cat cat)`
    // DONE - Create tests for `void remove(Integer id)`
    // DONE - Create tests for `void remove(Cat cat)`
    // DONE - Create tests for `Cat getCatById(Integer id)`
    // DONE - Create tests for `Integer getNumberOfCats()`

    CatHouse catHouse = new CatHouse();

    @Test // test that a cat was added to the catHouse
    public void testAdd() {
        // Given
        Cat cat = new Cat("Naomi", new Date(), 9);
        String expected = "Naomi";
        // When
        catHouse.add(cat);
        Cat actual = getCatById(9);
        // Then
        Assert.assertEquals(expected, actual.getName());
    }

    @Test // Create tests for `remove(Integer id)`
    public void testRemoveById() {
        // Given
        Cat cat = new Cat("Black Cat", new Date(), 13);
        Integer expected = null;
        // When
        catHouse.add(cat);
        catHouse.remove(13);
        Cat actual = getCatById(13);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test // Create tests for `void remove(Cat cat)`
    public void testRemove() {
        // Given
        Cat cat = new Cat("Black Cat", new Date(), 130);
        Integer expected = null;
        // When
        catHouse.add(cat);
        catHouse.remove(cat);
        Cat actual = catHouse.getCatById(130);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test // Create tests for `Cat getCatById(Integer id)`
    public void testGetCatById() {
        // Given
        Cat cat = new Cat("Black Cat", new Date(), 13);
        // When
        catHouse.add(cat);
        Cat actual = getCatById(13);
        // Then
        Assert.assertEquals(cat, actual);
    }

    @Test // Create tests for `Integer getNumberOfCats()`
    public void testGetNumberOfCats() {
        // Given
        Cat cat1 = new Cat("Naomi", new Date(), 1);
        Cat cat2 = new Cat("Ellie", new Date(), 2);
        Cat cat3 = new Cat("Rosie", new Date(), 3);
        Integer expected = 3;
        // When
        catHouse.add(cat1);
        catHouse.add(cat2);
        catHouse.add(cat3);
        Integer actual = catHouse.getNumberOfCats();
        // Then
        Assert.assertEquals(expected, actual);
    }

}
