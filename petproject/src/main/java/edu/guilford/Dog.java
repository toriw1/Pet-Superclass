package edu.guilford;

// create a Dog class that extends Pet
public class Dog extends Pet {

    // attributes for Dog
    private String furType;
    private String tailType;
    private String earType;

    // constructor for Dog
    public Dog(String furType, String tailType, String earType) {
        super(name, age, species, weight, gender, color, breed, owner, favoriteToy);
        this.furType = furType;
        this.tailType = tailType;
        this.earType = earType;
    }

    // implement play method from Pet
    public void play() {
        // if the dog's favorite toy is a ball, print this statement
        if (favoriteToy == "ball") {
            System.out.println("My dog is playing fetch with their " + favoriteToy + ".");
        } else {
            // if the dog's favorite toy is not a ball, print this statement
            System.out.println("My dog is playing with their " + favoriteToy + ".");
        }
    }

    // implement getSound method from Pet
    public String getSound() {
        return "Woof!";
    }
}