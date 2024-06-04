import java.util.List;

abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void sound();
}

class Dog extends Animal {
    Dog() {
        super("Dog");
    }

    void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    Cat() {
        super("Cat");
    }

    void sound() {
        System.out.println("Meow");
    }
}

class Cow extends Animal {
    Cow() {
        super("Cow");
    }

    void sound() {
        System.out.println("Moo");
    }
}

class AnimalSounds {
    void playSounds(List<Animal> animals) {
        for (Animal animal : animals) {
            animal.sound();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = List.of(new Dog(), new Cat(), new Cow());
        AnimalSounds animalSounds = new AnimalSounds();
        animalSounds.playSounds(animals);
    }
}
