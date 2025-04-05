class Pallindrome {
   String text;
   Pallindrome(String text){
       this.text = text;
       palli();
   }void palli(){
       String rev ="";
       for(int i=(text.length()-1);i>=0;i--) {
           rev+=text.charAt(i);
       }
       if (text.toLowerCase().equals(rev.toLowerCase())){
           System.out.println(text+" is a PALLINDROME");
       }else{
           System.out.println(text+" is not a PALLINDROME ");
       }}}
       class PAtext{
   public static  void main( String[] args){
       Pallindrome pa = new Pallindrome("AROMAL");
       pa.palli();  }
}
