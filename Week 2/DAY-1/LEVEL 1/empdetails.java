public class Employees  {
   private String name;
   private int id;
   private int salary;


   Employees(String name, int id, int salary) {
       this.name = name;
       this.id = id;
       this.salary = salary;
   }
   void display() {
       System.out.println("Name: " + name);
       System.out.println("ID: " + id);
       System.out.println("Salary: " + salary);
   }
}
class EmpDetails {
   public static void main(String[] args) {
       Employees emp1 = new Employees("Ar", 10, 100000);
       emp1.display();
   }}
