package Nov.ex_22112024_Map_Collection_Framework;

//import java.util.*; // Import all the modules
//// don't do it, it will slow down the code.


import java.util.HashMap;
import java.util.Map;

public class Lab217_Map_P1 {
    public static void main(String[] args) {
        // Map is key - value
        // name : pramod, rollno : 1
        // phone : 9876543210
        Map hashMap = new HashMap(); // Generics

        // Map<String,Object> m1 = new HashMap();
        // Data Type - Fixed

        hashMap.put("name", "Pramod");
        hashMap.put("rollNo", 123);
        hashMap.put("phone", 98765432);
        System.out.println(hashMap);

        // When to use Map and when to use List?
        // List -> Shopping , single items,
        // name -> pramod, rol : 1


    }
}
