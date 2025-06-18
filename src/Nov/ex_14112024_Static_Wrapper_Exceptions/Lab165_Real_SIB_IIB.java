package Nov.ex_14112024_Static_Wrapper_Exceptions;
//1. static block - SIB
//2. static variable
//3. static method
//4. instance variable - object is created
//5. IIB
//6. Instance variable initialization
//7. Instance Method
public class Lab165_Real_SIB_IIB {
    public static void main(String[] args) {
        ClassConstructor_ATB classConstructor_ATB_1 = new ClassConstructor_ATB("Amit");
        ClassConstructor_ATB classConstructor_ATB_2 = new ClassConstructor_ATB("Suraj");
        ClassConstructor_ATB class_ATB_3 = new ClassConstructor_ATB("Tushar");
        ClassConstructor_ATB class_ATB_4 = new ClassConstructor_ATB("Balaji");
        ClassConstructor_ATB class_ATB_5;
        new ClassConstructor_ATB("Pramod");
        classConstructor_ATB_1.readDocumentsMethod();
        classConstructor_ATB_2.readDocumentsMethod();
        // Static
        ClassConstructor_ATB.doAssignmentMethod(); // Static Method
        System.out.println(ClassConstructor_ATB.attribute_courseName); // Static Variable
    }
}
class ClassConstructor_ATB {
    //-------------- Private Attributes----------------
    private String attribute_name;
    private String attribute_phone;
    //-------------- Static Attribute----------------
    static String attribute_courseName = "ATB9x";
    //-------------------- Parameterized Constructor----------------------------------
    public ClassConstructor_ATB(String parameter_name) {
        this.attribute_name = parameter_name;
    }
    //-------------- Static Initialization Block (SIB)--------------------------------
    static {
        System.out.println("Load the class?, I will execute");
    }
    //----------------Instance Initialization Block (IIB)-----------------------------
    {
        System.out.println("IIB");
        // What is the purpose? -
        // Here you can write code related to
        // start a website or anything before starting the
        // web automation or api automation
        //
        System.out.println("Reading from CSV file");
    }
    //---------------------- Non Static Method --------------------------------
    void readDocumentsMethod() {
        System.out.println("Non Static Method - readDocumentsMethod()");
        System.out.println(attribute_courseName);
    }
    //---------------------- Static Method --------------------------------
    static void doAssignmentMethod() {
        // attibute_phone cannot be accessed without creating the object , inside static method
        //System.out.println(phone);
        System.out.println("doAssignmentMethod()");
    }
    //---------------------- Static Class --------------------------------
    static class GenAI {
        // 0.0001% in Automation
    }
    //---------------------- Getters and Setters for Private Attribute------------------
    public String getName() {
        return attribute_name;
    }
    public void setName(String parameter_name) {
        this.attribute_name = parameter_name;
    }
    public String getPhone() {
        return attribute_phone;
    }
    public void setPhone(String parameter_phone) {
        this.attribute_phone = parameter_phone;
    }
}