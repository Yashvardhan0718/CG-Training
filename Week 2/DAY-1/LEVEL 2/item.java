class Item {
   int itemCode;
   String itemName;
   double price;
   int quantity;
   double totalCost;


   Item(int itemCode, String itemName, double price, int quantity) {
       this.itemCode = itemCode;
       this.itemName = itemName;
       this.price = price;
       this.quantity = quantity;
       calculate();
   }
   void calculate() {
       totalCost = price * quantity;
   }
   void display() {
       System.out.println("Item Name: " + itemName);
       System.out.println("Item Code: " + itemCode);
       System.out.println("Price: " + price);
       System.out.println("Quantity: " + quantity);
       System.out.println("Total Cost: " + totalCost);
   }
}
class Details {
   public static void main(String[] args) {
       Item i = new Item(11, "Pen", 7, 2);
       i.display();
   }
}
