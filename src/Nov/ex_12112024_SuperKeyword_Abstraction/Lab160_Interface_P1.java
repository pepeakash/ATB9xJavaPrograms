package Nov.ex_12112024_SuperKeyword_Abstraction;
public class Lab160_Interface_P1 {
}
abstract class AbstractClassConstructor_ABC {
    AbstractClassConstructor_ABC() {
    }
    abstract void abstractMethod_void_m1();
    void completeMethod_void_m2() {
        System.out.println("Complete Method!");
    }
}
// Interface cannot have complete function
interface InterfaceI {
    void interfaceIncompleteMethod_m1();
    void interfaceIncompleteMethod_m2();
    // -------------- Below method is invalid because, Interface cannot have complete method -------------
    //void interfaceCompleteMethod_m3(){}
// ------------------Interface can have complete method with keyword DEFAULT & STATIC-------------------
    default void interfaceCompleteMethod_m4() {
        System.out.println("Default method");
    }
    default void interfaceCompleteMethod_m5() {
        System.out.println("Default method in Interface!");
    }
    // ------------------Also Interface can have complete method with keyword STATIC & DEFAULT -------
    static void interfaceStaticCompleteMethod_m6() {
        System.out.println("Static method in Interface!");
    }
}