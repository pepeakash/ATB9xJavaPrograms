package Nov.ex_12112024_SuperKeyword_Abstraction;
public class Lab159 {
    public static void main(String[] args) {
        WagonRClass wagonRClass = new WagonRClass();
        wagonRClass.driveMethod();
        TeslaClass TeslaClass = new TeslaClass();
        TeslaClass.driveMethod();
//        Engine_AbstractClass engine_AbstractClass = new Engine_AbstractClass();
    }
}
class WagonRClass extends Engine_AbstractClass {
    //-------------------- driveMethod - Complete Method-------------------
    void driveMethod() {
        startEngine_AbstractMethod();  // Calling @Override Method
        stopEngine_AbstractMethod();  // Calling @Override Method
    }
    //---------------------Completed Method-----------------------------------
    @Override
    void startEngine_AbstractMethod() {
        System.out.println("starting car");
    }
    @Override
    void stopEngine_AbstractMethod() {
        System.out.println("stopping car");
    }
}
//----------------------Abstract Class & Methods - Incomplete Class & Methods--------------
abstract class Engine_AbstractClass {
    abstract void startEngine_AbstractMethod();
    abstract void stopEngine_AbstractMethod();
}