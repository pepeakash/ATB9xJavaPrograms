package Oct.ex_11102024_Operators;
public class Lab048 {
    public static void main(String[] args) {
        // || - OR
        System.out.println(true || true); // true - because one of the condition is true
        System.out.println(true || false); // true - because one of the condition is true
        System.out.println(false || true); // true - because one of the condition is true
        System.out.println(false || false); // false - because both of the condition is false
        //  And  && // only true && true returns true
        // T || T -> T
        // T || F -> F
        // F || T -> F
        // F || F -> F
        System.out.println(true && true); // true - because both of the condition is true
        System.out.println(true && false); // false - because one of the condition is false
        System.out.println(false && true); // false - because one of the condition is false
        System.out.println(false && false); // false - because both of the condition is false
    }
}
