package ss10_list;

import ss1.Student;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo {


    public static int sum(int a) {
        return a + 10;
    }

    public static void main(String[] args) {

        List<Object> list1 = new ArrayList();// ép kiểu ngầm định

//        Integer i = 1;
        list1.add(1); // 0

        list1.add("hello");//1

        list1.add(new Student());//2
        System.out.println("------chạy-------");
        System.out.println(((Student) list1.get(2)).getName());

//        List<Student> students = new ArrayList<>();
//        students.add(new Student());
//
        List<String> stringList = new ArrayList<>();

        stringList.add("Hello");
//        stringList.add(new Student());// an toan

        Box box = new Box("hello");

        GBox<String> stringGBox = new GBox<>();
        stringGBox.setValue("Hello");
        System.out.println(stringGBox.getValue());

        GBox<Student> studentGBox = new GBox<>();
        studentGBox.setValue(new Student());

        GBox<Integer> integerGBox = new GBox<>();
        integerGBox.setValue(1);

        integerGBox.showInfo("hello");
        integerGBox.showInfo(new Student());


    }


}
