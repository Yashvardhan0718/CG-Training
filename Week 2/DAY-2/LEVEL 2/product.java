import java.util.Scanner;
class Product1 {
   private String productName;
  private double price;
  private int  totalProducts;
  private double finalPrice;
  Product1( String productName,double price,int  totalProducts){
   this.productName=productName;
   this.price=price;
   this.totalProducts=totalProducts;
  }
  void  displayProductDetails(){
      System.out.println("===Product Order===");
      System.out.println("Product : "+productName);
      System.out.println("Quantity :"+totalProducts);
      System.out.println("Price per Product: "+price);
  }
  void displayTotalProducts(){
      finalPrice=price*totalProducts;
      System.out.println("===Amount===");
      System.out.println("Total amount: "+finalPrice);
  }
}
class Main{
   public static void main(String[] args){
       Scanner num = new Scanner(System.in);
       System.out.print("Enter Product name : ");
       String s=num.next();
       System.out.print("Enter Product price : ");
       double a=num.nextDouble();
       System.out.print("Enter Product quantity : ");
       int c=num.nextInt();
       Product1 p = new Product1(s,a,c);
       p.displayProductDetails();
       p.displayTotalProducts();
   }
}
