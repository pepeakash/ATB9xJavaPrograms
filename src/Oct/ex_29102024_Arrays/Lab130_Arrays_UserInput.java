package Oct.ex_29102024_Arrays;
// package keyword is used to create a package in Java

import java.util.Scanner;
// import keyword is used to import a class into our class
// Java keyword is used by Java compiler to understand the code and do the appropriate action
// .util is a package in Java which contains the classes like Scanner, ArrayList, Arrays etc
// Scanner is a class in Java which is used to take the input from user


public class Lab130_Arrays_UserInput {
// public keyword is an access modifier which represents visibility,
// it means it is visible to all
// class keyword is used to declare a class in java
// class in java means a blueprint for objects, you can create an object from a class,
// it contains methods, variables etc
// object is an instance of class
// instance means creation of object in memory

// Lab130_Arrays_UserInput is the name of class


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array that you want to create!");
        int size = sc.nextInt();
        int[] numbers = new int[size]; // where size is the length of Array , provided by user

        for (int i = 0; i < size; i++) {
            System.out.println("Enter te number " + (i+1));
            numbers[i] = sc.nextInt();
        }


        System.out.println(" --- ");
        // Print the numbers entered by the user
        System.out.println("The numbers are:");
//        for (int i = 0; i < numbers.length; i++) {
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }





    }

}
