package Task.task_29102024;

import java.util.Scanner;

public class Task29thOct2024_Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int size = sc.nextInt();

        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter value at index " + i);
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.println("Duplicate value is present: " + a[i]);
                }
            }
        }
    }
}
