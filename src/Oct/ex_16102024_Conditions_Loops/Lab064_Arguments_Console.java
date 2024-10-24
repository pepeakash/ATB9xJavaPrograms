package Oct.ex_16102024_Conditions_Loops;

public class Lab064_Arguments_Console {

    public static void main(String[] args) {
        // Create a Program to check wheather Shesheh Trivedi will go to Goa OR NOT
        // Take a input age = Shesheh ->  Goa
        // age > 25 -> Drinking - Goa
        // Ternary operator

        System.out.println(args[0]); // Shesheh Trivedi -> 0 index
        System.out.println(args[1]); // 26 -> 1 index
        System.out.println(args[2]); // 26 -> 2 index
        System.out.printf("%s , %s ,%s", args[0], args[1], args[2]); // Shesheh Trivedi , 26 ,26
        int age = Integer.parseInt(args[1]); // 26 -> 1 index
        System.out.println(); // New Line
        System.out.println(age > 25 ? "Allowed to Goa" : "Not Allowed"); // 26 > 25 -> Allowed to Goa
    }

}
