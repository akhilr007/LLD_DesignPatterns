package Structural.Composite.Employee;

import java.util.ArrayList;
import java.util.List;

public class Department implements EmployeeComponent{

    private String name;
    private List<EmployeeComponent> members;

    public Department(String name) {
        this.name = name;
        this.members = new ArrayList<>();
    }

    public void addMember(EmployeeComponent member){
        members.add(member);
    }

    @Override
    public void displayInfo() {
        System.out.println("Department: " + name);
        for (EmployeeComponent member : members) {
            member.displayInfo();
        }
    }

    @Override
    public double calculateSalary() {
        double totalSalary = 0.0;
        for (EmployeeComponent member : members) {
            totalSalary += member.calculateSalary();
        }
        return totalSalary;
    }
}
