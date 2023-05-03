package edu.guilford;

public class Cat extends Pet {

    // attributes for Cat
    private String furPattern;
    private String furType;

    // constructor for Cat
    public Cat(String furPattern, String furType, String name, int age, String species,
            double weight, String gender, String color, String breed, String owner, String favoriteToy) {
        super(name, age, species, weight, gender, color, breed, owner, favoriteToy);
        this.furPattern = furPattern;
        this.furType = furType;
    }

    // implement play method from Pet
    public void play() {
        // if the cat's favorite toy is a ball, print this statement
        if (favoriteToy == "tree") {
            System.out.println("My cat is climbing their " + favoriteToy + ".");
        } else {
            // if the cat's favorite toy is not a ball, print this statement
            System.out.println("My cat is playing with their " + favoriteToy + ".");
        }
    }

    // implement getSound method from Pet
    public String getSound() {
        return "Meow!";
    }

    // use inheritance and call the toString method from Pet
    @Override
    public String toString() {
        return super.toString() + "\nFur Pattern: " + furPattern + "\nFur Type: " + furType + "\n";
    }

}
