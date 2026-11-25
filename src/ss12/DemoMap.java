package ss12;

import java.util.*;

public class DemoMap {
    public static void main(String[] args) {
        // tạo map lưu số buổi vắng nghỉ của hv < HV, SBVN>
        Set<Student> students = new TreeSet<>();
        students.add(new Student(10,"chánh10"));
        students.add(new Student(1,"chánh1"));
        students.add(new Student(4,"chánh4"));
        students.add(new Student(5,"chánh5"));
        students.add(new Student(6,"chánh6"));
        students.add(new Student(6,"chánh16"));
        students.add(new Student(6,"chánh6"));
        for (Student student : students){
            System.out.println(student);
        }
        System.out.println("==================================================");
        Map<Student,Integer> map = new TreeMap<>();
        map.put(new Student(1,"chanh1"),12);
        map.put(new Student(13,"chanh1"),12);
        map.put(new Student(5,"chanh1"),12);
        map.put(new Student(5,"chanh11111111"),12);
        map.put(new Student(1,"chanh1"),12);

        Set<Map.Entry<Student, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Student,Integer> entry: entrySet){
            System.out.println(entry.getKey() +": "+ entry.getValue());
        }




    }
}
