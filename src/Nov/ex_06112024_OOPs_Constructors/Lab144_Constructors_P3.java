package Nov.ex_06112024_OOPs_Constructors;

import java.util.Scanner;

public class Lab144_Constructors_P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//--------------------------- Example 1 ---------------------------
        FourWheelVehicleClass fourWheelVehicleClass1 = new FourWheelVehicleClass("tesla");

        fourWheelVehicleClass1.carModel = "TUV400";

        System.out.println(fourWheelVehicleClass1.carModel);
        System.out.println(fourWheelVehicleClass1.carYearOfManufacture);

        fourWheelVehicleClass1.display();

//--------------------------- Example 2 ---------------------------
        FourWheelVehicleClass fourWheelVehicleClass2 = new FourWheelVehicleClass("nano",2013);
        System.out.println(fourWheelVehicleClass2.carModel);
        System.out.println(fourWheelVehicleClass2.carYearOfManufacture);
        // fourWheelVehicleClass2.model

        fourWheelVehicleClass2.display();


//--------------------------- Example 3 ---------------------------
        FourWheelVehicleClass fourWheelVehicleClass3 = new FourWheelVehicleClass();
        System.out.println(fourWheelVehicleClass3.carModel);
        System.out.println(fourWheelVehicleClass3.carYearOfManufacture);
        // fourWheelVehicleClass3.model

        fourWheelVehicleClass3.display();

    }
}


//---------------------Class Definition---------------------

class FourWheelVehicleClass {
    String carModel;
    int carYearOfManufacture;

    // --------------------Default constructor - Without Arguments Constructor--------------------
    FourWheelVehicleClass(){
        this.carModel = "D Model"; // this.model is not required because default constructor not taking any arguments
        this.carYearOfManufacture  = 1990; // this.model is not required because default constructor not taking any arguments
    }

    // this.model;


    // ----------------------Parameterized constructor 1 --------------------
    FourWheelVehicleClass(String model_name_arguments, int year_created_arguments) {
        System.out.println("Parameterized constructor 1");
        this.carModel = model_name_arguments;
        this.carYearOfManufacture = year_created_arguments;
    }

    // ----------------------Parameterized constructor 2 --------------------
    FourWheelVehicleClass(String model_name_arguments) {
        System.out.println("Parameterized constructor 2");
        this.carModel = model_name_arguments;
    }

    // ----------------------Method to display the Car details - Method inside Class --------------------
    void display() {
        System.out.println("Car2 Details -> " + this.carModel + " - "+ this.carYearOfManufacture);
    }


}