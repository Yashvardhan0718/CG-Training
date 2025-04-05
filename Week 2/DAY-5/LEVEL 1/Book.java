import java.util.*;
class Book {
    String Title;
    int publicationYear;
    Book( String Title, int publicationYear){
        this.Title=Title;
        this.publicationYear=publicationYear;
    }
}
class Author extends Book{
    String name;
    double bio;
    Author(String Title,int publicationYear,String name, double bio){
        super(Title,publicationYear);
        this.name=name;
        this.bio=bio;
    }
    void displayInfo(){
        System.out.println("Title : "+Title);
        System.out.println("Year of pub: "+publicationYear);
        System.out.println("Author name : "+name);
        System.out.println("DOB: "+bio);
    }
}
class test{
    public static void main (String[] args){
        Scanner input=new Scanner(System.in);
        String t = input.next();
        int py = input.nextInt();
        String n = input.next();
        double b =input.nextDouble();
        Author s =new Author(t,py,n,b);
        s.displayInfo();
    }
}
