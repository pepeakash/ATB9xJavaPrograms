package Nov.ex_19112024_Generics_Why_Collection_Framework;
import java.util.Collection;
import java.util.ArrayList;

// List is Interface


public class Lab199_ArrayList {
    public static void main(String[] args) {

//        Collection list = new ArrayList(); // Dynamic Dispatch -
//        List list1 = new ArrayList(); // Dynamic Dispatch -
        ArrayList arrayList_studentList = new ArrayList();
        arrayList_studentList.add("Pramod");
        arrayList_studentList.add("Dutta");
        arrayList_studentList.add("Dutta"); // Duplicate is allowed.
        arrayList_studentList.add("Anil");
        arrayList_studentList.add("Amit");
        arrayList_studentList.add(true); // Different data type is allowed.
        arrayList_studentList.add(123);
        arrayList_studentList.add(null);


        System.out.println(arrayList_studentList);













    }
}
