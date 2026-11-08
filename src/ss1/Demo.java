package ss1;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
//        System.out.println("Nhập tên");
//        String name = scanner.nextLine();
//
//        System.out.println("nhập tuổi");
//        int age = Integer.parseInt( scanner.nextLine()) ;
//
//        System.out.println("nhập điểm");
//        float score = Float.parseFloat(scanner.nextLine());
//
//        System.out.println("Nhập địa chỉ");
//        String address = scanner.nextLine();

//        System.out.println("Tên : "+name);
//        System.out.println("Tuổi : "+age);
//        System.out.println("Địa chỉ : "+address);

//        if (score>8){
//            System.out.println("giỏi");
//        }else if (score>7){
//            System.out.println("khá");
//        }else {
//            System.out.println("dốt");
//        }

        int i1 = 10;
        int i2 = 10;
        System.out.println(i1==i2); // true
        Student  student1 = new Student(1,"chanh");
        Student  student2 = new Student(1,"chanh");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student1==student2);// false
    }
}
