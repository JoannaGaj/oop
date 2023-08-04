package oop;

import oop.Animals.Animal;
import oop.Animals.Cat;
import oop.Animals.Dog;

public class AnimalWorld {
    public static void main(String[] args) {
        System.out.println("Witaj w świecie zwierząt");

        Animal animal1 = new Animal();
        animal1.setName("zwierzak");
        System.out.println("Moje imię to " + animal1.getName());

        Animal animal2 = new Animal();
        animal2.setName("Ruby");
        System.out.println("Moje imię to " + animal2.getName());

        Animal animal3 = new Animal();
        System.out.println("Moje imię to " + animal3.getName());

        Animal animal4 = new Animal("Minionek");
        System.out.println("Moje imię to " + animal4.getName());

        Animal animal5 = new Animal("Dino");
        animal5.printInfo();

        Animal animal6 = new Animal("Maniek");
        animal6.printInfo();

        Animal animal7 = new Animal("Wiktor", 9);
        animal7.printInfo();
        animal7.useVoice();

        System.out.println(animal7);

        System.out.println("## KOCIA CZĘŚC");
        Cat cat1 = new Cat();
        cat1.setName("kot");
        cat1.printInfo();
        cat1.useVoice();
        cat1.catchMouse();

        Dog dog1 = new Dog();
        dog1.useVoice();
        dog1.catchPostman();


        // nie powinniśmy dawac bezpośredniego dostepu do pól klasy
//        animal1.name = "zwierzak";
//        System.out.println(animal1.name);
    }
}
