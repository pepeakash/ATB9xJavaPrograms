package Nov.ex_15112024_Wrapper_Exceptions_Part2;
public class Lab171_Wrapper {
    public static void main(String[] args) {
        int a = 10;
        // Primitive Data type
        // Java hates it ->
        // Java Loves - class and Object.
        //-------------Strings------------------------
        String s1 = new String("pramod");
        System.out.println(s1.contains("a"));
        //s1.contains("a");
        //---------------Integer Wrapper-----------------
        Integer a1 = 10;
        System.out.println(a1.intValue());
        // a1.intValue(); - Class and Object - Java loves.
        // Why Java is not pure OOPs? - Becoz -> primitive data types.
    }
}
