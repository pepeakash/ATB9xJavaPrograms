package Nov.ex_06112024_OOPs_Constructors;

public class CarClass {
    String carNameAttribute;
    String carModelAttribute;
    int carYearOfManufactureAttribute;


// Constructor Name should be same as Class Name.
    // Default Constructor - No Arg.
    CarClass(){
        carNameAttribute = "Unknown Name";
        carModelAttribute = "XYZ";
        carYearOfManufactureAttribute = 0;
        System.out.println("Default Constructor is executed!");
    }

}
