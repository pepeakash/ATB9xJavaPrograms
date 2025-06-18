package Nov.ex_20112024_Lists_Collection_Framework;

import java.util.Vector;

public class Lab202_Vector {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add("Pramod");
        vector.add("Amit");
        vector.add("Lucky");
        System.out.println(vector);
        vector.remove("Amit");
        System.out.println(vector.contains("Lucky"));
        System.out.println(vector);
    }
}
