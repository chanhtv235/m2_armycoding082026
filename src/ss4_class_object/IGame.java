package ss4_class_object;

public interface IGame {
    void organizeGame();
    default void showMessage(String text){
        System.out.println("hello1" + text);
    }
}
