package ss12;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private int id;
    private String name;

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "id: " + id + "- name: "+ name;
    }

    @Override
    public int compareTo(Student o) {
        if (this.id ==o.id){
            return this.name.compareTo(o.name);
        }
        return this.id-o.id;
    }

//    @Override
//    public boolean equals(Object obj) {
//        Student student = (Student)obj;
//        return  this.id == student.id;
//    }
//
//    @Override
//    public int hashCode() {
//        return this.id;
//        //3224433
//    }

}
