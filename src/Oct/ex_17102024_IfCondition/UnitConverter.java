package Oct.ex_17102024_IfCondition;

import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select conversion type:");
        System.out.println("1. Kilometers to Miles");
        System.out.println("2. Miles to Kilometers");
        System.out.println("3. Celsius to Fahrenheit");
        System.out.println("4. Fahrenheit to Celsius");
        int choice = sc.nextInt();

        double input, result;

        switch (choice) {
            case 1:
                System.out.println("Enter kilometers:");
                input = sc.nextDouble();
                result = input * 0.621371;
                System.out.println(input + " kilometers is " + result + " miles.");
                break;
            case 2:
                System.out.println("Enter miles:");
                input = sc.nextDouble();
                result = input / 0.621371;
                System.out.println(input + " miles is " + result + " kilometers.");
                break;
            case 3:
                System.out.println("Enter Celsius:");
                input = sc.nextDouble();
                result = (input * 9/5) + 32;
                System.out.println(input + " Celsius is " + result + " Fahrenheit.");
                break;
            case 4:
                System.out.println("Enter Fahrenheit:");
                input = sc.nextDouble();
                result = (input - 32) * 5/9;
                System.out.println(input + " Fahrenheit is " + result + " Celsius.");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

        sc.close();
    }
}