package ss4_class_object;

public interface ITraining {
    int i=7;
    void attendance();
     static int sum(int a,int b){
        return a+b;
     }
    default void showMessage(String text){
        System.out.println("xin chao" + text);
    }
}
