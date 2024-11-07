package Nov.ex_06112024_OOPs_Constructors;

public class Car {
    String carName;
    String carModel;
    int carYearOfManufacture;


// Constructor Name should be same as Class Name.
    // Default Constructor - No Arg.
    Car(){
        carName = "Unknown Name";
        carModel = "XYZ";
        carYearOfManufacture = 0;
        System.out.println("Default Constructor is executed!");
    }

}
