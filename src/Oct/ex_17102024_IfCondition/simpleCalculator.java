package Oct.ex_17102024_IfCondition;

import java.util.Scanner;

public class simpleCalculator {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter first number:");
            double num1 = sc.nextDouble();

            System.out.println("Enter second number:");
            double num2 = sc.nextDouble();

            System.out.println("Enter an operator (+, -, *, /, %):");
            char operator = sc.next().charAt(0);

            double result;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Division by zero");
                    }
                    break;
                case '%':
                    if (num2 != 0) {
                        result = num1 % num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Division by zero");
                    }
                    break;
                default:
                    System.out.println("Invalid operator");
                    break;
            }

            sc.close();
        }
    }

