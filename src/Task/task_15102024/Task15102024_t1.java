package Task.task_15102024;

public class Task15102024_t1 {
    // finds the maximum of two numbers.
    public static void main(String[] args) {
        // Largest number among two numbers
        int x = 8;
        int y = 4;
        int z = 76;
        // Rough logic x > y ->  x : y
        int max = x > y ? x : y;
        // String max = x > y ? "Max is -> x" : "Max is -> y";
        System.out.println(" largest number of two number " + max);


// Largest number among three numbers



        int Maximum_number = x > y && x > z ? x : y > z ? y : z;
        System.out.println(" largest number of three number " + Maximum_number);


    }
}
