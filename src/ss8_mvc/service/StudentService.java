package ss8_mvc.service;

import ss8_mvc.entity.Student;
import ss8_mvc.repository.IStudentRepository;
import ss8_mvc.repository.StudentRepository;

public class StudentService implements IStudentService{
    private IStudentRepository studentRepository = new StudentRepository();
    @Override
    public Student[] getAll() {
        // nếu xử lý nghiệp vụ thì xử lý ở đây
        // nghiệp vụ: xử lý logic ( vd sắp xếp danh sach)
        return studentRepository.getAll();
    }

    @Override
    public Student[] searchByName() {
        return new Student[0];
    }

    @Override
    public void add(Student student) {
        // nếu xử lý nghiệp vụ thì xử lý ở đây
        // validation ( kiểm tra tính hợp lệ dữ liệu trớc khi thêm mới
        studentRepository.add(student);
    }

    @Override
    public void deleteById(int id) {

    }
}
