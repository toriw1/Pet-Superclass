package edu.guilford;

public class Cat extends Pet {

    // attributes for Cat
    private String furPattern;
    private String furType;

    // constructor for Cat
    public Cat(String furPattern, String furType) {
        super(name, age, species, weight, gender, color, breed, owner, favoriteToy);
        this.furType = furPattern;
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

}
