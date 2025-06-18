package Nov.ex_21112024_List_Set_Collection_Framework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab213__SET_HS_LHS_TS {
    public static void main(String[] args) {

        Set hashSet = new HashSet();
        // Hashing mechanism to store the element,
        // no order. no duplicates

        hashSet.add("Apple");
        hashSet.add("Orange");
        hashSet.add("WaterMelon");
        hashSet.add("WaterMelon");
        hashSet.add(null);

        System.out.println("--------------------hashSet---------------");
        System.out.println(hashSet);
        System.out.println();
        System.out.println();


        Set linkedHashSet = new LinkedHashSet();
        // LinkedList mechanism to store the element,
        // order will maintain, no duplicates
        linkedHashSet.add("Dpple");
        linkedHashSet.add("apple");
        linkedHashSet.add("Orange");
        linkedHashSet.add("WaterMelon");
        linkedHashSet.add("WaterMelon");
        linkedHashSet.add(null);

        System.out.println("--------------------linkedHashSet---------------");
        System.out.println(linkedHashSet);
        System.out.println();
        System.out.println();


        System.out.println(linkedHashSet.isEmpty());
        System.out.println(linkedHashSet.contains("Apple"));
        System.out.println(linkedHashSet.size());


        Set treeSet = new TreeSet();
//        Set<String> treeSet = new TreeSet();
        // Black and Red Tree mechanism to store the element.
        // order will maintain, Natural Sorting is done.
        // null value cannot be used in treeset
        // different dataset cannot be used in treeset

        treeSet.add("Dapple");
        treeSet.add("Apple");
        treeSet.add("Orange");
        treeSet.add("WaterMelon");
        //treeSet.add(null); // Null Pointer
        //treeSet.add(123); // java.lang.ClassCastException

        System.out.println("--------------------treeSet---------------");
        System.out.println(treeSet);
        System.out.println();
        System.out.println();


        for (Object o : treeSet) {
            System.out.println(o);
        }


    }
}
