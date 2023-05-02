package edu.guilford;

public class Fish extends Pet {

    // attributes for Fish
    private int finAmount;
    private String waterType;
    private double length;

    // constructor for Fish
    public Fish(int finAmount, String waterType, double length, String name, int age, String species, 
    double weight, String gender, String color, String breed, String owner, String favoriteToy) {
        super(name, age, species, weight, gender, color, breed, owner, favoriteToy);
        this.finAmount = finAmount;
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

    // use inheritance and call the toString method from Pet
    @Override
    public String toString() {
        return super.toString() + "\nFin Amount: " + finAmount + "\nWater Type: " + waterType + "\nLength: " + length + " inches" + "\n";
    }

}
