package ss8_mvc.repository;

import ss8_mvc.entity.Student;

public interface IStudentRepository {
    Student[] getAll();
    Student[] searchByName();
    void add(Student student);
    void deleteById(int id);
}
