package Nov.ex_21112024_List_Set_Collection_Framework;

public class ClassConstructor_Student {
    private String private_String_Attribute_name;
    private String private_String_Attribute_rollNo;

    public ClassConstructor_Student(String name, String rollNo) {
        this.private_String_Attribute_name = name;
        this.private_String_Attribute_rollNo = rollNo;
    }

    public String method_getName() {
        return private_String_Attribute_name;
    }

    public void method_setName(String parameter_name) {
        this.private_String_Attribute_name = parameter_name;
    }

    public String method_getRollNo() {
        return private_String_Attribute_rollNo;
    }

    public void method_setRollNo(String parameter_rollNo) {
        this.private_String_Attribute_rollNo = parameter_rollNo;
    }

    public void method_printDetails(){
        System.out.println("Student Name : " + this.private_String_Attribute_name);
        System.out.println("Student Roll No: " + this.private_String_Attribute_rollNo);
    }
}
