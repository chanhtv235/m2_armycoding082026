package ss8_mvc.view;

import ss8_mvc.entity.Student;
import ss8_mvc.entity.Teacher;

import java.util.Scanner;

public class TeacherView {
    private static Scanner scanner = new Scanner(System.in);

    public static void showList(Teacher[] teachers) {
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] != null) {
                System.out.println(teachers[i].toString());
            } else {
                break;
            }
        }
    }

    public static Teacher inputData() {
        System.out.println("Thêm mới");
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();
        Teacher teacher = new Teacher();
        return teacher;
    }
}
