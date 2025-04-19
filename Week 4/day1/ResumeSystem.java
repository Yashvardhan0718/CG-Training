package week4.day1.level3;

import java.util.ArrayList;
import java.util.List;

abstract class JobRole {
    private String roleName;

    public JobRole(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }

    public abstract boolean evaluateResume(String resumeContent);
}

class SoftwareEngineer extends JobRole {
    public SoftwareEngineer() {
        super("Software Engineer");
    }

    public boolean evaluateResume(String resumeContent) {
        return resumeContent.contains("Java") || resumeContent.contains("Spring");
    }
}

class DataScientist extends JobRole {
    public DataScientist() {
        super("Data Scientist");
    }

    public boolean evaluateResume(String resumeContent) {
        return resumeContent.contains("Python") || resumeContent.contains("Machine Learning");
    }
}

class ProductManager extends JobRole {
    public ProductManager() {
        super("Product Manager");
    }

    public boolean evaluateResume(String resumeContent) {
        return resumeContent.contains("Agile") || resumeContent.contains("Roadmap");
    }
}

class Resume<T extends JobRole> {
    private String candidateName;
    private String resumeContent;
    private T jobRole;

    public Resume(String candidateName, String resumeContent, T jobRole) {
        this.candidateName = candidateName;
        this.resumeContent = resumeContent;
        this.jobRole = jobRole;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public String getResumeContent() {
        return resumeContent;
    }

    public T getJobRole() {
        return jobRole;
    }
}

class ResumeScreening {
    public static void screenResumes(List<? extends Resume<? extends JobRole>> resumes) {
        for (Resume<? extends JobRole> resume : resumes) {
            boolean isQualified = resume.getJobRole().evaluateResume(resume.getResumeContent());
            System.out.println(resume.getCandidateName() + " - " + resume.getJobRole().getRoleName() + ": " + (isQualified ? "Qualified" : "Not Qualified"));
        }
    }
}

public class ResumeSystem {
    public static void main(String[] args) {
        List<Resume<? extends JobRole>> applications = new ArrayList<>();

        Resume<SoftwareEngineer> devResume = new Resume<>("Alice", "Experienced in Java and Spring Boot", new SoftwareEngineer());
        Resume<DataScientist> dsResume = new Resume<>("Bob", "Skilled in Python and Deep Learning", new DataScientist());
        Resume<ProductManager> pmResume = new Resume<>("Charlie", "Managed Agile teams and product roadmaps", new ProductManager());

        applications.add(devResume);
        applications.add(dsResume);
        applications.add(pmResume);

        ResumeScreening.screenResumes(applications);
    }
}
