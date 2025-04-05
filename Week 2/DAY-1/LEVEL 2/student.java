class Student {
   private String Name ;
   private String rollno;
   private double marks;
   private double grade;
   Student(String Name,String rollno, double marks){
       this.Name=Name;
       this.rollno=rollno;
       this.marks=marks;
       calculate();
   }
   void calculate(){
       grade = (marks/50)*100;
   }
   void display(){
       System.out.println("Name : " + Name);
       System.out.println("Rollno : " + rollno);
       System.out.println("Marks :" + marks);
       System.out.println("Grade :" + grade);
   }
}
class Details{
   public static void main(String[] args){
       Student ph = new Student("Nothing","RA2111", 50);
       ph.display();
   }
}
