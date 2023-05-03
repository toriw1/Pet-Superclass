package edu.guilford;

import java.text.DecimalFormat;

// create a Dog class that extends Pet
public class Dog extends Pet {

    // attributes for Dog
    private String furType;
    private String tailType;
    private String earType;

    DecimalFormat df = new DecimalFormat("#0.00");

    // constructor for Dog
    public Dog(String furType, String tailType, String earType, String name, int age, String species,
            double weight, String gender, String color, String breed, String owner, String favoriteToy) {
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

    // use inheritance and call the toString method from Pet
    @Override
    public String toString() {
        return super.toString() + "\nFur Type: " + furType + "\nTail Type: " + tailType + "\nEar Type: " + earType
                + "\n";
    }

}