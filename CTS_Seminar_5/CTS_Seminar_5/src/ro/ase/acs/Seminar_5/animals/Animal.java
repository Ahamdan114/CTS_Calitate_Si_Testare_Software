package ro.ase.acs.Seminar_5.animals;

public interface Animal {
    void sound();
}

class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Woof");
    }
}

class Cat implements Animal {

    @Override
    public void sound() {
        System.out.println("Meow");
    }
}


interface AnimalFactory {
    Animal createAnimal();
}

class DogFactory implements AnimalFactory {

    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}

class CatFactory implements AnimalFactory {

    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}

