class Book1 {
   private String title;
   private String author;
   private double price;
   private boolean isAvailable;


    Book1(String title, String author, double price) {
       this.title = title;
       this.author = author;
       this.price = price;
       this.isAvailable = true;
   }
   void displayDetails() {
       System.out.println("Title: " + title);
       System.out.println("Author: " + author);
       System.out.println("Price: " + price);
       System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
   }
    void borrowBook() {
       if (isAvailable) {
           isAvailable = false;
           System.out.println("You have successfully borrowed: " + title);
       } else {
           System.out.println("Sorry, the book '" + title + "' is currently not available.");
       }
   }
}


class Main1 {
   public static void main(String[] args) {
       Book1 book1 = new Book1("The F**king life", "F. Scot", 200);
       book1.displayDetails();
       book1.borrowBook();
       book1.borrowBook();
       book1.displayDetails();
   }
}
