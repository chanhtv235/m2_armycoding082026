package ss8_mvc.controller;

import ss8_mvc.entity.Teacher;
import ss8_mvc.view.TeacherView;

import java.util.Scanner;

public class MainController {
    // Nguyên lý thiết kế phần mềm SOLID:
    // + S : Single Responsibility; trách nhiệm duy nhât: => mỗi mỗi class chỉ nên  làm môtj nhiêm vụ duy nahats
    private StudentController studentController = new StudentController();
    private TeacherController teacherController = new TeacherController();
    public  void showMainMenu(){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            System.out.println("-----Chương trình quản lý-----" +
                    "\n1. Quản lý sinh viên" +
                    "\n2. Quản lý giáo viên" +
                    "\n3. Quản lý môn học" +
                    "\n4. Quản lý thời khoá biểu" +
                    "\n5. Thoát");
            System.out.println("-------Chọn chức năng-------");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    studentController.showMenu();
                    break;
                case 2:
                    teacherController.showMenu();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    flag = false;
            }
        }
        System.out.println("------Kết thúc chương trình -----------");

    }


}
