package ss4_class_object;

public interface ITraingAndGame extends IGame, ITraining {

    @Override
    default void showMessage(String text) {
        IGame.super.showMessage(text);
    }
}
