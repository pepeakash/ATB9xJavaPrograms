package Oct.ex_18102024_IfCondition_Switch;

public class Lab079 {
    public static void main(String[] args) {
        char ch = 'A'; // 65 because of ASCII value of character A
        switch (ch) {
            case 65:
                System.out.println("A");
        }

//        boolean b = true;
//        switch (b) {
//        }

        long a11 = 30l;
        switch ((int) a11) { // Type casting - converting long to int -  int value is 30
            case 30:
                System.out.println("30");
        }

        int a = 98;
        switch (a){
            case 98:
                System.out.println("98");
//            case 98:  // Duplicate case 98 in switch statement is not allowed in Java
//                System.out.println("98");
        }

    }
}
