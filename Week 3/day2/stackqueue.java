import java.util.Stack;
class Myqueue{
   private Stack<Integer> stackIn;
   private Stack<Integer> stackOut;
   Myqueue(){
       stackIn=new Stack<>();
       stackOut=new Stack<>();
   }
   void enqueue(int x)
   {
       stackIn.push(x);
   }
   public int dequeue() {
       if (stackOut.isEmpty()) {
           transferIntoOut();
       }
       if (!stackOut.isEmpty()) {
           return stackOut.pop();
       } else {
           throw new RuntimeException("Queue is empty");
       }
   }
   public int peek(){
       if (stackOut.isEmpty()) {
           transferIntoOut();
       }
       if (!stackOut.isEmpty()) {
           return stackOut.peek();
       } else {
           throw new RuntimeException("Queue is empty");
       }


   }
   public void transferIntoOut(){
       while (!stackIn.isEmpty()){
           stackOut.push(stackIn.pop());
       }
   }
   public boolean isEmpty(){
       return stackIn.isEmpty() && stackOut.isEmpty();
   }
   public static void main(String[] args) {
       Myqueue queue = new Myqueue();
       queue.enqueue(10);
       queue.enqueue(20);
       queue.enqueue(30);


       System.out.println(queue.dequeue()); // Output: 10
       System.out.println(queue.peek());    // Output: 20
       System.out.println(queue.isEmpty()); // Output: false
   }


}
