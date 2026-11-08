package ss4_class_object;

public class Teacher extends Employee implements ITraining{
    @Override
    public void howToGo() {
        System.out.println(" GV đi học bằng xe đạp");
    }

    @Override
    public void attendance() {
        System.out.println(" GV có thể điểm danh");
    }

}
