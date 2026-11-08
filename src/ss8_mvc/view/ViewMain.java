package ss8_mvc.view;

import ss8_mvc.controller.StudentController;

public class ViewMain {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        studentController.showMenu();
    }
}
