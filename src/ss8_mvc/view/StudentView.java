package ss8_mvc.view;

import ss8_mvc.entity.Student;

import java.util.List;
import java.util.Scanner;

public class StudentView {

    private static Scanner scanner = new Scanner(System.in);

    public static void showList(List<Student> students){
        for (int i = 0; i <students.size() ; i++) {
                System.out.println(students.get(i).toString());
        }
    }

    public static Student inputData() {

        System.out.println("Thêm mới");
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập địa chỉ");
        String address =  scanner.nextLine();
        Student student = new Student(id,name,address);
        return student;
    }
}
