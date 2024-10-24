package Oct.ex_11102024_Operators;

public class Lab050 {
    public static void main(String[] args) {
        boolean b = true;
        System.out.println(!b); // false - because of not operator
        // XOR -> Gate

        // Arithmetic Operators
        // +,-,%,/,*

        // Compound Assignment Operators
        // +=, -=, /=, *= are the compound assignment operators because they are a combination of an arithmetic operator and an assignment operator.
        int a= 10;
//        a +=10; // a = a+10
//        a -=10; // a = a-10
//        a /=10; // a = a/10
        a *=10; // a = a*10
        System.out.println(a);

        // Relational Operators
        // > , < , >= <=, !, != , == (compare two value) - return boolean value (true or false)


        // Logical Operators
        //  OR or and , || , && , !  are the logical operators because they are used to combine conditional statements.


        // new Operator - In Future in OOPs
        String name = new String("Pramod");
        // new  - new memory or object in heap area
        // instanceOf - operator is used to test whether the object is an instance of the specified type (class or subclass
        System.out.println(name instanceof String); // true - because name is an instance of String class

        // Optional to learn - Digital Electronics
        // Bitwise - Not important for Automation
        // ~ - Bitwise Not, >> - Right shift, << Left Shift, ^ - XOR

       //  ++, -- ?


    }
}
