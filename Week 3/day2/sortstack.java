import java.util.Stack;
class Stacksort{
   public static void sortStack(Stack<Integer> stack){
       if(!stack.isEmpty()){
           int top=stack.pop();
           Stacksort.sortStack(stack);
           insertInSortedorder(stack,top);
       }
   }


private static void insertInSortedorder(Stack<Integer> stack,int num){


   if (stack.isEmpty() || num <= stack.peek()) {
       stack.push(num);
   } else {
       int top = stack.pop();
       insertInSortedorder(stack, num);
       stack.push(top);
   }
}


   public static void printStack(Stack<Integer> stack) {
       for (int i = stack.size() - 1; i >= 0; i--) {
           System.out.println(stack.get(i));
       }
   }


   public static void main(String[] args) {
       Stack<Integer> stack = new Stack<>();
       stack.push(30);
       stack.push(-5);
       stack.push(18);
       stack.push(14);
       stack.push(-3);


       System.out.println("Original Stack:");
       printStack(stack);


       sortStack(stack);


       System.out.println("\nSorted Stack:");
       printStack(stack);
   }
}
