package Oct.ex_29102024_Arrays;

public class Lab126_Arrays_P2 {
    public static void main(String[] args) {
        // Creation, Size - Fix
        int[] marks_2 = new int[5]; //Fixed length Array = 5
        System.out.println(marks_2.length); // .length is a property of Array to get the size of Array
        // output: 5
        marks_2[0] = 11; //index 0 gives 1st element of Array
        marks_2[1] = 12;
        marks_2[2] = 13;
        marks_2[3] = 14;
        marks_2[4] = 15;
        System.out.println(marks_2[0]);
        System.out.println(marks_2[1]);
        System.out.println(marks_2[4]);
//         System.out.println(marks_2[-1]); // ArrayIndexOutOfBoundsException
        //System.out.println(marks_2[10]); // ArrayIndexOutOfBoundsException

        //int[] a = new int[-1];
        //System.out.println(a); // NegativeArraySizeException




    }
}
