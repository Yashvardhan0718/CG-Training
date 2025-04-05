import java.util.*;

abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("Emp ID: " + employeeId);
        System.out.println("Name : " + name);
        System.out.println("Base Salary per day: " + baseSalary);
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public String getDepartmentDetails() {
        return "Department: Not Assigned";
    }
}

class FullTimeEmployee extends Employee {
    private double salary;
    private int workingDays;

    public FullTimeEmployee(int employeeId, String name, double baseSalary, int workingDays) {
        super(employeeId, name, baseSalary);
        this.workingDays = workingDays;
        this.salary = calculateSalary();
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() * workingDays;
    }

    @Override
    public void displayDetails() {
        System.out.println("Full-Time Employee Details:");
        super.displayDetails();
        System.out.println("Working days: " + workingDays);
        System.out.println("Final Salary: " + salary);
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: Full-Time Department";
    }
}

class PartTimeEmployee extends Employee {
    private double salary;
    private int workingHours;

    public PartTimeEmployee(int employeeId, String name, double baseSalary, int workingHours) {
        super(employeeId, name, baseSalary);
        this.workingHours = workingHours;
        this.salary = calculateSalary();
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() * workingHours;
    }

    @Override
    public void displayDetails() {
        System.out.println("Part-Time Employee Details:");
        super.displayDetails();
        System.out.println("Working hours: " + workingHours);
        System.out.println("Final Salary: " + salary);
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: Part-Time Department";
    }
}

class Main {
    public static void main(String[] args) {


        FullTimeEmployee emp = new FullTimeEmployee(1, "Aro", 1000, 20);
        emp.displayDetails();


    }
}
