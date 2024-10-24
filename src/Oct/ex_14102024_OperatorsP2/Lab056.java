package Oct.ex_14102024_OperatorsP2;

public class Lab056 {
    public static void main(String[] args) {
        short s = 10;
        char c = 'A'; // 65
        System.out.println(s); // 10 because s is short -
        System.out.println(c); // A because c is char
        System.out.println(c+s); // 75 because c is promoted to int and added to s (int)
    }
}
