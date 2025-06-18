package Nov.ex_15112024_Wrapper_Exceptions_Part2;

public class Lab173_Conversion {
    public static void main(String[] args) {

        String num = "10";
        // String -> Wrapper(Integer) -> Primitive Int
        Integer a = Integer.valueOf(num);
        int a2 = a;// unboxing
        System.out.println("Integer a :"+a);
        System.out.println("int a2 :"+a2);

        // String to Primitive Integer - parseInt() Converts directly to Integer
        int a3 = Integer.parseInt(num);

        Long l = 10l;
        Short s = 23;
        Boolean bb = true;


    }
}
