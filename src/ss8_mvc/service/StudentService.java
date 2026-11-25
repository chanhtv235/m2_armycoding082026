package ss8_mvc.service;

import ss8_mvc.common.CompaByName;
import ss8_mvc.entity.Student;
import ss8_mvc.repository.IStudentRepository;
import ss8_mvc.repository.StudentRepository;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentService implements IStudentService{
    private IStudentRepository studentRepository = new StudentRepository();
    @Override
    public List<Student> getAll() {
        // nếu xử lý nghiệp vụ thì xử lý ở đây
        // nghiệp vụ: xử lý logic ( vd sắp xếp danh sach)
        List<Student> studentList = studentRepository.getAll();
        // sắp xếp => xử lý nghiệp  vụ
        Collections.sort(studentList);

//        Collections.sort(studentList, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
        Collections.sort(studentList,new CompaByName());
        return studentList;
    }

    @Override
    public List<Student> searchByName() {
        return null;
    }

    @Override
    public void add(Student student) {
        // nếu xử lý nghiệp vụ thì xử lý ở đây
        // validation ( kiểm tra tính hợp lệ dữ liệu trớc khi thêm mới
        studentRepository.add(student);
    }

    @Override
    public void deleteById(int id) {
      // kiểm tra id có tồn tại hay không
        Student student = studentRepository.findById(id);
        if (student!=null){
            studentRepository.deleteById(id);
        }else {
            System.out.println("Id không tồn tại");
        }
    }
}
