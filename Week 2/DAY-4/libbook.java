
import java.util.*;
class Book{
   private String title;
   private String author;

   Book(String title, String author){
   	this.title = title;
   	this.author = author;
   }
   public String getTitle(){
   	return title;
   }
   public String getAuthor(){
   	return author;
   }
   @Override
   public String toString() {
   	return "\"" + title + "\" by " + author;
   }
}
class Library{
   private String libName;
   private List<Book> books;

   Library(String libName){
   	this.libName = libName;
   	this.books = new ArrayList<>();
   }
   public void addBook(Book book){
   	books.add(book);
   }
   public void displayLibdetails(){
   	for(Book i : books){
       	System.out.println(i);
   	}
   }
}
class Main{
   public static void main(String[] args) {
   	Book obj = new Book("Sacred Games","Nolan");
   	Book obj1 = new Book("Wimpy Kid", "SUdha Murthy");
   	Book obj2 = new Book("Naruto","kishimoto");


   	Library lib1 = new Library("SRM Lib");
   	Library lib2 = new Library("City Lib");
   	lib1.addBook(obj);
   	lib1.addBook(obj1);
   	lib2.addBook(obj2);
   	lib2.addBook(obj);

   	lib1.displayLibdetails();
   	lib2.displayLibdetails();
   }
}

