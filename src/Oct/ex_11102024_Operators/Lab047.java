package Oct.ex_11102024_Operators;

public class Lab047 {
    public static void main(String[] args) {
        System.out.println(!(10>20)); // true - because 10 is not greater than 20
        //System.out.println((30>90)!); // Compilation Error - because ! operator is not a postfix operator

        System.out.println(!!!!(30>90)); // true - because first ! will make it false and second ! will make it true and third ! will make it false and fourth ! will make it true
    }
}
