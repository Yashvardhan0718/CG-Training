class Books {
   public int ISBN;       
   protected String title;
   private String author;
   public Books(int ISBN, String title, String author) {
       this.ISBN = ISBN;
       this.title = title;
       this.author = author;
   }
   public String getAuthor() {
       return author;
   }
   public void setAuthor(String newAuthor) {
       this.author = newAuthor;
   }
}
class EBook extends Books{
   public EBook(int ISBN, String title, String author) {
       super(ISBN, title, author);
   }


   public void displayBookDetails() {
       System.out.println("EBook ISBN: " + ISBN);
       System.out.println("EBook Title: " + title);
       // System.out.println("EBook Author: " + author);
       System.out.println("EBook Author: " + getAuthor());
   }
}
class S {
   public static void main(String[] args) {
       EBook myEBook = new EBook(123456, "the life", "Chris Evans");
       myEBook.displayBookDetails();
       System.out.println("Author (via getter): " + myEBook.getAuthor());
       myEBook.setAuthor("Johnny Blaze");
       System.out.println("Updated Author: " + myEBook.getAuthor());
   }
}
