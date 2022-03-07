package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //DONE - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

  @Test
    public void testCreateDog() {
      // Given
      String expectedName = "Cheddar";
      Date expectedDate = new Date();
      Integer expected = 1;
      // When
      Dog animal = AnimalFactory.createDog(expectedName, expectedDate);
      DogHouse.add(animal);
      Integer actual = DogHouse.getNumberOfDogs();
      // Then
      Assert.assertEquals(expected, actual);
  }

  @Test
  public void testCreateCat() {
    // Given
    String expectedName = "NiNi";
    Date expectedDate = new Date();
    Integer expected = 1;
    // When
    Cat cat = AnimalFactory.createCat(expectedName, expectedDate);
    CatHouse.add(cat);
    Integer actual = CatHouse.getNumberOfCats();
    // Then
    Assert.assertEquals(expected, actual);
  }

}
