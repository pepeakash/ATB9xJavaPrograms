package Nov.ex_05112024_OOPs;

public class Lab140_Object_Class {
    public static void main(String[] args) {
        CatClass catClass = new CatClass();
        catClass.nameAttribute = "rosey";
        catClass.sleepMethod();
        System.out.println(catClass.nameAttribute);
    }
}

class CatClass {
    String nameAttribute;


    void sleepMethod() {
        System.out.println("Sleeping");
    }
}
