package Oct.ex_16102024_Conditions_Loops;

import java.util.Scanner;

public class Lab065_Scanner {
    public static void main(String[] args) {
        // Scanner - Class
        Scanner scanner = new Scanner(System.in); // System.in - Standard Input // Keyboard // Console // Scanner - Object // scanner - Reference
        System.out.println("Enter the age");
        // int age = scanner.nextInt(); //.nextInt() - Method is used to take the input from the user in the form of integer in the console
//        float age = scanner.nextFloat(); //.nextFloat() - Method is used to take the input from the user in the form of float in the console
        double age = scanner.nextDouble(); //.nextDouble() - Method is used to take the input from the user in the form of double in the console

        System.out.println(age > 25 ? "Allowed to Goa" : "Not Allowed");


        scanner.close();
        // Close the Scanner because it is a resource and it is a good practice to close the resource else it will consume the memory and
        // it will not be available for the other programs


    }
}
