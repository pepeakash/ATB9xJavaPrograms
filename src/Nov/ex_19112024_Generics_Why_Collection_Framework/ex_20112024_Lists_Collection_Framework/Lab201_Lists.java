package Nov.ex_19112024_Generics_Why_Collection_Framework.ex_20112024_Lists_Collection_Framework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lab201_Lists {
    public static void main(String[] args) {
        List mylist = new ArrayList(); // Arrays Format - Continuous
        List mylist2 = new LinkedList(); // Doubly Linked List.
        // How they are stored in the memory


        List fruits = List.of("Orange","Apple");
        fruits.add("WaterMelon"); // java.lang.UnsupportedOperationException



    }
}
