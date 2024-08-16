package Structural.Composite.Employee;

public class Employee implements EmployeeComponent{

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void displayInfo() {
        System.out.println("Employee: " + name + " Salary: Rs." + salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}
