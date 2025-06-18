package Nov.ex_22112024_Map_Collection_Framework;

import java.util.HashMap;
import java.util.Map;

public class Lab220_map_P3 {
    public static void main(String[] args) {


        Map<String,Integer> hashMap = new HashMap();
        hashMap.put("id",1);
        hashMap.put("id2",2);
        hashMap.put("id3",34);
        hashMap.put("id4",null);
        hashMap.put("id5",null);
        hashMap.put(null,100);
        hashMap.put(null,200);


        // Iterate
        for(Map.Entry<String,Integer> item: hashMap.entrySet()){
            System.out.println(item.getKey() + " -> "+ item.getValue());
        }



    }
}
