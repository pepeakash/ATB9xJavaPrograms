package Nov.ex_18112024_Exceptions_Part2;

public class Lab194_Custom_Exception {
    public static void main(String[] args) throws Exception {
        ClassConstructor_Bank ClassConstructor_Bank_sbi = new ClassConstructor_Bank("INR",100);
        ClassConstructor_Bank ClassConstructor_Bank_icici = new ClassConstructor_Bank("INR",123);
        System.out.println(ClassConstructor_Bank_sbi.addMethod(ClassConstructor_Bank_icici));

        ClassConstructor_Bank jp_chase = new ClassConstructor_Bank("USD",100);
        // 100 + 100*85 = 8600
        System.out.println(ClassConstructor_Bank_icici.addMethod(jp_chase));

    }
}
