package rocks.zipcodewilmington.animals.animal_storage;


import rocks.zipcodewilmington.animals.Cat;

/**
 * @author leon on 4/19/18.
 */
public class CatHouse {
    private static AnimalWarehouse<Cat> catHouse = new AnimalWarehouse<>(); // create catHouse array

    public static void add(Cat cat) {
        catHouse.add(cat);
    } // add object cat from Cat class to catHouse array

    public static void remove(Integer id) {
        catHouse.removeAnimalById(id);
    } // use remove...ID method from AnimalWarehouse

    public static void remove(Cat cat) {
        catHouse.removeAnimal(cat);
    } // use removeAnimal method from AnimalWarehouse

    public static Cat getCatById(Integer id) {
        return catHouse.getAnimalById(id);
    } //

    public static Integer getNumberOfCats() {
        return catHouse.getNumberOfAnimals();
    } //

    public static void clear() {
        catHouse.clear();
    } //
}