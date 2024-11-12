package Nov.ex_08112024_Polymorphism.methodoveridding;

public class Lab151 {
    public static void main(String[] args) {
        SonClass sonClass = new SonClass();
        sonClass.fatherSonOverrideMethod();

        FatherClass fatherClass = new FatherClass();
        fatherClass.fatherSonOverrideMethod();

        // Dynamic Dispatch.
        FatherClass fatherSonDynamicDispatchClass = new SonClass();
        //  FatherClass can have new SonClass Object,
        //  but SonClass cannot have new FatherClass Object

        fatherSonDynamicDispatchClass.fatherSonOverrideMethod();

        // WebDriver driver = new ChromeDriver();


//        SonClass SonFatherDynamicDispatchClass = new FatherClass(); // Compile time error
        //  FatherClass can have new SonClass Object,
        //  but SonClass cannot have new FatherClass Object
//        SonFatherDynamicDispatchClass.fatherSonOverrideMethod(); // Compile time error


    }
}

class FatherClass {
    void fatherSonOverrideMethod() {
        System.out.println("fatherSonOverrideMethod_FatherClass");
    }

    void fatherMethod2() {

    }
}

class SonClass extends FatherClass {

    @Override
    void fatherSonOverrideMethod() {
        System.out.println("fatherSonOverrideMethod_SonClass");
    }

    void sonMethod2() {

    }

}