import java.util.*;
class main{
   public static String dupli(String str)
   {
       StringBuilder res=new StringBuilder();
       HashSet<Character> uni=new HashSet<>();
       for(char ch:str.toCharArray()){
           if(!uni.contains(ch)){
               uni.add(ch);
               res.append(ch);
           }
       }
       return res.toString();
   }
   public static void main(String[] args){
       Scanner scan=new  Scanner(System.in);
       String input= scan.next();
       System.out.println("Original String: "+input);
       System.out.println("After removing duplicates: "+dupli(input));
   }
}
