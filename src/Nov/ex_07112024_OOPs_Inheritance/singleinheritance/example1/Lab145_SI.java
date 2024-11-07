package Nov.ex_07112024_OOPs_Inheritance.singleinheritance.example1;

public class Lab145_SI {
    public static void main(String[] args) {
       // Single Inheritance
       // Son will get the attributes from Father.
        // 1 son and 1 father.
        SonClass sonClass = new SonClass();
        System.out.println(sonClass.fathers_gold_attribute);
        sonClass.fathers_2bhk_house_method(); // Son has extended
        sonClass.sons_3bhk_house_method();

        FatherClass fatherClass = new FatherClass();
//         fatherClass.sons_3bhk_house_method(); //FatherClass has not extended SonClass
    }
}

