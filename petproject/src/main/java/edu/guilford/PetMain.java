package edu.guilford;

public class PetMain 
{
    public static void main( String[] args )
    {
        // print statement for output formatting
        System.out.println("Dog Objects: ");
        // instantiate and print three Dog objects
        Dog myDog = new Dog("short", "long", "floppy", "Molly" , 6, "Dog", 16.3, "Female", "Brown", "Beagle", "Jake", "ball");
        System.out.println("Dog 1: " + myDog.toString());
        Dog myDog2 = new Dog("long", "short", "pointed", "Daisy", 3, "Dog", 2.8, "Female", "Black", "Yorkie", "Tori", "stuffed duck");
        System.out.println("Dog 2: " + myDog2.toString());
        Dog myDog3 = new Dog ("short", "short", "folded", "Sissy", 16, "Dog", 15, "Female", "White", "Jack Russell", "Ryan", "plush snake");
        System.out.println("Dog 3: " + myDog3.toString());
        // call the play method from Dog
        myDog.play();
        // call the getSound method from Dog
        System.out.println(myDog.getSound());

        // print statement for output formatting
        System.out.println("Cat Object: ");
        // instantiate and print three Cat objects
        Cat myCat = new Cat("short", "tabby", "Ginger", 9, "Cat", 10, "Male", "Orange", "Bengal", "B", "tree");
    }
}
