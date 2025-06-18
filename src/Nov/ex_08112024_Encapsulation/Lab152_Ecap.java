package Nov.ex_08112024_Encapsulation;

public class Lab152_Ecap {
    public static void main(String[] args) {

        // Create Object of PublicAttributeClassConstructor - PublicAttributeClassConstructor contains Parameterized Constructor
        PublicAttributeClassConstructor publicAttributeClassConstructor = new PublicAttributeClassConstructor("admin_HardCodeData", "password123_HardCodeData");

        // Print public_string_password_Attribute from publicAttributeClass
        System.out.println(publicAttributeClassConstructor.public_string_password_attribute);

        // Change Password - Its Valid, as public_string_password_Attribute is public
        publicAttributeClassConstructor.public_string_password_attribute = "hacker_HardCodeData";

        // Print public_string_password_Attribute from publicAttributeClass
        System.out.println(publicAttributeClassConstructor.public_string_password_attribute);

//
        PrivateAttributeClassConstructor privateAttributeClassConstructor = new PrivateAttributeClassConstructor("goodadmin_HardCodeData", "admin123_HardCodeData");

        //        System.out.println(privateAttributeClassConstructor.private_string_password_attribute); // password_Attribute is Private so it can't be accessed
        //        privateAttributeClassConstructor.password_private_string_password_attribute = "pass123_HardcodeData"; // password_Attribute is Private so it can't be accessed


//
        privateAttributeClassConstructor.setPasswordMethod("hacker123_HardCodeData", true);
        String password_Argument = privateAttributeClassConstructor.getPasswordMethod(true);
        System.out.println("getPasswordMethod: "+ password_Argument);

    }
}

//Public
class PublicAttributeClassConstructor {
    public String public_string_username_attribute;
    public String public_string_password_attribute;

    //--------------------------Parameterized Constructor ---------------------------
    public PublicAttributeClassConstructor(String user_passed_username_parameter, String user_passed_password_parameter) {
        this.public_string_username_attribute = user_passed_username_parameter;
        this.public_string_password_attribute = user_passed_password_parameter;
    }
}


//Private
class PrivateAttributeClassConstructor {

    private String private_string_username_attribute;
    private String private_string_password_attribute;

    // --------------------------Parameterized Constructor ---------------------------
    public PrivateAttributeClassConstructor(String user_passed_username_parameter, String user_passed_password_parameter) {
        this.private_string_username_attribute = user_passed_username_parameter;
        this.private_string_password_attribute = user_passed_password_parameter;
    }


    public String getUsernameMethod() {
        return private_string_username_attribute;
    }

    public void setUsernameMethod(String user_passed_username_parameter) {
        this.private_string_username_attribute = user_passed_username_parameter;
    }

    public String getPasswordMethod(boolean user_passed_isAdmin_parameter) {
        if (user_passed_isAdmin_parameter) {
            return private_string_password_attribute;
        }
        return "None";
    }

    public void setPasswordMethod(String user_passed_password_parameter, boolean user_passed_isAdmin_parameter) {
        if (user_passed_isAdmin_parameter) {
            this.private_string_password_attribute = user_passed_password_parameter;
        } else {
            System.out.println("Not Allowed");
        }
    }


}