package ss4_class_object;

public abstract class Person {
    private int id;
    private String name;
    private String address;

    public Person() {
    }

    public Person(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public abstract void howToGo();

    @Override
    public String toString() {
        return "id : " + this.id + " name : "+this.name + " address: " + this.address;
    }
}
