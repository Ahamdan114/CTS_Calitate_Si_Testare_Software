package ro.ase.acs.Seminar_5.animals;

import ro.ase.acs.Seminar_5.animals.Animal;
import ro.ase.acs.Seminar_5.animals.AnimalFactory;
import ro.ase.acs.Seminar_5.animals.CatFactory;
import ro.ase.acs.Seminar_5.animals.DogFactory;

public class Main {
    public static void main(String[] args) {
        AnimalFactory dogFactory = new DogFactory();
        Animal dog = dogFactory.createAnimal();
        dog.sound();

        AnimalFactory catFactory = new CatFactory();
        Animal cat = catFactory.createAnimal();
        cat.sound();
    }
}

