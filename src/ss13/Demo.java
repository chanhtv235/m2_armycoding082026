package ss13;

import ss8_mvc.entity.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Demo {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("----------------start -----------------------");
        String filePath ="";
        boolean inputAgain;
        do {
            inputAgain = false;
            System.out.println("Nhap tên file");
            filePath = scanner.nextLine();
            try {
                readFile(filePath);
            } catch (FileNotFoundException e) {
                System.out.println("nhập lại file");
                inputAgain = true;
            }
        }while (inputAgain);
        System.out.println("-------------------finish--------------------");
    }

    public static void getElement() {
        int[] array = {10, 20, 30, 40, 50};
        System.out.println("Nhập index cần lấy ra");
        int index = -1;
        try {
            index = Integer.parseInt(scanner.nextLine());
            System.out.println("Phần tử cần lấy : " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Do truy cập ngoài mảng nên lấy phần tử cuối");
            index = array.length - 1;
            System.out.println("Phần tử cần lấy : " + array[index]);
        } catch (NumberFormatException e) {
            // mong muôn khi người dùng mà nhạp sai địn dạng thì anh cho lấy pt dầu tiên
            index = 0;
            System.out.println("-------do nhập sai định dạng nên yêu lấy vị trí 0 ");
            System.out.println("Phần tử cần lấy : " + array[index]);
        } catch (Exception e) {
            System.out.println("--lỗi chưa biết là gì--");
            e.printStackTrace();
            ;
        } finally {
//            System.out.println("--------Khối finally luôn chạy cho dù có exception xảy ra hãykhoong---");
//            System.out.println("----------công việc bắt buộc phải chạy cho du có lỗi hay không");
            System.out.println("-----------Luôn luôn đong file/ngắt kết nối voi CSDL-----------------");
        }
        System.out.println("-----đã lấy được pt");
    }


    public static void readFile(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        FileReader fileReader = new FileReader(file);
        System.out.println("------------lấy dữ liệu xong");
        System.out.println("----xong dọc file");
    }
}
