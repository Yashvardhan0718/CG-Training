class Course {
 	private String courseName;
 	private Student[] enrolledStudents;
 	private int studentCount;

 	public Course(String courseName, int maxStudents) {
     	this.courseName = courseName;
     	this.enrolledStudents = new Student[maxStudents];
     	this.studentCount = 0;
 	}

 	public String getCourseName() {
     	return courseName;
 	}

 	public void enrollStudent(Student student) {
     	if (studentCount < enrolledStudents.length) {
             enrolledStudents[studentCount++] = student;
     	} else {
         	System.out.println("Course " + courseName + " is full.");
     	}
 	}

 	public void showEnrolledStudents() {
     	System.out.println("Students enrolled in " + courseName + ":");
     	for (int i = 0; i < studentCount; i++) {
         	System.out.println("  - " + enrolledStudents[i].getName());
     	}
 	}
 }

 class Student {
 	private String name;
 	private Course[] courses;
 	private int courseCount;

 	public Student(String name, int maxCourses) {
     	this.name = name;
     	this.courses = new Course[maxCourses];
     	this.courseCount = 0;
 	}

 	public String getName() {
     	return name;
 	}

 	public void enrollInCourse(Course course) {
     	if (courseCount < courses.length) {
         	courses[courseCount++] = course;
         	course.enrollStudent(this);  // mutual association
     	} else {
         	System.out.println("Student " + name + " can't enroll in more courses.");
     	}
 	}

 	public void showCourses() {
     	System.out.println("Courses enrolled by " + name + ":");
     	for (int i = 0; i < courseCount; i++) {
         	System.out.println("  - " + courses[i].getCourseName());
     	}
 	}
 }

 class School {
 	private String schoolName;
 	private Student[] students;
 	private int studentCount;

 	public School(String schoolName, int maxStudents) {
     	this.schoolName = schoolName;
     	this.students = new Student[maxStudents];
     	this.studentCount = 0;
 	}

 	public void addStudent(Student student) {
     	if (studentCount < students.length) {
         	students[studentCount++] = student;
     	} else {
    	     System.out.println("Cannot add more students to the school.");
     	}
 	}

 	public void showStudents() {
     	System.out.println("Students in " + schoolName + ":");
     	for (int i = 0; i < studentCount; i++) {
         	System.out.println("  - " + students[i].getName());
     	}
 	}
 }

 public class SchoolSystem {
 	public static void main(String[] args) {
     	School school = new School("Green Valley High", 5);

     	Student john = new Student("John", 3);
     	Student emma = new Student("Emma", 3);

     	Course math = new Course("Math", 5);
     	Course science = new Course("Science", 5);
     	Course history = new Course("History", 5);

     	school.addStudent(john);
     	school.addStudent(emma);

     	john.enrollInCourse(math);
     	john.enrollInCourse(science);

     	emma.enrollInCourse(science);
     	emma.enrollInCourse(history);

     	school.showStudents();

     	john.showCourses();
     	emma.showCourses();

     	math.showEnrolledStudents();
     	science.showEnrolledStudents();
     	history.showEnrolledStudents();
 	}
 }
