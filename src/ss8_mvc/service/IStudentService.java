package ss8_mvc.service;

import ss8_mvc.entity.Student;

public interface IStudentService {
  Student[] getAll();
  Student[] searchByName();
  void add(Student student);
  void deleteById(int id);

}
