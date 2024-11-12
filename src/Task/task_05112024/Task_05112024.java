package Task.task_05112024;

import java.util.Scanner;

public class Task_05112024 {

    // Inner Dog class
    static class Dog {
        // Attributes
        private String name;
        private String breed;
        private int age;
        private String color;
        private double weight;

        // Constructor
        public Dog(String name, String breed, int age, String color, double weight) {
            this.name = name;
            this.breed = breed;
            this.age = age;
            this.color = color;
            this.weight = weight;
        }

        // Behaviors
        public void bark() {
            System.out.println(name + " is barking!");
        }

        public void eat() {
            System.out.println(name + " is eating.");
        }

        public void sleep() {
            System.out.println(name + " is sleeping.");
        }

        public void play() {
            System.out.println(name + " is playing.");
        }

        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Breed: " + breed);
            System.out.println("Age: " + age + " years");
            System.out.println("Color: " + color);
            System.out.println("Weight: " + weight + " kg");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Creating 5 Dog objects
        Dog dog1 = new Dog("Buddy", "Golden Retriever", 3, "Golden", 30.5);
        Dog dog2 = new Dog("Max", "Beagle", 5, "Brown and White", 12.3);
        Dog dog3 = new Dog("Bella", "Labrador", 4, "Black", 25.0);
        Dog dog4 = new Dog("Charlie", "Poodle", 2, "White", 10.2);
        Dog dog5 = new Dog("Rocky", "German Shepherd", 6, "Black and Tan", 35.8);

        // Displaying information and calling behaviors for each Dog object
        dog1.displayInfo();
        dog1.bark();
        dog1.eat();
        dog1.sleep();
        dog1.play();

        System.out.println("------------------");

        dog2.displayInfo();
        dog2.bark();
        dog2.eat();
        dog2.sleep();
        dog2.play();

        System.out.println("------------------");

        dog3.displayInfo();
        dog3.bark();
        dog3.eat();
        dog3.sleep();
        dog3.play();

        System.out.println("------------------");

        dog4.displayInfo();
        dog4.bark();
        dog4.eat();
        dog4.sleep();
        dog4.play();

        System.out.println("------------------");

        dog5.displayInfo();
        dog5.bark();
        dog5.eat();
        dog5.sleep();
        dog5.play();
    }
}
