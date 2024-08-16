package PatternTwo.composite;

public class Developer extends Employee {

    public Developer(String name, double salary, int age) {
        super(name, salary, age);
    }

    @Override
    public void add(Employee employee) {

    }

    @Override
    public void remove(Employee employee) {

    }

    @Override
    public void print() {
        System.out.println("===============");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Salary: " + getSalary());

    }
}
