package Nov.ex_06112024_OOPs_Constructors;

import java.util.Scanner;

public class Lab143_Constructors_P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CarClass carClass1 = new CarClass("tesla", 2015);
        System.out.println(carClass1.carModel);
        System.out.println(carClass1.carYearOfManufacture);

        carClass1.display();


        CarClass carClass2 = new CarClass("nano", 2013);
        System.out.println(carClass2.carModel);
        System.out.println(carClass2.carYearOfManufacture);
        // t2.model

        carClass2.display();

        System.out.println("Enter the model name");
        String model_name_input = sc.next();
        System.out.println("Enter the year ");
        int year_input = sc.nextInt();

        CarClass CarClass3 = new CarClass(model_name_input, year_input);

        System.out.println(CarClass3.carModel);
        System.out.println(CarClass3.carYearOfManufacture);

        CarClass3.display();


    }
}

class CarClass {
    String carModel;
    int carYearOfManufacture;



    // Parameterized constructor
    CarClass(String carModel_arguments, int carYearOfManufacture_arguments) {
        System.out.println("Parameterized constructor called and its variable are initialized");
        this.carModel = carModel_arguments;
        this.carYearOfManufacture = carYearOfManufacture_arguments;
    }

    void display() {
        System.out.println("Car2 Details -> " + this.carModel + " - "+ this.carYearOfManufacture);
    }


}