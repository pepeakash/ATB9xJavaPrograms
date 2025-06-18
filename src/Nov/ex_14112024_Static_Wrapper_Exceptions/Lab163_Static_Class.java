package Nov.ex_14112024_Static_Wrapper_Exceptions;
// Static is Class , its Loads with a class loading
// Static is not Object, objects load in heap area
// Static is not interface
public class Lab163_Static_Class {
    public static void main(String[] args) {
        StudentClassConstructor studentClassConstructor1 = new StudentClassConstructor(23);
        StudentClassConstructor studentClassConstructor2 = new StudentClassConstructor(33);
        //---------Directly Calling Static Variable using "ClassName.StaticVariableName"------------------
        System.out.println(StudentClassConstructor.attribute_school_name);
        StudentClassConstructor.attribute_school_name = "XYZ";
        System.out.println(StudentClassConstructor.attribute_school_name);
        System.out.println(studentClassConstructor1.attribute_school_name);
        System.out.println(studentClassConstructor2.attribute_school_name);
    }
}
class StudentClassConstructor {
    // -------------------- Non static variable // Instance Variable------------
    int attribute_age;
    //------------------------- Static Variable ---------------------------------
    static String attribute_school_name = "ABC";
    //-------------------------- parameterized Constructor -------------------------------
    public StudentClassConstructor(int parameter_age) {
        this.attribute_age = parameter_age;
    }
    //----------------------Instance Initialization Block(IIB) -----------------------
    {
        System.out.println("IIB");
        System.out.println("Here you can write a code what you want to do when Object is created");
        System.out.println("Read a MySQL db()");
    }
    //---------------------- Static Initialization Block (SIB) ------------------------
    static {
        System.out.println("SIB");
        System.out.println("Loaded Once, When Class is Loaded.");
        System.out.println("Read the excel file");
    }
}