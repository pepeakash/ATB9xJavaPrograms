package Nov.ex_21112024_List_Set_Collection_Framework;

import java.util.Stack;
//Stack extends vector

public class Lab210_Stack {
    public static void main(String[] args) {
        // Stack
        // List In -> First Out

//        Stack s = new Stack();
//        s.add("Pramod");
//        s.add("Dutta");
//        System.out.println(s);

        Stack stack = new Stack();
        stack.push("Pramod");
        stack.push("Dutta");
        stack.push("Amit");
        stack.add("Amit2");

        //size
        System.out.println(stack.size());
        System.out.println(stack);

        //peek() -> to see top element , to see last in element
        System.out.println(stack.peek());
        System.out.println(stack);

        //pop() -> to delete top element,  to delete last in element
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.size());

        // to check if stack is empty, gives boolean result
        System.out.println(stack.empty());

        // Add new element in stack
        System.out.println(stack.add("Snehal"));
        System.out.println(stack);

        // Add new element in stack using add method
        stack.add("Chetan");

        // Add new element in stack using push method, no difference between add and push method
        stack.push("Vijay");
        System.out.println(stack);

        // add new element into the required index of stack, old elements will be shifted automatically
        stack.add(0, "Lucky");
        System.out.println(stack);

        // get element from required index
        System.out.println(stack.get(0));

        System.out.println(stack.get(1));


    }
}
