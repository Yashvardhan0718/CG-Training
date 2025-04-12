import java.util.Scanner;


class StudentNode {
   int rollNumber;
   String name;
   int age;
   String grade;
   StudentNode next;


   public StudentNode(int rollNumber, String name, int age, String grade) {
       this.rollNumber = rollNumber;
       this.name = name;
       this.age = age;
       this.grade = grade;
       this.next = null;
   }
}


class StudentList {
   StudentNode head = null;


   public void addAtBeginning(int roll, String name, int age, String grade) {
       StudentNode newNode = new StudentNode(roll, name, age, grade);
       newNode.next = head;
       head = newNode;
   }


   public void addAtEnd(int roll, String name, int age, String grade) {
       StudentNode newNode = new StudentNode(roll, name, age, grade);
       if (head == null) {
           head = newNode;
           return;
       }
       StudentNode temp = head;
       while (temp.next != null) {
           temp = temp.next;
       }
       temp.next = newNode;
   }


   public void addAtPosition(int pos, int roll, String name, int age, String grade) {
       if (pos == 0) {
           addAtBeginning(roll, name, age, grade);
           return;
       }
       StudentNode newNode = new StudentNode(roll, name, age, grade);
       StudentNode temp = head;
       for (int i = 0; temp != null && i < pos - 1; i++) {
           temp = temp.next;
       }
       if (temp == null) {
           System.out.println("Position out of range");
           return;
       }
       newNode.next = temp.next;
       temp.next = newNode;
   }


   public void deleteByRollNumber(int roll) {
       if (head == null) {
           System.out.println("List is empty.");
           return;
       }
       if (head.rollNumber == roll) {
           head = head.next;
           System.out.println("Record deleted.");
           return;
       }
       StudentNode temp = head;
       while (temp.next != null && temp.next.rollNumber != roll) {
           temp = temp.next;
       }
       if (temp.next == null) {
           System.out.println("Roll Number not found.");
       } else {
           temp.next = temp.next.next;
           System.out.println("Record deleted.");
       }
   }


   public void searchByRollNumber(int roll) {
       StudentNode temp = head;
       while (temp != null) {
           if (temp.rollNumber == roll) {
               System.out.println("Student Found: " + temp.rollNumber + ", " + temp.name + ", " + temp.age + ", " + temp.grade);
               return;
           }
           temp = temp.next;
       }
       System.out.println("Student not found.");
   }


   public void updateGrade(int roll, String newGrade) {
       StudentNode temp = head;
       while (temp != null) {
           if (temp.rollNumber == roll) {
               temp.grade = newGrade;
               System.out.println("Grade updated.");
               return;
           }
           temp = temp.next;
       }
       System.out.println("Student not found.");
   }


   public void displayAll() {
       if (head == null) {
           System.out.println("No records to display.");
           return;
       }
       StudentNode temp = head;
       System.out.println("Student Records:");
       while (temp != null) {
           System.out.println("Roll: " + temp.rollNumber + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
           temp = temp.next;
       }
   }
}


public class StudentManagementSystem {
   public static void main(String[] args) {
       StudentList list = new StudentList();
       Scanner scanner = new Scanner(System.in);
       int choice;


       do {
           System.out.println("\n--- Student Record Menu ---");
           System.out.println("1. Add at Beginning");
           System.out.println("2. Add at End");
           System.out.println("3. Add at Position");
           System.out.println("4. Delete by Roll Number");
           System.out.println("5. Search by Roll Number");
           System.out.println("6. Update Grade by Roll Number");
           System.out.println("7. Display All Records");
           System.out.println("0. Exit");
           System.out.print("Enter your choice: ");
           choice = scanner.nextInt();


           int roll, age, pos;
           String name, grade;


           switch (choice) {
               case 1:
                   System.out.print("Enter Roll, Name, Age, Grade: ");
                   roll = scanner.nextInt();
                   name = scanner.next();
                   age = scanner.nextInt();
                   grade = scanner.next();
                   list.addAtBeginning(roll, name, age, grade);
                   break;
               case 2:
                   System.out.print("Enter Roll, Name, Age, Grade: ");
                   roll = scanner.nextInt();
                   name = scanner.next();
                   age = scanner.nextInt();
                   grade = scanner.next();
                   list.addAtEnd(roll, name, age, grade);
                   break;
               case 3:
                   System.out.print("Enter Position: ");
                   pos = scanner.nextInt();
                   System.out.print("Enter Roll, Name, Age, Grade: ");
                   roll = scanner.nextInt();
                   name = scanner.next();
                   age = scanner.nextInt();
                   grade = scanner.next();
                   list.addAtPosition(pos, roll, name, age, grade);
                   break;
               case 4:
                   System.out.print("Enter Roll Number to delete: ");
                   roll = scanner.nextInt();
                   list.deleteByRollNumber(roll);
                   break;
               case 5:
                   System.out.print("Enter Roll Number to search: ");
                   roll = scanner.nextInt();
                   list.searchByRollNumber(roll);
                   break;
               case 6:
                   System.out.print("Enter Roll Number and new Grade: ");
                   roll = scanner.nextInt();
                   grade = scanner.next();
                   list.updateGrade(roll, grade);
                   break;
               case 7:
                   list.displayAll();
                   break;
               case 0:
                   System.out.println("Exiting Program...");
                   break;
               default:
                   System.out.println("Invalid choice!");
           }


       } while (choice != 0);


       scanner.close();
   }
}
