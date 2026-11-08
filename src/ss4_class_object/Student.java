package ss4_class_object;

import java.util.Objects;

public class Student extends Person {
    public static String school = "BK";
    private float score;
    private Address address;

    public Student() {
    }

    public Student(int id, String name, String address) {
        super(id, name, address);
    }



    public Student(int id, String name, String address, float score) {
        super(id, name, address);
        this.score = score;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @Override
    public void howToGo() {
        System.out.println("Sinh viên đi xe máy");
    }

    public void study(){
        System.out.println("Sinh viên có thể học môn tiếng anh");
    }

        @Override
    public String toString() {
        return super.toString() + " school: "+ school + " score : "+ this.score;
    }
}
