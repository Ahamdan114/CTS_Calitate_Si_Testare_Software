package Factory;

import java.util.Locale;

public class AnimalFactory {
    private static Animal instance;

    public static Animal createAnimal(String type) {
        return switch (type.toLowerCase(Locale.ROOT)) {
            case "dog" -> (instance == null || instance.getClass() != Dog.class) ? new Dog() : instance;
            case "cat" -> (instance == null || instance.getClass() != Cat.class) ? new Cat() : instance;
            default -> (Animal) new IllegalArgumentException("Invalid Animal Type");
        };
    }
}
