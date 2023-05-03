package edu.guilford;

import java.util.Arrays;

public class PetMain {
    public static void main(String[] args) {
        // print statement for output formatting
        System.out.println("Dog Objects: ");
        // instantiate and print three Dog objects
        Dog myDog = new Dog("long", "short", "pointed", "Daisy", 3, "Dog", 2.8, "Female", "Black", "Yorkie", "Tori",
                "stuffed duck");
        System.out.println("Dog 1: " + myDog.toString());
        Dog myDog2 = new Dog("short", "short", "folded", "Sissy", 16, "Dog", 15, "Female", "White", "Jack Russell",
                "Ryan", "plush snake");
        System.out.println("Dog 2: " + myDog2.toString());
        Dog myDog3 = new Dog("short", "long", "floppy", "Molly", 6, "Dog", 16.3, "Female", "Brown", "Beagle", "Jake",
                "ball");
        System.out.println("Dog 3: " + myDog3.toString());
        // call the play method from Dog
        myDog3.play();
        // call the getSound method from Dog
        System.out.println(myDog3.getSound() + "\n");

        // print statement for output formatting
        System.out.println("Cat Objects: ");
        // instantiate and print three Cat objects
        Cat myCat = new Cat("tabby", "short", "Ginger", 9, "Cat", 10, "Male", "Orange", "Bengal", "Betty", "tree");
        System.out.println("Cat 1: " + myCat.toString());
        Cat myCat2 = new Cat("calico", "long", "Caramel", 4, "Cat", 8, "Female", "White", "Persian", "Jane",
                "squeaky rat");
        System.out.println("Cat 2: " + myCat2.toString());
        Cat myCat3 = new Cat("solid", "short", "Merlin", 6, "Cat", 12, "Male", "Grey", "Siamese", "Tom",
                "feather stick");
        System.out.println("Cat 3: " + myCat3.toString());
        // call the play method from Cat
        myCat.play();
        // call the getSound method from Cat
        System.out.println(myCat.getSound() + "\n");

        // print statement for output formatting
        System.out.println("Fish Objects: ");
        // instantiate and print three Fish objects
        Fish myFish = new Fish(5, "fresh", 1.7, "Goldie", 1, "Fish", 0.5, "Female", "Gold", "Goldfish", "Sally",
                "ring");
        System.out.println("Fish 1: " + myFish.toString());
        Fish myFish2 = new Fish(7, "fresh", 2.5, "Spike", 2, "Fish", 0.65, "Male", "Red", "Betta", "Xander",
                "plastic plant");
        System.out.println("Fish 2: " + myFish2.toString());
        Fish myFish3 = new Fish(3, "fresh", 1.5, "Gil", 1, "Fish", 0.2, "Male", "White", "Guppy", "Zoe", "castle");
        System.out.println("Fish 3: " + myFish3.toString());
        // call the play method from Fish
        myFish.play();
        // call the getSound method from Fish
        System.out.println(myFish.getSound() + "\n");

        // put the pet objects into an array
        Pet[] pets = { myDog, myDog2, myDog3, myCat, myCat2, myCat3, myFish, myFish2, myFish3 };

        // call the compareTo method from Pet
        Arrays.sort(pets);
        // print statement for output formatting
        System.out.println("Pets sorted by weight: ");
        // print the pets array
        for (Pet pet : pets) {
            if (pet.getWeight() > 0) {
                System.out.println(pet.getName() + " is " + pet.getWeight() + " pounds.");
            } else {
                System.out.println("No pets found.");
            }
        }

    }

}
