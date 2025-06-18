package Nov.ex_21112024_List_Set_Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Lab211_ArrayList_Class {
    public static void main(String[] args) {
        ClassConstructor_Student classConstructor_Student_s1 = new ClassConstructor_Student("Amit", "1");
        ClassConstructor_Student classConstructor_Student_s2 = new ClassConstructor_Student("Anil", "2");
        ClassConstructor_Student classConstructor_Student_s3 = new ClassConstructor_Student("Nikuj", "3");

        List<ClassConstructor_Student> list_ArrayList_object_myStudents = new ArrayList<>();
        list_ArrayList_object_myStudents.add(classConstructor_Student_s1);
        list_ArrayList_object_myStudents.add(classConstructor_Student_s2);
        list_ArrayList_object_myStudents.add(classConstructor_Student_s3);

        classConstructor_Student_s1.method_printDetails();
        classConstructor_Student_s2.method_printDetails();
        classConstructor_Student_s3.method_printDetails();


        System.out.println(list_ArrayList_object_myStudents);


    }
}
