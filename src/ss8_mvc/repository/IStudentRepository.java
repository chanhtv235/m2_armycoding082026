package ss8_mvc.repository;

import ss8_mvc.entity.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> getAll();
    List<Student> searchByName();
    void add(Student student);
    void deleteById(int id);
}
