package Nov.ex_21112024_List_Set_Collection_Framework;

import java.util.Enumeration;
import java.util.Vector;

public class Lab215_Vector {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");
        vector.add("Date");

        System.out.println("----for each loop--- using Object iterator ");
        for (Object o : vector) {
            System.out.println(o);
        }

        System.out.println();
        System.out.println();

        System.out.println("----for each loop--- using String iterator ");
        for (String o : vector) {
            System.out.println(o);
        }

        System.out.println();
        System.out.println();

        // Iterator? - For legacy Class I can't use
        // Enumeration

        System.out.println(" --- using legacy Enumeration iterator ");

        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }


    }
}
