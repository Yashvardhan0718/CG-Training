import java.util.*;
class main{
   public static String buff(String[] str)
   {
       StringBuffer res=new StringBuffer();
       for(String s:str){
           res.append(s);
       }
       return res.toString();


   }
   public static void main(String[] args){
       String[] a={"snake"," ","and"," ","raiden"};
       System.out.println("Buffered: "+buff(a)+" are Friends");
   }
}
