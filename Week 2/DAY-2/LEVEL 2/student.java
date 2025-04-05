class Student1 {
   public int rollNumber;
   protected String name;
   private double CGPA;


   public Student1(int rollNumber, String name, double CGPA) {
       this.rollNumber = rollNumber;
       this.name = name;
       this.CGPA = CGPA;
   }


   public double getCGPA() {
       return CGPA;
   }


   public void setCGPA(double newCGPA) {
       if (newCGPA >= 0.0 && newCGPA <= 10.0) { // Validating CGPA range
           this.CGPA = newCGPA;
       } else {
           System.out.println("Invalid CGPA! It must be between 0.0 and 10.0");
       }
   }
   public void displayStudentDetails() {
       System.out.println("Roll Number: " + rollNumber);
       System.out.println("Name: " + name);
       System.out.println("CGPA: " + CGPA);
   }
}
class PostgraduateStudent extends Student1 {
   private String researchTopic;


   public PostgraduateStudent(int rollNumber, String name, double CGPA, String researchTopic) {
       super(rollNumber, name, CGPA);
       this.researchTopic = researchTopic;
   }
   public void displayPGStudentDetails() {
       System.out.println("\n--- Postgraduate Student Details ---");
       System.out.println("Roll Number: " + rollNumber);
       System.out.println("Name: " + name);
       System.out.println("Research Topic: " + researchTopic);
   }
}


class UniversityManagement {
   public static void main(String[] args) {
       Student1 student1 = new Student1(101, "Alice", 8.7);
       student1.displayStudentDetails();
       student1.setCGPA(9.2);
       System.out.println("Updated CGPA: " + student1.getCGPA());
       PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Bob", 9.5, "Machine Learning");
       pgStudent.displayPGStudentDetails();
   }
}
