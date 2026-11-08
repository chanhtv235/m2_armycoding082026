package ss4_class_object;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class RunApp {
    private static StudentManager studentManager = new StudentManager();
    public static void main(String[] args) {
//        StudentManager studentManager = new StudentManager();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            System.out.println("-----Quản lý sinh viên-----" +
                    "\n1. Danh sách" +
                    "\n2. Thêm mới" +
                    "\n3. Xoá" +
                    "\n4. Tìm kiếm" +
                    "\n5. Thoát");
            System.out.println("-------Chọn chức năng-------");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    // chức hiể thị code ở đây
                    System.out.println("Hiển thị danh sách");
                    studentManager.showList();
                    break;
                case 2:
                    System.out.println("Thêm mới");
                    System.out.println("Nhập id");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập tên");
                    String name = scanner.nextLine();
                    System.out.println("Nhập địa chỉ");
                    String address =  scanner.nextLine();
                    Student student = new Student(id,name,address);
                    studentManager.add(student);
                    break;
                case 3:
                    // chức hiển thị code ở đây
                    System.out.println("Xoá");
                    System.out.println("nhập id cần xoá");
                    int deleteId = Integer.parseInt(scanner.nextLine());
                    studentManager.deleteById(deleteId);
                    break;
                case 4:
                    // chức hiể thị code ở đây
                    System.out.println("Tìm  kiếm");
                    System.out.println("Nhập tên cần tim");
                    String searchName = scanner.nextLine();
                    studentManager.search(searchName);
                    break;
                default:
                    flag = false;
            }
        }
        System.out.println("------Kết thúc chương trình -----------");

    }
}
