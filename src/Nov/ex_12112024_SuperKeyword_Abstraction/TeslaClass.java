package Nov.ex_12112024_SuperKeyword_Abstraction;
public class TeslaClass extends Engine_AbstractClass {
    //-------------------- driveMethod - Complete Method-------------------
    void driveMethod() {
        startEngine_AbstractMethod();
        stopEngine_AbstractMethod();
    }
    //--------------------------------Completed Method-----------------------------------
    @Override
    void startEngine_AbstractMethod() {
        System.out.println("starting at the electric Engine");
    }
    @Override
    void stopEngine_AbstractMethod() {
        System.out.println("stopping at the electric Engine");
    }
}
