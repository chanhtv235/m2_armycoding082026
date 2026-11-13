package ss8_mvc.repository;

import ss8_mvc.entity.Student;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StudentRepository implements IStudentRepository{
    public static List<Student> studentList = new LinkedList<>();

    static {
        System.out.println(" Gỉa lập danh sách");
        studentList.add(new Student(1, "chánh", "ĐN"));
        studentList.add(new Student(2, "chánh", "ĐN"));
        studentList.add(new Student(3, "chánh", "ĐN"));

    }

    @Override
    public List<Student> getAll() {
        // kết DB hoặc đọc ghi file
        return studentList;
    }

    @Override
    public List<Student> searchByName() {
        return null;
    }

    @Override
    public void add(Student student) {
       studentList.add(student);
    }

    @Override
    public void deleteById(int id) {

    }
}
