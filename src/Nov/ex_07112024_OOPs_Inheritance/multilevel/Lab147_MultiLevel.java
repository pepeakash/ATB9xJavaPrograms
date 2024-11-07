package Nov.ex_07112024_OOPs_Inheritance.multilevel;

public class Lab147_MultiLevel {
    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        childClass.grandFatherhomeMethod();
        childClass.grandFatherMoneyMethod();
        childClass.fatherhomeMethod();
        childClass.fatherMoneyMethod();
        childClass.childhomeMethod();
        childClass.childMoneyMethod();

        System.out.println();

        FatherClass fatherClass = new FatherClass();
        fatherClass.grandFatherhomeMethod();
        fatherClass.grandFatherMoneyMethod();
        fatherClass.fatherhomeMethod();
        fatherClass.fatherMoneyMethod();

        System.out.println();

        GrandFatherClass grandFatherClass = new GrandFatherClass();
        grandFatherClass.grandFatherhomeMethod();
        grandFatherClass.grandFatherMoneyMethod();


    }
}
