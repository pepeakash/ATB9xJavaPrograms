package Nov.ex_07112024_OOPs_Inheritance.multipleheritance;

public class ChildClass extends FatherClass {
    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        System.out.println(childClass.mothers_gold_attribute);
        childClass.mothers_home_method();
        childClass.mothers_money_method();

        System.out.println(childClass.fathers_gold_attribute);
        childClass.fathers_home_method();
        childClass.fathers_money_method();



    }


}
