package PatternTwo.composite;

public abstract class Employee {
    protected String name;
    protected double salary;
    protected int age;

    public Employee(String name, double salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void add(Employee employee);
    public abstract void remove(Employee employee);
    public abstract void print();
}
