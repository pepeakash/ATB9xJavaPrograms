package Nov.ex_08112024_Encapsulation;

public class Lab153 {

    public static void main(String[] args) {
        PersonClassConstructor personClassConstructor = new PersonClassConstructor("Pramod_Hardcode_Data","Password123_Hardcode_Data");
        personClassConstructor.getNameMethod();
        personClassConstructor.setNameMethod("pramod_Hardcode_data");
        // p1.name
        // p1.phone_no
    }

}


class PersonClassConstructor{
    private String private_String_name_attribute;
    private String private_String_phone_number_attribute;


    public PersonClassConstructor(String user_passed_name_parameter, String user_passed_phone_number_parameter){
        this.private_String_name_attribute = user_passed_name_parameter;
        this.private_String_phone_number_attribute = user_passed_phone_number_parameter;
    }


    public String getNameMethod() {
        return private_String_name_attribute;
    }

    public void setNameMethod(String user_passed_name_parameter) {
        this.private_String_name_attribute = user_passed_name_parameter;
    }

    public String getPhone_no_Method() {
        return private_String_phone_number_attribute;
    }

    public void setPhone_no_Method(String user_passed_phone_number_parameter) {
        this.private_String_phone_number_attribute = user_passed_phone_number_parameter;
    }
}
