package ss8_mvc.entity;

public class Student extends Person{
    private String className;

    public Student() {
    }
    public Student(int id, String name, String className) {
        super(id, name);
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return super.toString() + "- Class name : "+ this.className;
    }
}
