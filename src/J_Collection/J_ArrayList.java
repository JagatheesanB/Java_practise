package J_Collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class J_ArrayList {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student(1, "jagadeesh"));
        arrayList.add(new Student(2, "nawaz"));
//        using Constructor
        Student std = new Student(3, "rahul");
        arrayList.add(std);

//        Using setter
        Student setter = new Student();
        setter.SetName("abdul");
        setter.SetRollNo(4);
        arrayList.add(setter);
        arrayList.add(new Student(1, "jo"));

//       To update item in the list of index 1
        arrayList.set(1, new Student(1, "yusuf"));

//        Before Removing
        for (Student student : arrayList) {
            System.out.println(student.getName());
        }
//        After Removing
        arrayList.remove(1);
        for (Student student : arrayList) {
            System.out.println(student.getName());
        }
//        LinkedList
        LinkedList<Student> linkedList  = new LinkedList<>();
        linkedList.add(0,new Student(1,"kane"));
        System.out.println("<-----LinkedList----->");
        for(Student student : linkedList){
            System.out.println(student.getName());
        }

    }
}
