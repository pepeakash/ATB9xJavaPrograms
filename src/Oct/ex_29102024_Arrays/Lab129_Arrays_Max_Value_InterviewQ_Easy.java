package Oct.ex_29102024_Arrays;

import java.util.Arrays;

public class Lab129_Arrays_Max_Value_InterviewQ_Easy {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        Arrays.sort(array); // Arrays.sort is a method to sort the Array in ascending order
        System.out.println(array[array.length-1]);
        // array[array.length-1] gives the last element of Array
        // which is the max value of Array


    }

}
