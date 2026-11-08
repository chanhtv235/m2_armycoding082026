package ss4_class_object.bt;

public class RunApp {
    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.setOn(true);
        System.out.println(fan.toString());

        fan.runThree();
        System.out.println(fan.toString());

        fan.stop();

        System.out.println(fan);
        System.out.println(fan.toString());

    }
}
