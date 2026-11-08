package ss4_class_object;

public class StudentManager {
    public static Student[] studentList = new Student[100];
    static {
        System.out.println(" khối static chạy");
        studentList[0] = new Student(1, "chánh", "ĐN");
        studentList[1] = new Student(2, "hai", "ĐN");
        studentList[2] = new Student(3, "anh", "ĐN");
        studentList[4] = new Student(4, "thanh", "ĐN");
    }

    public void showList(){
        for (int i = 0; i <studentList.length ; i++) {
            if (studentList[i]!=null){
                System.out.println(studentList[i].toString());
            }else {
                break;
            }
        }
    }
    // [st1,st2,st3,student , student,,,,,null]
    public void add(Student student){
        for (int i = 0; i <studentList.length ; i++) {
            if (studentList[i]==null){
               studentList[i] = student;
               break;
            }
        }
    }

    public void deleteById(int deleteId) {
        for (int i = 0; i <studentList.length ; i++) {
            if (studentList[i]!=null){
               if (studentList[i].getId()==deleteId){
                   for (int j = i; j <studentList.length-1 ; j++) {
                       studentList[j]=studentList[j+1];
                   }
               }
            }else {
                break;
            }
        }
    }

    public void search(String searchName) {
        for (int i = 0; i <studentList.length ; i++) {
            if (studentList[i]!=null){
               if (studentList[i].getName().contains(searchName)){
                   System.out.println(studentList[i].toString());
               }
            }else {
                break;
            }
        }
    }
}
