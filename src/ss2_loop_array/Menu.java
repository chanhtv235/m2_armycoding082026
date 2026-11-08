package ss2_loop_array;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
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
                    break;
                case 2:
                    // chức hiể thị code ở đây
                    System.out.println("Thêm mới");
                    break;
                case 3:
                    // chức hiể thị code ở đây
                    System.out.println("Xoá");
                    break;
                case 4:
                    // chức hiể thị code ở đây
                    System.out.println("Tìm  kiếm");
                    break;
                default:
                    flag = false;

            }
        }
        System.out.println("------Kết thúc chương trình -----------");
    }
}
