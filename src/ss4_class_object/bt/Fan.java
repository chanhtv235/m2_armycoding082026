package ss4_class_object.bt;

public class Fan {
    private  final int SLOW = 1;
    private   final int MEDIUM = 2;
    private   final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void runOne(){
        this.speed = SLOW;
    }
    public void runTwo(){
        this.speed = MEDIUM;
    }

    public void runThree(){
        this.speed = FAST;
    }
    public void stop(){
        this.speed = 0;
        this.on = false;
    }

    public String toString() {
        if (this.isOn()) {
            return "Speed : " + this.speed + "- color: " + this.color + "- radius: " + this.radius + "- (Fan is on)";
        }
        return "Color: " + this.color + "- radius: " + this.radius + "(- Fan is off)";
    }
}
