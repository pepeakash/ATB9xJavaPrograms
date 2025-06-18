package Oct.ex_10102024_Constants_Literals;

public class Lab030_static_variable {
    int i_age; // instance variable
    static int s_age; // static variable


    public static void main(String[] args) {
        int age;
//        System.out.println(age); // local Variable cant use default value
        // Variable value has to be defined first

        age = 100;
        System.out.println(age);

//        System.out.println(i_age); // not possible

        Lab030_static_variable obj = new Lab030_static_variable();

        System.out.println(obj.i_age);
        System.out.println(s_age);

    }
}
