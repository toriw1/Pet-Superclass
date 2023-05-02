package edu.guilford;

public class Fish extends Pet {

    // attributes for Fish
    private String finType;
    private String waterType;
    private double length;

    // constructor for Fish
    public Fish(String finType, String waterType, double length) {
        super(name, age, species, weight, gender, color, breed, owner, favoriteToy);
        this.finType = finType;
        this.waterType = waterType;
        this.length = length;
    }

    // implement play method from Pet
    public void play() {
        // if the fish's favorite toy is a ball, print this statement
        if (favoriteToy == "castle") {
            System.out.println("My fish is swimming around their " + favoriteToy + ".");
        } else {
            // if the fish's favorite toy is not a ball, print this statement
            System.out.println("My fish is playing with their " + favoriteToy + ".");
        }
    }

    // implement getSound method from Pet
    public String getSound() {
        return "Blub!";
    }

}
