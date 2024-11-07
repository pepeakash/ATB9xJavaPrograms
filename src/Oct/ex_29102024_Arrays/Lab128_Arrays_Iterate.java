package Oct.ex_29102024_Arrays;

import java.util.Arrays;

public class Lab128_Arrays_Iterate {
    public static void main(String[] args) {
        int[] marks = {51, 100, 91, 87, 90};
        System.out.println(marks.length); // .length is a property of Array to get the size of Array
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        System.out.println("  - - - - - -");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        Arrays.sort(marks); // {51,87,90,91,100}; //.sort is a method of Arrays to sort the Array
        int item_index = Arrays.binarySearch(marks, 100);
        /*
         Arrays.binarySearch(marks, 100); // where Arrays is a class, binarySearch is a method of Arrays to search the item in Array
         where marks is an Array, 100 is the item to be searched in Array
         */

        System.out.println(item_index); // item_index = 4





    }
}
