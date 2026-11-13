package ss8_mvc.controller;

import ss8_mvc.entity.Student;
import ss8_mvc.service.IStudentService;
import ss8_mvc.service.StudentService;
import ss8_mvc.view.StudentView;

import java.util.List;
import java.util.Scanner;

public class StudentController {
    private IStudentService studentService = new StudentService();
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("-----Quản lý sinh viên-----" +
                    "\n1. Danh sách" +
                    "\n2. Thêm mới" +
                    "\n3. Xoá" +
                    "\n4. Tìm kiếm" +
                    "\n5. Quay lại menu chính ");
            System.out.println("-------Chọn chức năng-------");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    // chức hiể thị code ở đây
                    System.out.println("Hiển thị danh sách");
                    // gọi service lấy dữ liệu
                    List<Student> studentList = studentService.getAll();
                    // gọi view để hien thi
                    StudentView.showList(studentList);
                    break;
                case 2:
                    // yêu cầu view nhập dữ liệu
                    Student student = StudentView.inputData();
                    // gọi service để thêm mới
                    studentService.add(student);

                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    flag = false;
            }
        }
    }
}
