package ss10_list;

import ss1.Student;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo {




    public static void main(String[] args) {

        List list1 = new ArrayList();// ép kiểu ngầm định

//        Integer i = 1;
        list1.add(1); // 0

        list1.add("hello");//1

        list1.add(new Student());//2

        System.out.println(((Student)list1.get(1)).getName());

        List<Student> students = new ArrayList<>();
        students.add(new Student());





    }
}
