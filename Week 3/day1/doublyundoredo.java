import java.util.Scanner;


class TextState {
   String content;
   TextState prev;
   TextState next;


   public TextState(String content) {
       this.content = content;
       this.prev = null;
       this.next = null;
   }
}


class TextEditor {
   private TextState head;
   private TextState current;
   private int size = 0;
   private final int MAX_HISTORY = 10;


   public void type(String newText) {
       TextState newState = new TextState(newText);


       if (head == null) {
           head = newState;
           current = head;
       } else {
           current.next = newState;
           newState.prev = current;
           current = newState;


           // Clean up forward history
           newState.next = null;
       }


       size++;


       // If size exceeds history, remove oldest (head)
       if (size > MAX_HISTORY) {
           head = head.next;
           head.prev = null;
           size--;
       }
   }


   public void undo() {
       if (current != null && current.prev != null) {
           current = current.prev;
       } else {
           System.out.println("Nothing to undo.");
       }
   }


   public void redo() {
       if (current != null && current.next != null) {
           current = current.next;
       } else {
           System.out.println("Nothing to redo.");
       }
   }


   public void displayCurrentState() {
       if (current != null) {
           System.out.println("Current Text: " + current.content);
       } else {
           System.out.println("Editor is empty.");
       }
   }
}


public class UndoRedoEditor {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       TextEditor editor = new TextEditor();


       int choice;
       do {
           System.out.println("\n--- Text Editor Menu ---");
           System.out.println("1. Type Text");
           System.out.println("2. Undo");
           System.out.println("3. Redo");
           System.out.println("4. Display Current Text");
           System.out.println("0. Exit");
           System.out.print("Choose an option: ");
           choice = scanner.nextInt();
           scanner.nextLine(); // Consume newline


           switch (choice) {
               case 1:
                   System.out.print("Enter new text: ");
                   String text = scanner.nextLine();
                   editor.type(text);
                   break;
               case 2:
                   editor.undo();
                   break;
               case 3:
                   editor.redo();
                   break;
               case 4:
                   editor.displayCurrentState();
                   break;
               case 0:
                   System.out.println("Exiting Editor...");
                   break;
               default:
                   System.out.println("Invalid choice!");
           }
       } while (choice != 0);


       scanner.close();
   }
}
