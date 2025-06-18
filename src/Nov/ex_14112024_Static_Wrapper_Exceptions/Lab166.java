package Nov.ex_14112024_Static_Wrapper_Exceptions;
public class Lab166 {
    public static void main(String[] args) {
        Class_Automation class_Automation1 = new Class_Automation();
        Class_Automation class_Automation2 = new Class_Automation();
        //---------------Calling from Object Reference--------------
        System.out.println(class_Automation1.attribute_driver);
        System.out.println(class_Automation2.attribute_driver);
        //----------------ClassName.attributeName----------------
        System.out.println(Class_Automation.attribute_driver);
    }
}
class Class_Automation {
    static String attribute_driver = "Chrome";
}
