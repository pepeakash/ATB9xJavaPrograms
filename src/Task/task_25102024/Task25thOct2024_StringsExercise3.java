// Create a Function of Sub, Sum, Mul and Div with parameter, a, b (take the parameter from the User)
package Task.task_25102024;

public class Task25thOct2024_StringsExercise3 {

    public static void main(String[] args) {


        //Both string builder and string buffer uses append, insert, delete, reverse
        StringBuilder stringBuilder = new StringBuilder("Hello");
        System.out.println(stringBuilder); //Hello

        stringBuilder.append("World!");   //single
        System.out.println(stringBuilder); //HelloWorld!

        stringBuilder.append("!").append("java"); //or this append approach
        System.out.println(stringBuilder); //HelloWorld!!java

        stringBuilder.insert(5, "program");  //HelloprogramWorld!!java
        System.out.println(stringBuilder); //HelloprogramWorld!!java

        stringBuilder.delete(5, 12); //HelloWorld!!java
        System.out.println(stringBuilder); //HelloWorld!!java

        //  sb.reverse(); //avaj!!dlroWolleH
        //System.out.println(sb); or
        System.out.println(stringBuilder.reverse()); //avaj!!dlroWolleH
        System.out.println(stringBuilder.toString()); //Converts StringBuilder to String -> avaj!!dlroWolleH


        StringBuilder stringBuilder2 = new StringBuilder("Bala");
        System.out.println(stringBuilder2); //Bala

        stringBuilder2.append("murali");
        System.out.println(stringBuilder2); //Balamurali

        System.out.println(stringBuilder2);
        System.out.println("Lenght is: " + stringBuilder2.length()); //Lenght is: 10

        System.out.println("Capacity is: " + stringBuilder2.capacity()); //Capacity is: 20 because
// .capacity() - Returns the current capacity of the String builder
// capacity means the length of the string builder

        //Usual way for combining 2 string using + sign

        String string1 = "Hello";
        String string2 = " World!";
        String string3 = string1 + string2; // Creates a new string "Hello World!"
        System.out.println(string3); // Output: Hello World!
        System.out.println(string1);
    }


}