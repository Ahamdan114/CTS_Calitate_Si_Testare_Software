package Factory;

public class Main {
    public static void main(String[] args) {
        Animal animal = AnimalFactory.createAnimal("Dog");
        animal.sound();
        animal = AnimalFactory.createAnimal("Cat");
        animal.sound();
        animal = AnimalFactory.createAnimal("dog");
        animal.sound();
    }
}
