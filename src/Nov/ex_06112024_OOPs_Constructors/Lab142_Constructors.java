package Nov.ex_06112024_OOPs_Constructors;

public class Lab142_Constructors {
    public static void main(String[] args) {
        Car tesla = new Car();
        System.out.println(tesla.carModel);
        System.out.println(tesla.carName);
        System.out.println(tesla.carYearOfManufacture);

        Car nano = new Car();
        nano.carName = "Tata Nano";
        System.out.println(nano.carModel);
        System.out.println(nano.carName);
        System.out.println(nano.carYearOfManufacture);


    }
}
