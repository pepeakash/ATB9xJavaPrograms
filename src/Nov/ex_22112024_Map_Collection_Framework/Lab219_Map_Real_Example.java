package Nov.ex_22112024_Map_Collection_Framework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Lab219_Map_Real_Example {
    public static void main(String[] args) {
        Map<String, Object> hashMap_student1 = new HashMap();
        hashMap_student1.put("name", "Diwakar");
        hashMap_student1.put("phone", "9876543210");
        hashMap_student1.put("address", "Bangalore");


        Set hashSet_book_read_items = new HashSet();
        hashSet_book_read_items.add("Rich dad Poor Dad");
        hashSet_book_read_items.add("Sapaiens");
        hashSet_book_read_items.add("Secret");
        hashSet_book_read_items.add("Atomic Habit");
        hashSet_book_read_items.add("Atomic Habit");
        hashSet_book_read_items.add("Eat the Frog");


    }
}
