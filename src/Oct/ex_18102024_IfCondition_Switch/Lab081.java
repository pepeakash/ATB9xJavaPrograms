package Oct.ex_18102024_IfCondition_Switch;

public class Lab081 {
    // JDK >13
    public static void main(String[] args) {
        int itemCode = 001; // JDK  >13

        //without using break statement - using arrow symbol ->
        switch (itemCode){
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default -> System.out.println("Default");


        }


    }

}
