package Nov.ex_12112024_SuperKeyword_Abstraction;
public class Lab157 {
}
//-------------------------Son Completed Class with Override Keyword -----------------------------------
// ----- abstract class & Methods - Incomplete Class & Methods are completed by Son Class -------
class PramodClass extends abstractClass_Loan {
    @Override
    void loan50k_AbstractMethod() {
        System.out.println("Giving the loan!");
    }
    @Override
    void loan30k_AbstractMethod() {
        System.out.println("30K the Given!");
    }
}
//-------------------- abstract class & Methods- Incomplete Class & Methods-------------------------------
abstract class abstractClass_Loan { // abstract class is unfinished
    abstract void loan50k_AbstractMethod();
    abstract void loan30k_AbstractMethod();
    void loan1LMethod() {
        System.out.println("1L Loan is there");
    }
}
// ------ Concrete Class - Complete Class - they dont have abstract methods(Incomplete Methods -----
class Person {
}
class Student1 {
}
class Student2 {
}
class Student3 {
}