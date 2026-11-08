package ss2_loop_array;

public class Student {
     int id;
     String name;

    public Student() {

    }


    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "id: "+this.id + "name: "+ this.name;
    }
}
