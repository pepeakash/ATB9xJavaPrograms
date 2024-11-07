package Task.task_30102024;

import java.util.Scanner;

public class Task_30102024 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows = sc.nextInt();


        for (int i=rows; i>=1; i--){
            for( int j=i; j>=1; j--)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }

}
