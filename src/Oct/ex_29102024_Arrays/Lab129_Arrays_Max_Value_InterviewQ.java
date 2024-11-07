package Oct.ex_29102024_Arrays;

public class Lab129_Arrays_Max_Value_InterviewQ {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int max_value = give_max(array);
        // give_max is a method to get the max value from Array
        // give_max is a static method, so we can call it directly using class name
        // give_max is a method which takes an Array as input and returns an integer value

        int min_value = give_min(array);
        // give_min is a method to get the min value from Array
        // give_min is a static method, so we can call it directly using class name
        // give_min is a method which takes an Array as input and returns an integer value

        System.out.printf("Max Value is %d", max_value);
        // where %d is a placeholder for integer value

        System.out.println();
        System.out.printf("Min Value is %d", min_value);

    }

    // where static keyword is used to call this method directly using class name
    // example : Lab129_Arrays_Max_Value_InterviewQ.give_max(array);
    // int is the return type of this method
    // give_max is the name of this method
    static int give_max(int[] array) {
        int max = array[0]; // index 0 gives 1st element of Array
        for (int i = 0; i < array.length ; i++) {
            if(array[i] > max ){
                max = array[i];
            }
        }

        return max;
    }

    static int give_min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length ; i++) {
            if(array[i] < min ){
                min = array[i];
            }
        }

        return min;
    }
}
