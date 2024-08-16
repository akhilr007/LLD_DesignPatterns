package Structural.Composite.Employee;

import java.util.*;

public class Team implements EmployeeComponent {
    private String name;
    private List<EmployeeComponent> members;

    public Team(String teamName) {
        name = teamName;
        members = new ArrayList<>();
    }

    public void addMember(EmployeeComponent member) {
        members.add(member);
    }

    @Override
    public void displayInfo() {
        System.out.println("Team: " + name);
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
