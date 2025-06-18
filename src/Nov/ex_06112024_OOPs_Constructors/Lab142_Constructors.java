package Nov.ex_06112024_OOPs_Constructors;

public class Lab142_Constructors {
    public static void main(String[] args) {
        CarClass teslaClass = new CarClass();
        System.out.println(teslaClass.carModelAttribute);
        System.out.println(teslaClass.carNameAttribute);
        System.out.println(teslaClass.carYearOfManufactureAttribute);

        CarClass nanoClass = new CarClass();
        nanoClass.carNameAttribute = "Tata Nano";
        System.out.println(nanoClass.carModelAttribute);
        System.out.println(nanoClass.carNameAttribute);
        System.out.println(nanoClass.carYearOfManufactureAttribute);


    }
}
