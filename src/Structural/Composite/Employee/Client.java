package Structural.Composite.Employee;

public class Client {
    public static void main(String[] args) {
        EmployeeComponent keerti = new Employee("Keerti", 100.0);
        EmployeeComponent amit = new Employee("Amit", 200.0);

        Team sales = new Team("Sales");
        sales.addMember(keerti);
        sales.addMember(amit);

        EmployeeComponent bob = new Employee("Bob", 50.0);

        Team marketing = new Team("Marketing");
        marketing.addMember(bob);

        Department headOffice = new Department("Head Office");
        headOffice.addMember(sales);
        headOffice.addMember(marketing);

        // Display and calculate total salary for the organization hierarchy
        headOffice.displayInfo();
        double totalSalary = headOffice.calculateSalary();
        System.out.println("Total Salary for the Organization: Rs." + totalSalary);
    }
}
