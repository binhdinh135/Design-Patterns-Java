package PatternTwo.composite;

import java.util.ArrayList;
import java.util.List;

public class Leader extends Employee {
    List<Employee> employees = new ArrayList<Employee>();

    public Leader(String name, double salary, int age) {
        super(name, salary, age);
    }

    @Override
    public void add(Employee employee) {
       employees.add(employee);
    }

    @Override
    public void remove(Employee employee) {
       employees.remove(employee);
    }

    @Override
    public void print() {
        System.out.println("=====================");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Salary: " + getSalary());
        for (Employee employee : employees) {
            employee.print();
        }

    }
}
