package ss4_class_object;

public class Ministry extends Employee implements ITraining,IGame{
    @Override
    public void howToGo() {
        System.out.println("Giáo vụ đi làm bằng ô tô");
    }

    @Override
    public void attendance() {
        System.out.println("Giá vụ có thể điểm danh");
    }

    @Override
    public void showMessage(String text) {
        IGame.super.showMessage(text);
    }

    @Override
    public void organizeGame() {

    }
}
