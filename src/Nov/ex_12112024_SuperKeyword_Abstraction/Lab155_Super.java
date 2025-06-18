package Nov.ex_12112024_SuperKeyword_Abstraction;

public class Lab155_Super {
    public static void main(String[] args) {
        CarClassConstructor carClassConstructor = new CarClassConstructor();
    }
}

class CarClassConstructor extends VehicleClassConstructor {
    private int maxSpeedAttribute = 281;

    // ------------------------ Default Constructor - CarClassConstructor ------------------------
    CarClassConstructor() {
        // by default super() is called, if we don't call super() explicitly
        super(10); // call to super must be the first statement in constructor
        System.out.println("Default Constructor - CarClassConstructor Car");
        System.out.println(this.maxSpeedAttribute);
        System.out.println(super.maxSpeedAttritube);
        this.displayOverrideMethod();
        super.displayOverrideMethod();
//        super(10); // Error - call to super must be the first statement in constructor
    }

    // ------------------------------- displayOverrideMethod (Son_Class)--------------------------------------
    @Override
    void displayOverrideMethod() {
        System.out.println("Child - CarClassConstructor");
    }


}


class VehicleClassConstructor {
    public int maxSpeedAttritube = 180;

    // ------------------------ Default Constructor ------------------------
    VehicleClassConstructor() {
        System.out.println("Default Constructor Vehicle");
    }

    //------------------------ Parameterized Constructor ------------------------
    VehicleClassConstructor(int a) {
        System.out.println("Parameterized Constructor Vehicle - VehicleClassConstructor");
    }

    // ------------------------------- displayOverrideMethod (Father_Class)--------------------------------------
    void displayOverrideMethod() {
        System.out.println("Parent - VehicleClassConstructor");
    }


    void messageMethod() {
        System.out.println("Hello Vehicle");
    }

    void messageMethod(int a) {
        System.out.println("Hello Vehicle");
    }


}