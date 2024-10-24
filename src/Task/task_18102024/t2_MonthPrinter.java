package Task.task_18102024;

import java.util.Scanner;

public class t2_MonthPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number (1-12):");
        int monthNumber = sc.nextInt();

//Switch statement can be replaced with enhanced 'switch'

        String monthName = switch (monthNumber) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid month number";
        };

        System.out.println("Month: " + monthName);

        sc.close();
    }
}