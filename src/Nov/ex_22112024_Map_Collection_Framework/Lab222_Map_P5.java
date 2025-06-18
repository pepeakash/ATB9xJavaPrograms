package Nov.ex_22112024_Map_Collection_Framework;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class Lab222_Map_P5 {
    public static void main(String[] args) {
        // Map - K, V,  null values allows

        // Hashtable - Synchronised, Slow and Legacy Class
        // T1, T2 - they will use one by one.

        Hashtable<Integer,String> hashtable = new Hashtable<>();
        hashtable.put(1, "one");
        hashtable.put(2, "two");
        hashtable.put(3, "three");
        System.out.println(hashtable);
        System.out.println(" -- ");
        //  hashtable.put(3, null); // java.lang.NullPointerException
        // hashtable.put(null, "four"); // java.lang.NullPointerException


        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1, "one");
        hashMap.put(2, "two");
        hashMap.put(3, "three");
        hashMap.put(3, null);
//        hashMap.put(null, "four");
        hashMap.put(null, null);
        System.out.println(hashMap);


        Enumeration<Integer> enumeration  = hashtable.keys();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }



    }
}
