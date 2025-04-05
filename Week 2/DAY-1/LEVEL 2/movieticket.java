import java.util.Scanner;
class MovieTickets {
   private String movieName;
   private int seatNo;
   private double price=0;
   double finalprice = 202.46;
   int ppl;
   MovieTickets(String movieName, int seatNo){
       this.movieName=movieName;
       this.seatNo=seatNo;
   }void booktickets(int seatNo){
       if (this.seatNo >=1 && this.seatNo <=50){
           finalprice=(price+202.46);
       }else if( this.seatNo >=51){
           finalprice=(price+250.86);
       }else{
           System.out.println("invalid Seat No");
       }
   }void display(){
       System.out.println("Movie Name: "+movieName);
       System.out.println("Seat No :" +seatNo);
       System.out.println("Price :"+finalprice);
   }
}
class ticketDetail{
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.print("Enter Movie Name: ");
       String name=input.next();
       System.out.print("Enter seat no (1-100): ");
       int seatNo=input.nextInt();
       MovieTickets mov = new MovieTickets(name,seatNo);
       mov.display();
       mov.booktickets(seatNo);
   }
}
