package ss8_mvc.entity;

public class Student extends Person implements Comparable<Student>{
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



//    @Override
//    public int compareTo(Student o) {
//        // nếu return lại số <0 thì giảm dần
//        // return số > 0 thì tăng dẫn
//        // return =0 :không sắp xếp
//        return 0;
//    }


    @Override
    public int compareTo(Student o) {
         if (this.getId()==o.getId()){
            return this.getName().compareTo(o.getName());
         }
        return this.getId()-o.getId();
    }

    @Override
    public String getInfoToFile() {
        return super.getInfoToFile()+","+this.className;
    }
}
