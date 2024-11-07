// Create a Function of Sub, Sum, Mul and Div with parameter, a, b (take the parameter from the User)
package Task.task_25102024;

import java.util.Scanner;

public class Task25thOct2024_StringsExercise1 {
    public static void main(String[] args) {

        //1. String creation
        // String can be created using String "literals" or "new" key word
        //String literals are pooled, while new creates a new object

        String Str1 = "Java Program"; //Using string literals
        String Str2 = new String("Java Program"); //Using new keyword

        //2. Baisc Methods
            /*length(): Returns string length
                toUpperCase(): Converts to uppercase
                toLowerCase(): Converts to lowercase*/

        System.out.println("Length: " + Str1.length());   //Length: 12
        System.out.println("Uppercase: " + Str1.toUpperCase()); //Uppercase: JAVA PROGRAM
        System.out.println("Lowercase: " + Str1.toLowerCase()); //Lowercase: java program

        //3.String Comparison:
        //equals(): Case-sensitive comparison
        //equalsIgnoreCase(): Case-insensitive comparison

        String comparison1 = "Java";
        String comparison2 = "java";
        System.out.println(comparison1.equals(comparison2)); //false
        System.out.println(comparison1.equalsIgnoreCase(comparison2)); //true

        //4.Substring:
        //substring(beginIndex): Extracts from beginIndex to end
        //substring(beginIndex, endIndex): Extracts portion between indices

        String substring = "Java Programming";
        System.out.println(substring.substring(5)); //Programming
        System.out.println(substring.substring(1, 7)); //ava Pr

        //5.String Search:
        //contains(): Checks if string contains substring
        //indexOf(): Returns first occurrence index (-1 if not found)

        String search = "I am learing Java";
        System.out.println(search.contains("am")); //// Output: true
        System.out.println(search.indexOf("Java")); //13

        //6.String Manipulation:
        //Concatenation using + operator
        //concat() method for joining strings

        String Firstname = "Bala";
        String Lastname = "Murali";
        System.out.println(Firstname + " " + Lastname); //Bala Murali
        System.out.println(Firstname.concat(" ").concat(Lastname)); //Bala Murali

        //7.Trim and Replace:
        //trim(): Removes leading and trailing whitespace
        //replace(): Replaces all occurrences of a character

        String trimreplace = "    Java Programming    "; //Java Programming
        System.out.println(trimreplace.trim());
        System.out.println(trimreplace.replace('a', 't')); // Jtvt Progrtmming

    }
}