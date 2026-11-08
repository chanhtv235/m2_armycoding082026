package ss3_method;

public class Demo {
     int s =100; // biến toàn cục/ thuộc tính của đối tượng
     static int s2 =200;
    // dùng để chạy chương trình
    public static void main(String[] args) {
       sum(10,20);
       sum(10,20.0);
    }


    public static void showMessage1(String name){
        System.out.println("Hello: "+ name );
    }

    public static void showMessage1(int name){
        System.out.println("Hello: "+ name );
    }


    static void sum( int b,double a){
        System.out.println("-------hàm số thực------");
        System.out.println( a+b);

    }
    static void sum(int a, int b){
        System.out.println("-------hàm số nguyên----");
        System.out.println( a+b);

    }


    protected boolean checkScore(float score){
        return score>=5;
    }


}
