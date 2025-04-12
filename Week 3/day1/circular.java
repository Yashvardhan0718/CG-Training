import java.util.Scanner;


class Task {
   int taskId;
   String name;
   int priority;
   String dueDate;
   Task next;


   public Task(int taskId, String name, int priority, String dueDate) {
       this.taskId = taskId;
       this.name = name;
       this.priority = priority;
       this.dueDate = dueDate;
       this.next = null;
   }
}


class TaskScheduler {
   Task head = null;
   Task tail = null;
   Task current = null;


   public void addAtBeginning(int id, String name, int priority, String dueDate) {
       Task newTask = new Task(id, name, priority, dueDate);
       if (head == null) {
           head = tail = newTask;
           newTask.next = head;
       } else {
           newTask.next = head;
           head = newTask;
           tail.next = head;
       }
   }


   public void addAtEnd(int id, String name, int priority, String dueDate) {
       Task newTask = new Task(id, name, priority, dueDate);
       if (head == null) {
           head = tail = newTask;
           newTask.next = head;
       } else {
           tail.next = newTask;
           tail = newTask;
           tail.next = head;
       }
   }


   public void addAtPosition(int pos, int id, String name, int priority, String dueDate) {
       if (pos == 0) {
           addAtBeginning(id, name, priority, dueDate);
           return;
       }
       Task newTask = new Task(id, name, priority, dueDate);
       Task temp = head;
       for (int i = 0; i < pos - 1 && temp.next != head; i++) {
           temp = temp.next;
       }
       newTask.next = temp.next;
       temp.next = newTask;
       if (temp == tail) {
           tail = newTask;
       }
   }


   public void removeById(int id) {
       if (head == null) {
           System.out.println("Task list is empty.");
           return;
       }


       Task temp = head, prev = tail;
       do {
           if (temp.taskId == id) {
               if (temp == head) {
                   head = head.next;
                   tail.next = head;
                   if (temp == tail) {
                       head = tail = null;
                   }
               } else {
                   prev.next = temp.next;
                   if (temp == tail) {
                       tail = prev;
                   }
               }
               System.out.println("Task removed.");
               return;
           }
           prev = temp;
           temp = temp.next;
       } while (temp != head);


       System.out.println("Task ID not found.");
   }


   public void viewCurrentTask() {
       if (current == null) {
           current = head;
       }
       if (current == null) {
           System.out.println("No tasks available.");
       } else {
           System.out.println("Current Task: ID=" + current.taskId + ", Name=" + current.name + ", Priority=" + current.priority + ", Due=" + current.dueDate);
           current = current.next;
       }
   }


   public void displayAllTasks() {
       if (head == null) {
           System.out.println("No tasks to display.");
           return;
       }
       Task temp = head;
       System.out.println("Task List:");
       do {
           System.out.println("ID=" + temp.taskId + ", Name=" + temp.name + ", Priority=" + temp.priority + ", Due=" + temp.dueDate);
           temp = temp.next;
       } while (temp != head);
   }


   public void searchByPriority(int priority) {
       if (head == null) {
           System.out.println("Task list is empty.");
           return;
       }
       Task temp = head;
       boolean found = false;
       do {
           if (temp.priority == priority) {
               System.out.println("Task Found: ID=" + temp.taskId + ", Name=" + temp.name + ", Due=" + temp.dueDate);
               found = true;
           }
           temp = temp.next;
       } while (temp != head);
       if (!found) {
           System.out.println("No tasks found with priority " + priority);
       }
   }
}


public class CircularTaskScheduler {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       TaskScheduler scheduler = new TaskScheduler();
       int choice;


       do {
           System.out.println("\n--- Task Scheduler Menu ---");
           System.out.println("1. Add Task at Beginning");
           System.out.println("2. Add Task at End");
           System.out.println("3. Add Task at Position");
           System.out.println("4. Remove Task by ID");
           System.out.println("5. View Current Task and Move Next");
           System.out.println("6. Display All Tasks");
           System.out.println("7. Search Task by Priority");
           System.out.println("0. Exit");
           System.out.print("Enter your choice: ");
           choice = scanner.nextInt();


           int id, priority, pos;
           String name, dueDate;


           switch (choice) {
               case 1:
                   System.out.print("Enter ID, Name, Priority, DueDate: ");
                   id = scanner.nextInt();
                   name = scanner.next();
                   priority = scanner.nextInt();
                   dueDate = scanner.next();
                   scheduler.addAtBeginning(id, name, priority, dueDate);
                   break;
               case 2:
                   System.out.print("Enter ID, Name, Priority, DueDate: ");
                   id = scanner.nextInt();
                   name = scanner.next();
                   priority = scanner.nextInt();
                   dueDate = scanner.next();
                   scheduler.addAtEnd(id, name, priority, dueDate);
                   break;
               case 3:
                   System.out.print("Enter Position: ");
                   pos = scanner.nextInt();
                   System.out.print("Enter ID, Name, Priority, DueDate: ");
                   id = scanner.nextInt();
                   name = scanner.next();
                   priority = scanner.nextInt();
                   dueDate = scanner.next();
                   scheduler.addAtPosition(pos, id, name, priority, dueDate);
                   break;
               case 4:
                   System.out.print("Enter Task ID to remove: ");
                   id = scanner.nextInt();
                   scheduler.removeById(id);
                   break;
               case 5:
                   scheduler.viewCurrentTask();
                   break;
               case 6:
                   scheduler.displayAllTasks();
                   break;
               case 7:
                   System.out.print("Enter Priority to search: ");
                   priority = scanner.nextInt();
                   scheduler.searchByPriority(priority);
                   break;
               case 0:
                   System.out.println("Exiting Task Scheduler...");
                   break;
               default:
                   System.out.println("Invalid choice.");
           }


       } while (choice != 0);


       scanner.close();
   }
}
