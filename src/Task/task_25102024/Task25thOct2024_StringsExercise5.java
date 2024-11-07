// Create a Function of Sub, Sum, Mul and Div with parameter, a, b (take the parameter from the User)
package Task.task_25102024;

public class Task25thOct2024_StringsExercise5 {

    public static void main(String[] args) {

        String s2 = "Hello";
        String s3 = "Hello";    // SCP
        String s6 = "Hello";

        String a8 = new String ("Hello");
        String a7 = new String("hello");   // OA

        // 3 Strings

        // comparision = checks the reference location

        System.out.println(s2==s3); // true
        System.out.println(s6==a7); // false because s6 is SCP and a7 is OA

        // Equals = checks the (content) value
        // equals == value
        //==(Comparison)->Check reference location(memory)   -> true/false

        System.out.println(s2.equals(a7)); // false because of case sensitive
        System.out.println(s2.equalsIgnoreCase(a7)); // true because of ignoring case sensitive


    }


}