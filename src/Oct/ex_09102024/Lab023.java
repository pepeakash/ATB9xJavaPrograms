package Oct.ex_09102024;

public class Lab023 {
    int instance_variable = 10; // Instance Variable
    static int static_variable = 10; // Static Varible

//--------------------Main Method-----------------------------------
    public static void main(String[] args) {
        int age = 10; // Local Variable


        {
            int sachin = 10;
            System.out.println(sachin);
        }
//        System.out.println(sachin); // Error: Cannot resolve symbol 'sachin'

        Lab023 obj = new Lab023();
        System.out.println(obj.instance_variable);
        System.out.println(static_variable);
    }

}
