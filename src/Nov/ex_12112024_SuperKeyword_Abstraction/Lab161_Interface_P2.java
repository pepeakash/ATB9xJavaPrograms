package Nov.ex_12112024_SuperKeyword_Abstraction;
public class Lab161_Interface_P2 {
    public static void main(String[] args) {
        InterfaceClass_P interfaceClass_P = new InterfaceClass_P();
        interfaceClass_P.interfaceMethod_m1();
//        InterfaceI interfaceI = new InterfaceI();
    }
}
//-------------Class with Completed Interface Methods------------------
class InterfaceClass_P implements interface_I1 {
    @Override
    public void interfaceMethod_m1() {
    }
    @Override
    public void interfaceMethod_m2() {
    }
    @Override
    public void interfaceMethod_m3() {
    }
}
//------------------------Interface with Incomplete Methods-------------------
interface interface_I1 {
    void interfaceMethod_m1();
    void interfaceMethod_m2();
    void interfaceMethod_m3();
}