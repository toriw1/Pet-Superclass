package edu.guilford;

import java.text.DecimalFormat;

public abstract class Pet implements Comparable<Pet> {

    // attributes
    protected String name;
    protected int age;
    protected String species;
    protected double weight;
    protected String gender;
    protected String color;
    protected String breed;
    protected String owner;
    protected String favoriteToy;

    DecimalFormat df = new DecimalFormat("#0.00");

    // constructor
    public Pet(String name, int age, String species, double weight, String gender, String color, String breed,
            String owner, String favoriteToy) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.weight = weight;
        this.gender = gender;
        this.color = color;
        this.breed = breed;
        this.owner = owner;
        this.favoriteToy = favoriteToy;
    }

    // getters and setters
    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public String getSpecies() {
        return this.species;
    }

    public void setSpecies(String newSpecies) {
        this.species = newSpecies;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double newWeight) {
        this.weight = newWeight;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String newGender) {
        this.gender = newGender;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String newBreed) {
        this.breed = newBreed;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String newOwner) {
        this.owner = newOwner;
    }

    public String getFavoriteToy() {
        return this.favoriteToy;
    }

    public void setFavoriteToy(String newFavoriteToy) {
        this.favoriteToy = newFavoriteToy;
    }

    // methods
    public abstract void play();

    public abstract String getSound();

    // toString method
    public String toString() {
        return ("Name: " + name + ", Age: " + age + ", Species: " + species + ", Weight: " + df.format(weight)
                + ", Gender: " + gender +
                ", Color: " + color + ", Breed: " + breed + ", Owner: " + owner + ", Favorite Toy: " + favoriteToy);
    }

    // compareTo method for sorting by weight
    public int compareTo(Pet other) {
        if (this.weight < other.weight) {
            return -1;
        } else if (this.weight > other.weight) {
            return 1;
        } else {
            return 0;
        }
    }
}
