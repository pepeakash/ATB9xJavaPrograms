package Nov.ex_08112024_Polymorphism.methodoveridding;

//method overloading

public class Lab150 {

    public static void main(String[] args) {
        HoundClass houndClass = new HoundClass();
        houndClass.barkMethod();
    }
}

class DogClass {
    void barkMethod(){
        System.out.println("I am Dog, i will Bark!! - barkMethod() - DogClass");
    }
    int ageAttribute = 10;
}

class HoundClass extends DogClass {
    // Hound is type of Dog

    @Override
    void barkMethod(){
        System.out.println("barkMethod - HoundClass ");
    }


}