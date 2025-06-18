package Nov.ex_22112024_Map_Collection_Framework;

//import java.util.*; // Import all the modules
//// don't do it, it will slow down the code.


import java.util.HashMap;
import java.util.Map;

public class Lab218_Map_P2 {
    public static void main(String[] args) {
        //Map<String,Integer> map = new HashMap<String,Integer>();
        //Map<String,Integer> map = new HashMap<>();
        Map<String, Integer> hashMap = new HashMap();


        //Map map = new HashMap();

        hashMap.put("id", 1);
        hashMap.put("id", 2);
        hashMap.put("id2", 2);
        hashMap.put("id3", 34);
        hashMap.put("id6", 34);
        hashMap.put("id4", null);
        hashMap.put("id5", null);
        hashMap.put(null, 102);
        hashMap.put(null, 109);

        System.out.println(hashMap);
        System.out.println(hashMap.size());
        System.out.println(hashMap.isEmpty());
        System.out.println(hashMap.containsKey("id2"));
        System.out.println(hashMap.containsValue(99));


        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());

        System.out.println(hashMap.get("id3"));


    }
}
