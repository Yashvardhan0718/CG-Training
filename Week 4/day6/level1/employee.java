import java.util.*;
import java.util.stream.*;
import java.util.function.*;

class Employee {
    int id;
    String name;
    String department;
    double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String toString() {
        return id + " - " + name + " - " + department + " - $" + salary;
    }
}

public class EmployeeDataProcessing {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Alice", "Engineering", 95000),
            new Employee(2, "Bob", "HR", 60000),
            new Employee(3, "Charlie", "Engineering", 87000),
            new Employee(4, "David", "Marketing", 75000),
            new Employee(5, "Eve", "Engineering", 79000),
            new Employee(6, "Frank", "HR", 85000),
            new Employee(7, "Grace", "Engineering", 82000)
        );

        List<Employee> filteredSorted = employees.stream()
            .filter(e -> e.department.equals("Engineering") && e.salary > 80000)
            .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
            .collect(Collectors.toList());

        System.out.println("Filtered and Sorted:");
        filteredSorted.forEach(System.out::println);

        Map<String, List<Employee>> grouped = filteredSorted.stream()
            .collect(Collectors.groupingBy(e -> e.department));

        System.out.println("\nGrouped by Department:");
        grouped.forEach((dept, list) -> {
            System.out.println(dept);
            list.forEach(System.out::println);
        });

        Map<String, Double> avgSalaryByDept = grouped.entrySet().stream()
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                entry -> entry.getValue().stream()
                              .collect(Collectors.averagingDouble(e -> e.salary))
            ));

        System.out.println("\nAverage Salary by Department:");
        avgSalaryByDept.forEach((dept, avg) ->
            System.out.println(dept + ": $" + avg)
        );
    }
}
