package edu.guilford;

public class PetMain 
{
    public static void main( String[] args )
    {
        // create a Dog object using the super constructor
        Dog myDog = new Dog("short", "long", "floppy");
        // set the dog's attributes using super() in the Dog constructor
        myDog.setName("Molly");
        myDog.setAge(6);
        myDog.setSpecies("Dog");
        myDog.setWeight(16.0);
        myDog.setGender("Female");
        myDog.setColor("Brown");
        myDog.setBreed("Beagle");
        myDog.setOwner("Tori");
        myDog.setFavoriteToy("ball");
        // print the dog's attributes in one statement
        System.out.println("My dog's name is " + myDog.getName() + ". She is a " + myDog.getAge() + " year old " + myDog.getGender() + " " + myDog.getBreed() + ". She weighs " + myDog.getWeight() + " pounds and her favorite toy is a " + myDog.getFavoriteToy() + ".");
        // call the play method from Dog
        myDog.play();
        // call the getSound method from Dog
        System.out.println(myDog.getSound());
    }
}
