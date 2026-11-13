package ss8_mvc.service;

import ss8_mvc.entity.Student;

import java.util.List;

public interface IStudentService {
  List<Student> getAll();
  List<Student> searchByName();
  void add(Student student);
  void deleteById(int id);

}
