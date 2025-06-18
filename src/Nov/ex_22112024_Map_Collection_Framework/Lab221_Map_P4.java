package Nov.ex_22112024_Map_Collection_Framework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lab221_Map_P4 {
    public static void main(String[] args) {


        HashMap<String, String> hashMap_student1 = new HashMap();
        hashMap_student1.put("name", "pramod");
        hashMap_student1.put("roll", "1");
        hashMap_student1.put("phone", "96543210");
        System.out.println(hashMap_student1);

        HashMap<String, String> hashMap_student2 = new HashMap();
        hashMap_student2.put("name", "amit");
        hashMap_student2.put("roll", "2");
        hashMap_student2.put("phone", "65432356");
        System.out.println(hashMap_student2);

        List arrayList_students = new ArrayList();
        arrayList_students.add(hashMap_student1);
        arrayList_students.add(hashMap_student2);
        System.out.println(arrayList_students);


    }
}
