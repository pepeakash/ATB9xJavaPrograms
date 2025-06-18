package Oct.ex_11102024_Operators;
public class Lab045 {
    public static void main(String[] args) {
        // !, && , ||
        boolean a = true;
        boolean b = true;
        boolean c = true || false; // true - because one of the condition is true
        System.out.println(c); // true
        System.out.println(!!b); // true - because first ! will make it false and second ! will make it true
        System.out.println(!!!b); // false - because first ! will make it false and second ! will make it true and third ! will make it false
        System.out.println(!!!!b); // true - because first ! will make it false and second ! will make it true and third ! will make it false and fourth ! will make it true
    }
}
