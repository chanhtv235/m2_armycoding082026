package ss10_list;
// type: T
// key, value, K,V
// Element: E
public class GBox <T> {
    private  T t;

    public GBox() {

    }


    public T getValue() {
        return t;
    }

    public void setValue(T value) {
        this.t = value;
    }
    public <H> void showInfo(H info){
        System.out.println(info);
    }

}
