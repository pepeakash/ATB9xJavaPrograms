package Nov.ex_12112024_SuperKeyword_Abstraction;
public class Lab162_P3_Multiple_Inheritance_Solved {
}
class Class_Child1 implements Interface_Father1, Interface_Mother1 {
    @Override
    public void interfaceMethod_f1() {
    }
    @Override
    public void interfaceMethod_f2() {
    }
    // ----- Father & Mother Interface has Method with same Name(interfaceMethod_same())------
    // ------ this same method is completed in Child class-------------
    @Override
    public void interfaceMethod_same() {
        System.out.println("1 Only Same");
    }
    @Override
    public void interfaceMethod_f3() {
    }
    @Override
    public void interfaceMethod_f4() {
    }
}

//----------------------Interface with Incomplete Methods - Father---------------------------
interface Interface_Father1 {
    void interfaceMethod_f1();
    void interfaceMethod_f2();
    void interfaceMethod_same();
}
//----------------------Interface with Incomplete Methods - Mother---------------------------
interface Interface_Mother1 {
    // interface cannot have constructor, but abstract class can have constructor
    void interfaceMethod_f3();
    void interfaceMethod_f4();
    void interfaceMethod_same();
}