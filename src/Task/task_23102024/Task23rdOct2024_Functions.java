// Create a Function of Sub, Sum, Mul and Div with parameter, a, b (take the parameter from the User)
package Task.task_23102024;

import java.util.Scanner;

public class Task23rdOct2024_Functions {
    public static void main(String[] args) {

        // Calling all the functions with user inputs

        // 1. Calling Function Without Parameters and Without return Type
        add();

        // 2. Calling Function Without Parameters and with return Type
        double result = sub();
        System.out.println("Subtraction Result: " + result);

        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the first and second numbers
        System.out.println("Enter the first number for Multiplication and Division: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number for Multiplication and Division:  ");
        double num2 = scanner.nextDouble();

        // Close the scanner
        scanner.close();

        // 3. Calling Function With Parameters and Without return Type
        multiply(num1, num2);

        // 4. Calling Function With Parameters and With return Type
        double divisionResult = divide(num1, num2);
        System.out.println("Division Result: " + divisionResult);
    }

    // 1. Declaring Function Without Parameters and Without return Type
    static void add() {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the first and second numbers
        System.out.println("Enter the first number for Addition:  ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number for Addition:  ");
        double num2 = scanner.nextDouble();

        double result = num1 + num2;
        System.out.printf("Addition Result: %f + %f = %f %n", num1, num2, result);
    }

    // 2. Declaring Function Without Parameters and with return Type
    static double sub() {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the first and second numbers
        System.out.println("Enter the first number for Subtraction ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number for Subtraction ");
        double num2 = scanner.nextDouble();

        return num1 - num2;
    }

    // 3. Declaring Function With Parameters and Without return Type
    static void multiply(double num1, double num2) {
        double result = num1 * num2;
        System.out.printf("Multiplication Result: %f * %f = %f %n", num1, num2, result);
    }

    // 4. Declaring Function With Parameters and With return Type
    static double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
    }
}