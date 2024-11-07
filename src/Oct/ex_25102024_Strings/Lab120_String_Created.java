package Oct.ex_25102024_Strings;

public class Lab120_String_Created {
    public static void main(String[] args) {
        String name = "pramod"; // SCP - String Constant Pool - Heap Memory - String Literal Pool
        name = "dutta"; // SCP new memory location created for "dutta"
        name = "pramoddutta"; // SCP new memory location created for "pramoddutta"
        name = "pramod"; // SCP no new memory location created for "pramod"

        // String -> data type
        // name -> Ref
        // = -> assignment operator
        // "Pramod" - Literal(String)

        System.out.println(name);



        String name2 = new String("Pramod"); // Heap Memory - new memory location created for "Pramod"
        String name3 = new String("Pramod"); // Heap Memory - new memory location created for "Pramod"
        String name5 = name2;  // Heap Memory - new memory location created for "Pramod"
    }
}
