package ss8_mvc.controller;

import ss8_mvc.entity.Student;
import ss8_mvc.entity.Teacher;
import ss8_mvc.service.ITeacherService;
import ss8_mvc.service.TeacherService;
import ss8_mvc.view.StudentView;
import ss8_mvc.view.TeacherView;

import java.util.Scanner;

public class TeacherController {
   private ITeacherService teacherService = new TeacherService();
    public  void showMenu(){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            System.out.println("-----Quản lý Giáo viên-----" +
                    "\n1. Danh sách" +
                    "\n2. Thêm mới" +
                    "\n3. Xoá" +
                    "\n4. Tìm kiếm" +
                    "\n5. Quay lại menu chính ");
            System.out.println("-------Chọn chức năng-------");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    // chức hiể thị code ở đây
                    System.out.println("Hiển thị danh sách");
                    // gọi service lấy dữ liệu
                    Teacher[] teacherList = teacherService.getAll();
                    // gọi view để hien thi
                    TeacherView.showList(teacherList);
                    break;
                case 2:
                    // yêu cầu view nhập dữ liệu
                    Teacher teacher = TeacherView.inputData();
                    // gọi service để thêm mới

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
