package Task.task_16102024;

import java.util.Scanner;

public class task_16102024_t1 {
    public static void main(String[] args) {
        //Take a user input - Name, Age and Salary and print them in the end.
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name \n ");
        String name = sc.next();
        System.out.println("enter your age \n");
        byte age = sc.nextByte();
        System.out.println("enter your salary \n");
        int salary = sc.nextInt();
        sc.close();


    }
}
