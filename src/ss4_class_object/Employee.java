package ss4_class_object;

public abstract class Employee extends Person{
    private float salary;

    public Employee() {
    }

    public Employee(int id, String name, String address, float salary) {
        super(id, name, address);
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
