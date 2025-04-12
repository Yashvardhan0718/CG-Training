public class ReverseStringUsingStringBuilder {


   public static String reverseString(String input) {
       StringBuilder sb = new StringBuilder(input);
       sb.reverse();
       return sb.toString();
   }


   public static void main(String[] args) {
       String inputString = "hel”;
       String reversedString = reverseString(inputString);
       System.out.println("Reversed String: " + reversedString);
   }
}
