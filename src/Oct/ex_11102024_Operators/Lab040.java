package Oct.ex_11102024_Operators;
public class Lab040 {
    public static void main(String[] args) {
        // < (Less than)
        //<= (Less than or equal to)
        //> (Greater than)
        //>= (Greater than or equal to)
        //== (Equal to)
        //!= (Not equal to)
        //  //  > < , >= <= , != , ! -> true or false
        int a = 10;
        int b = 30;
        boolean c = a > b; // 10 > 30 -> false -> c = false
        System.out.println(c); // false
        int age_mamitha = 34; // 34 years old
        int age_pramod = 34; // 34 years old
        boolean result = age_pramod >= age_mamitha; // 34 >= 34 -> true
//         age_pramod > age_mamitha or age_pramod =age_mamitha
        System.out.println(result); // true
    }
}
