package Oct.ex_17102024_IfCondition;
import java.util.Scanner;
public class Lab073_HackerrankQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        if (score >= 90 && score <= 100) {
            System.out.println("Grade A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("Grade B");
        } else if (score >= 70 && score <= 79) {
            System.out.println("Grade C");
        } else if (score >= 60 && score <= 69) {
            System.out.println("Grade D");
        } else if (score >= 0 && score <= 59) {
            System.out.println("Grade F");
        } else {
            System.out.println("Enter the valid score between 0 to 100");
        }
        scanner.close();  // closing the scanner is best practise but still the garbage collection will do it if you dont do it
    }
}
