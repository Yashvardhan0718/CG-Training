import java.util.*;
class Employee {
    String name ;
    int id;
    double salary;
    Employee(String name , int id, double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    void displayEmp(){
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Id: "+id);
        System.out.println("Employee Salary: "+salary);
    }
}
class  Manager extends Employee{
    int teamSize;
    Manager(String name , int id, double salary,int teamSize){
        super(name,id,salary);
        this.teamSize=teamSize;
    }void display(){
        System.out.println("Role : Manager");
        System.out.println("Team size : "+teamSize);
    }
}
class  Developer extends Employee{
    String programmingLanguage;
    Developer(String name , int id, double salary,String programmingLanguage){
        super(name,id,salary);
        this.programmingLanguage=programmingLanguage;
    }

    void display(){
        System.out.println("Role : Developer");
        System.out.println("Programming Language : "+programmingLanguage);
    }
}
class  Intern extends Employee{
    Intern(String name , int id, double salary){
        super(name,id,salary);
    }

    void display(){
        System.out.println("Role : Intern");
    }
}
class Test{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter emp name: ");
        String name = input.next();
        System.out.print("Enter emp id: ");
        int id = input.nextInt();
        System.out.print("Enter emp salary: ");
        double sal = input.nextDouble();
        System.out.print("Enter emp role: ");
        String role = input.next();
        Employee s=new Employee(name,id,sal);

        if (role.equalsIgnoreCase("Manager")){
            System.out.print("enter team size: ");
            int tmsz=input.nextInt();
            Manager emp= new Manager(name,id,sal,tmsz);
            s.displayEmp();
            emp.display();
        }else if (role.equalsIgnoreCase("Developer")){
            System.out.print("enter programming language: ");
            String pl=input.next();
            Developer emp = new Developer(name,id,sal,pl);
            s.displayEmp();
            emp.display();
        }
        else if (role.equalsIgnoreCase("Intern")){
            Intern emp = new Intern(name,id,sal);
            s.displayEmp();
            emp.display();
        }


    }

}


