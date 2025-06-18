package Oct.ex_11102024_Operators;
public class Lab049 {
    public static void main(String[] args) {
        int balaji_salary = 12;
        boolean b = !(balaji_salary > 10 || balaji_salary < 5); // !(true || false) -> !(true) -> false
        System.out.println(b); // false - because balaji_salary is greater than 10
    }
}
