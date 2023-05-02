package edu.guilford;

public abstract class Pet {

    // attributes
    protected static String name;
    protected static int age;
    protected static String species;
    protected static double weight;
    protected static String gender;
    protected static String color;
    protected static String breed;
    protected static String owner;
    protected static String favoriteToy;

    // constructor 
    public Pet(String name, int age, String species, double weight, String gender, String color, String breed, String owner, String favoriteToy) {
        Pet.name = name;
        Pet.age = age;
        Pet.species = species;
        Pet.weight = weight;
        Pet.gender = gender;
        Pet.color = color;
        Pet.breed = breed;
        Pet.owner = owner;
        Pet.favoriteToy = favoriteToy;
    }

    // getters and setters
    public String getName() {
        return Pet.name;
    }

    public void setName(String newName) {
        Pet.name = newName;
    }

    public int getAge() {
        return Pet.age;
    }

    public void setAge(int newAge) {
        Pet.age = newAge;
    }

    public String getSpecies() {
        return Pet.species;
    }

    public void setSpecies(String newSpecies) {
        Pet.species = newSpecies;
    }

    public double getWeight() {
        return Pet.weight;
    }

    public void setWeight(double newWeight) {
        Pet.weight = newWeight;
    }

    public String getGender() {
        return Pet.gender;
    }

    public void setGender(String newGender) {
        Pet.gender = newGender;
    }

    public String getColor() {
        return Pet.color;
    }

    public void setColor(String newColor) {
        Pet.color = newColor;
    }

    public String getBreed() {
        return Pet.breed;
    }

    public void setBreed(String newBreed) {
        Pet.breed = newBreed;
    }

    public String getOwner() {
        return Pet.owner;
    }

    public void setOwner(String newOwner) {
        Pet.owner = newOwner;
    }

    public String getFavoriteToy() {
        return Pet.favoriteToy;
    }

    public void setFavoriteToy(String newFavoriteToy) {
        Pet.favoriteToy = newFavoriteToy;
    }



    // methods
    public abstract void play();

    public abstract String getSound();

    public String speak() {
        return "I am a " + Pet.species + " and I say " + this.getSound();
    }

}

