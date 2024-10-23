package Oct.ex_10102024_Constants_Literals;

public class Lab034 {
    public static void main(String[] args) {
        // Binary Literal
        int age = 65; // Decimal System - Y, base will be 10
        System.out.println("Age: " + age);

        // Binary Literal
        int binary_num = 0b1010;
        System.out.println("Binary Number: " + binary_num); // 1010 = (1 × 2³) + (0 × 2²) + (1 × 2¹) + (0 × 2⁰) = 10

        // Octal base? -> 8
        int octal = 0101; // 0101 = (0 × 8³) + (1 × 8²) + (0 × 8¹) + (1 × 8⁰) = 65
        System.out.println("Octal Number: " + octal);

        // Hexadecimal Literals
        int hex = 0Xface; //base 16 color combination are in hex - #28a745 - Hexadecimal Number: 64206
        System.out.println("Hexadecimal Number: " + hex);

    }
}
