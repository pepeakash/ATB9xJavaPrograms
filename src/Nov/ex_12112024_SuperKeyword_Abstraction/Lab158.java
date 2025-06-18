package Nov.ex_12112024_SuperKeyword_Abstraction;

public class Lab158 {

    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        childClass.loan50k_AbstractMethod();
        childClass.load25K_Method();
    }


}

class ChildClass extends Father_AbstractClass {

    @Override
    public void loan50k_AbstractMethod() {
        System.out.println("Child is giving the 50K loan");
    }
}


abstract class Father_AbstractClass {
    abstract void loan50k_AbstractMethod();

    void load25K_Method() {
        System.out.println("Done by Father!!");
    }

}