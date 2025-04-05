class Employee {
 	private String name;

 	public Employee(String name) {
     	this.name = name;
 	}

 	public String getName() {
     	return name;
 	}
 }

 class Department {
 	private String deptName;
 	private Employee[] employees;
 	private int empCount;

 	public Department(String deptName, int maxEmployees) {
     	this.deptName = deptName;
     	this.employees = new Employee[maxEmployees];
     	this.empCount = 0;
 	}

 	public void addEmployee(String employeeName) {
     	if (empCount < employees.length) {
         	employees[empCount++] = new Employee(employeeName);
     	} else {
         	System.out.println("Cannot add more employees to " + deptName);
     	}
 	}

 	public void showEmployees() {
     	System.out.println("Employees in " + deptName + ":");
     	for (int i = 0; i < empCount; i++) {
         	System.out.println("  - " + employees[i].getName());
     	}
 	}

 	public String getDeptName() {
     	return deptName;
 	}
 }

 class Company {
 	private String companyName;
 	private Department[] departments;
 	private int deptCount;

 	public Company(String companyName, int maxDepartments) {
     	this.companyName = companyName;
     	this.departments = new Department[maxDepartments];
     	this.deptCount = 0;
 	}

 	public void addDepartment(String deptName, int maxEmployees) {
     	if (deptCount < departments.length) {
         	departments[deptCount++] = new Department(deptName, maxEmployees);
     	} else {
         	System.out.println("Cannot add more departments to the company.");
     	}
 	}

 	public void addEmployeeToDepartment(String deptName, String employeeName) {
     	for (int i = 0; i < deptCount; i++) {
         	if (departments[i].getDeptName().equals(deptName)) {
                 departments[i].addEmployee(employeeName);
             	return;
         	}
     	}
     	System.out.println("Department " + deptName + " not found.");
 	}

 	public void showStructure() {
     	System.out.println("Company: " + companyName);
     	for (int i = 0; i < deptCount; i++) {
             departments[i].showEmployees();
     	}
 	}

 	public void deleteCompany() {
     	for (int i = 0; i < deptCount; i++) {
         	departments[i] = null;
     	}
     	departments = null;
     	deptCount = 0;
     	System.out.println("Company " + companyName + " and all its departments and employees have been deleted.");
 	}
 }

 public class CompanyStructure {
 	public static void main(String[] args) {
     	Company company = new Company("SoftWareCo", 3);

     	company.addDepartment("Development", 5);
     	company.addDepartment("Marketing", 3);

         company.addEmployeeToDepartment("Development", "Alice");
         company.addEmployeeToDepartment("Development", "Bob");
         company.addEmployeeToDepartment("Marketing", "Charlie");

     	company.showStructure();

     	company.deleteCompany();
 	}
 }
