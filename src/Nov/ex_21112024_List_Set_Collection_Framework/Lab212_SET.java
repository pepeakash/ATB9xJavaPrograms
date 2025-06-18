package Nov.ex_21112024_List_Set_Collection_Framework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab212_SET {
    public static void main(String[] args) {
        Set hashSet = new HashSet();

        Set lhs = new LinkedHashSet();

        Set ts = new TreeSet();


        hashSet.add("Pramod");
        hashSet.add("Pramod");
        hashSet.add("pramod");
        hashSet.add("dramod");
        System.out.println(hashSet);


    }
}
