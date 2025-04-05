interface Discountable {
    double calculateDiscount();
}
abstract class Product {
     int productId;
     String name;
     double price;

     Product(int productId, String name, double price) {
         this.productId = productId;
         this.name = name;
         this.price = price;
     }

     abstract double calculateDiscount();

     public double getPrice() {
         return price;
     }
     public void displayProduct() {
         System.out.println("Product ID: " + productId);
         System.out.println("Name : " + name);
         System.out.println("Price of product: " + price);
     }


 }
 class Electronics extends Product{
    double taxable = 0.09;
    double totalPrice;
    Electronics(int productId, String name, double price) {
        super(productId,name,price);
        this.taxable = taxable;
        this.totalPrice = calculateTax();
    }
     public double calculateTax() {
         return price+(getPrice()*taxable);}
     @Override
     public double calculateDiscount() {
         return getPrice() * 0.05;
     }
     @Override
     public void displayProduct(){
         System.out.println("ELECTRONICS");
         super.displayProduct();
         System.out.println("Total Amount: "+calculateTax());
         System.out.println("Discount price: "+calculateDiscount());
     }

 }
 class Clothing extends Product{
     double taxable = 0.08;
     double totalPrice;
     Clothing(int productId, String name, double price) {
         super(productId,name,price);
         this.taxable = taxable;
         this.totalPrice = calculateTax();
     }

     public double calculateTax() {
         return price+(getPrice()*taxable);}
     @Override
     public double calculateDiscount() {
         return getPrice() * 0.05;
     }
     @Override
     public void displayProduct(){
         System.out.println("CLOTHING");
         super.displayProduct();
         System.out.println("Total Amount: "+calculateTax());
         System.out.println("Discount price: "+calculateDiscount());
     }
 }
 class Groceries extends Product {
     double taxable = 0.12;
     double totalPrice;

     Groceries(int productId, String name, double price) {
         super( productId,name,price);
         this.taxable = taxable;
         this.totalPrice = calculateTax();
     }

     public double calculateTax() {
         return  price+(getPrice()*taxable);
     }
     @Override
     public double calculateDiscount() {
         return getPrice() * 0.05;
     }
     @Override
     public void displayProduct() {
         System.out.println("GROCERIES");
         super.displayProduct();
         System.out.println("Total Amount: " + calculateTax());
         System.out.println("Discount price: "+calculateDiscount());
     }
 }
class Product2{
    public static void main(String[] args){
        Groceries n = new Groceries(12,"carrot",35);
        n.displayProduct();
    }
}



