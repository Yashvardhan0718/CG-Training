class MobilePhones {
   private String brand ;
   private String model;
   private double Price;
   MobilePhones(String brand,String model, double Price){
       this.brand=brand;
       this.model=model;
       this.Price=Price;
   }
   void display(){
       System.out.println("Brand: " + brand);
       System.out.println("Model: " + model);
       System.out.println("Price: $" + Price);
   }
}
class phnDetails{
   public static void main(String[] args){
       MobilePhones ph = new MobilePhones("Nothing","cmf", 20000);
       ph.display();
   }
}
