package Task.task_29102024;

import java.util.Arrays;
import java.util.Scanner;

public class Task29thOct2024_Task1 {

    public static void main(String[] args) {
        // Create a sorted array
        int[] numbers = {1, 3, 5,  15, 17, 19, 7, 9, 11, 13, 15, 17, 19};



        Arrays.sort(numbers);
        System.out.println("sorted Array : " + Arrays.toString(numbers));
        // Value to search for
        int valueToFind =999;

        // Perform binary search
        int index = Arrays.binarySearch(numbers, valueToFind);

        // Output the result
        if (index >= 0) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found. It would be inserted at index: " + index); // -14
            System.out.println("Element not found. It would be inserted at index: " + -(index + 1)); // 13
        }
    }


}
