package Nov.ex_07112024_OOPs_Inheritance.singleinheritance.example2;

public class PythonClass extends ProgrammingClass {
    // Extend - is A
    // Python is a Programming
    void printMethod(){
        System.out.println(programmingClass_author_attribute);
        System.out.println(programmingClass_version_attribute);
    }

//----------------- Default Constructor -----------------
    PythonClass(){
        System.out.println("Default Constructor - Child");
    }

    public static void main(String[] args) {
        PythonClass PythonClass = new PythonClass();
        System.out.println(PythonClass.programmingClass_author_attribute);
    }
}
