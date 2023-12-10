package week10;

import java.util.Objects;

public class Dog {
    // Member variables (aka properties, fields, instance variables, etc)
    private String breed;
    private int age;

    public Dog(String breed, int age) {
        this.breed = breed;
        this.age = age;
    }

    public Dog(String breed) {
        this.breed = breed;
    }

    public Dog() {
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method (behaviour)
    public void bark() {
        System.out.println("Woof!");
    }
}

 class Main {
    public static void main(String[] args) {
        // Instantiating an object
        // myDog is an instance reference variable
        Dog myDog = new Dog("Labrador", 3);

        // Accessing methods
        myDog.bark();

        // Using getters and setters
        System.out.println("Breed " + myDog.getBreed());
        myDog.setBreed("Golden Retriever");
        System.out.println("Updated Breed " + myDog.getBreed());
    }
}