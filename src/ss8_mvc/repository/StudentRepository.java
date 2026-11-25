package ss8_mvc.repository;

import ss8_mvc.entity.Student;
import ss8_mvc.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StudentRepository implements IStudentRepository{
    private final String STUDENT_FILE = "src/ss8_mvc/data/student.csv";
    private final boolean APPEND = true;
    private final boolean NO_APPEND = false;


    @Override
    public List<Student> getAll() {
        // kết DB hoặc đọc ghi file

        List<String> stringList = ReadAndWriteFile.readFileCSVToStringList(STUDENT_FILE);
        List<Student> studentList = new ArrayList<>();
        String[] array = null;
        for (int i = 0; i <stringList.size() ; i++) {
            array = stringList.get(i).split(",");
            Student student = new Student(Integer.parseInt(array[0]),array[1],array[2]);
            studentList.add(student);
        }

        return studentList;
    }

    @Override
    public List<Student> searchByName() {
        return null;
    }

    @Override
    public void add(Student student) {
        List<String> stringList = new ArrayList<>();
        stringList.add(student.getInfoToFile());
        ReadAndWriteFile.writeStringListToCSVFile(STUDENT_FILE,stringList,APPEND);
    }

    @Override
    public void deleteById(int id) {
        List<Student> studentList = getAll();
        for (int i = 0; i <studentList.size() ; i++) {
            if (studentList.get(i).getId()==id){
                studentList.remove(i);
                break;
            }
        }
        List<String> stringList = new ArrayList<>();

        for (int i = 0; i <studentList.size() ; i++) {
            stringList.add(studentList.get(i).getInfoToFile());
        }
        ReadAndWriteFile.writeStringListToCSVFile(STUDENT_FILE,stringList,NO_APPEND);

     // xoá
    }

    @Override
    public Student findById(int id) {
        List<Student> studentList = getAll();
        for (int i = 0; i <studentList.size() ; i++) {
            if (studentList.get(i).getId()==id){
                return  studentList.get(i);
            }
        }
        return null;
    }
}
