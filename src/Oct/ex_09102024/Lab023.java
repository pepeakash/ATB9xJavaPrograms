package Oct.ex_09102024;
public class Lab023 {
    int instance_variable = 11; // Instance Variable
    static int static_variable = 99; // Static Varible
    // Instance and static value are defined before MAIN Method and Below Class
    //--------------------Main Method-----------------------------------
    public static void main(String[] args) {
        int age = 10; // Local Variable
        {
            int sachin = 10; // local variable - can be used only within brackets
            System.out.println(sachin);
        }
//        System.out.println(sachin); // Error: Cannot resolve symbol 'sachin'
        // Cant access sachin variable outside brackets
        System.out.println(static_variable);
        Lab023 obj = new Lab023();
        System.out.println(obj.instance_variable);
        System.out.println(static_variable);
    }
}
