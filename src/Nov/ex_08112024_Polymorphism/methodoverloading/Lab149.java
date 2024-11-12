package Nov.ex_08112024_Polymorphism.methodoverloading;

public class Lab149 {
    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();
        mathOperations.add();
        mathOperations.add(1,2);
        mathOperations.add(1.2f, 3.1287f);
        mathOperations.add(1,2, 5);
        mathOperations.add(1.2, 3.1287);
        mathOperations.add(1.2, 3.1287, 1.2f);
    }
}

class MathOperations {

    // Method Overloading
    // Method will be Over load
    // Same name button different Argument or param

    void add(){
        System.out.println("Wife Zero Argument");
    }

    int add(int a, int b) {
        System.out.println("a+b = " + (a + b));
        return a + b;
    }

    float add(float a, float b) {
        System.out.println("a+b = " + (a + b));
        return a + b;
    }

    void add(int a, int b, int c) {
        System.out.println("a+b+c = " + (a + b + c));
    }

    double add(double a, double b) {
        System.out.println("a+b = " + (a + b));
        return a + b;
    }

    double add(double a, double b, float c) {
        System.out.println("a+b+c = " + (a + b + c));
        return a + b + c;
    }
}
