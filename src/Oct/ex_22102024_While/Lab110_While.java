package Oct.ex_22102024_While;

public class Lab110_While {
    public static void main(String[] args) {
        int a = 0;
        while (a < 0) // false condition- loop never execute
        {
            System.out.println("Print" + a);
            a++;
        }

        int b = 0;
        do {
            System.out.println("Print" + a);
            b++;
        } while (b < 0);
    }
}
