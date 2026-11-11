package ss8_mvc.view;

import ss8_mvc.controller.MainController;
import ss8_mvc.controller.StudentController;

public class ViewMain {
    public static void main(String[] args) {
        MainController mainController = new MainController();
        mainController.showMainMenu();
    }
}
