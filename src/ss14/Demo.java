package ss14;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {

        // kiểm trả xem chuỗi nhập vào có đúng email hay không?
        // phải có ít nhất 6 ky tự
        // không được đặt chữ số đầu tiên
        // phải 1 ký tự @ ở giữa
        // xxxxxxx@yyyy.zzz

       // tên tiếng anh

        // phải có họ
        // ký tự đầu tiên của họ hoaạc tên phải in hoa
        // tên có thể dài bao nhiêu cũng được

//        String regexName = "^[A-Z][a-z]*(\\s[A-Z][a-z]*)+$";
        String regexName = "^[A-Z][a-z]*(\\s[A-Z][a-z]*)+$";

        String name = "Tran Van Chanh";
//
        System.out.println(name.matches(regexName));

    }
}
