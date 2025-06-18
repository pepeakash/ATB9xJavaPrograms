package Oct.ex_17102024_IfCondition;
import java.util.Scanner;
public class LeapYearChecker {
    public static void main(String[] args) {

        /*
        Leap Year Check:
If the year is divisible by 4, it might be a leap year.
If the year is also divisible by 100, it must be divisible by 400 to be a leap year.
If the year is not divisible by 100, it is a leap year.
If the year is not divisible by 4, it is not a leap year.

         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = sc.nextInt();
        boolean isLeapYear;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                } else {
                    isLeapYear = false;
                }
            } else {
                isLeapYear = true;
            }
        } else {
            isLeapYear = false;
        }
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        sc.close();
    }
}