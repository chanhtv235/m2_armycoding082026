package ss8_mvc.repository;

import ss8_mvc.entity.Student;

public class StudentRepository implements IStudentRepository{
    public static Student[] studentList = new Student[100];

    static {
        System.out.println(" Gỉa lập danh sách");
        studentList[0] = new Student(1, "chánh", "ĐN");
        studentList[1] = new Student(2, "hai", "ĐN");
        studentList[2] = new Student(3, "anh", "ĐN");
        studentList[3] = new Student(4, "thanh", "ĐN");
    }

    @Override
    public Student[] getAll() {
        // kết DB hoặc đọc ghi file
        return studentList;
    }

    @Override
    public Student[] searchByName() {
        return new Student[0];
    }

    @Override
    public void add(Student student) {
        for (int i = 0; i <studentList.length ; i++) {
            if (studentList[i]==null){
                studentList[i] = student;
                break;
            }
        }
    }

    @Override
    public void deleteById(int id) {

    }
}
