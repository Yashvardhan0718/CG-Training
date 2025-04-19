package week4.day1.level2;

import java.util.ArrayList;
import java.util.List;

abstract class CourseType {
    private String evaluationMethod;

    public CourseType(String evaluationMethod) {
        this.evaluationMethod = evaluationMethod;
    }

    public String getEvaluationMethod() {
        return evaluationMethod;
    }
}

class ExamCourse extends CourseType {
    public ExamCourse() {
        super("Exam-Based");
    }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse() {
        super("Assignment-Based");
    }
}

class ResearchCourse extends CourseType {
    public ResearchCourse() {
        super("Research-Based");
    }
}

class Course<T extends CourseType> {
    private String courseName;
    private String departmentName;
    private T courseType;

    public Course(String courseName, String departmentName, T courseType) {
        this.courseName = courseName;
        this.departmentName = departmentName;
        this.courseType = courseType;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public T getCourseType() {
        return courseType;
    }
}

class CourseDisplay {
    public static void showCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println(course.getEvaluationMethod());
        }
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        List<Course<? extends CourseType>> courseList = new ArrayList<>();

        Course<ExamCourse> math = new Course<>("Engineering Mathematics", "Engineering", new ExamCourse());
        Course<AssignmentCourse> history = new Course<>("World History", "Arts", new AssignmentCourse());
        Course<ResearchCourse> ai = new Course<>("AI Research", "Computer Science", new ResearchCourse());

        courseList.add(math);
        courseList.add(history);
        courseList.add(ai);

        for (Course<? extends CourseType> course : courseList) {
            System.out.println(course.getCourseName() + " - " + course.getDepartmentName() + " - " + course.getCourseType().getEvaluationMethod());
        }
    }
}

