package Nov.ex_08112024_Inheritance.hierarchical;

public class Lab148_hierarchical {
    public static void main(String[] args) {

        FirstSonClass firstSonClass = new FirstSonClass();
        firstSonClass.firstSonMethod();
        firstSonClass.fatherMethod();


        SecondSonClass secondSonClass = new SecondSonClass();
        secondSonClass.secondSonMethod();
        secondSonClass.fatherMethod();


        ThirdSonClass thirdSonClass = new ThirdSonClass();
        thirdSonClass.thirdSonMethod();
        thirdSonClass.fatherMethod();


        FatherClass fatherClass = new FatherClass();
        fatherClass.fatherMethod();

    }
}
