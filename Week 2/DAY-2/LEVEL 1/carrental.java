class CarRental {
   private String customerName;
   private String carModel;
   private int rentalDays;
   private double price;


   CarRental(String customerName,String carModel,int rentalDays){
       this.customerName=customerName;
       this.carModel=carModel;
       this.rentalDays=rentalDays;
       pricerental();
 ;  }
   void pricerental(){
       price = rentalDays*5000;
   }
  void travelDetails(){
   System.out.println("Customer Name : "+customerName);
      System.out.println("Car model : "+carModel);
      System.out.println("Rental days : "+rentalDays);
      System.out.println(" Total rent to be paid : "+price);
}}
class Rental{
   public static void main(String[] args){
       CarRental c= new CarRental("Aromal","RR Phantom",10);
       c.travelDetails();
   }
}
