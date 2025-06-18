package Nov.ex_14112024_Static_Wrapper_Exceptions;
public class Lab164_Static_IIB_SIB {
    public static void main(String[] args) {
        Class_A class_A = new Class_A();
        Class_A class_A1 = new Class_A();
        new Class_A();
        Class_A a2; // Rule 1- Only Ref creation doesn't call the SIB
    }
}
class Class_A {
    //---------------Static Initialization Block(SIB)---------------------
    static {
        System.out.println("SIB");
    }
    //-----------------Instance Initialization Block(IIB)---------------
    {
        System.out.println("IIB");
    }
}