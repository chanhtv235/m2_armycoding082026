package ss3_method;


import java.util.Arrays;

public class DemoThamTriVaThamChieu {
    public static void main(String[] args) {
//        int a = 10;
//        change1(a);
//        System.out.println("bên ngoài "+a);

        int[] arr = new int[]{1,2};
        changeArray(arr);
        System.out.println("Ngoài hàm: " + Arrays.toString(arr));

    }

    public static void changeArray(int[] array){
        array = new int[]{100,200};
        System.out.println("trong hàm " + Arrays.toString(array));
    }


    public static void change1(int x){
        x++;
        System.out.println("trong hàm " + x);
    }










}
