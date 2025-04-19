import java.util.*;
import java.util.stream.*;

class PolicyHolder {
    String holderId;
    String name;
    int age;
    String policyType;
    double premiumAmount;

    public PolicyHolder(String holderId, String name, int age, String policyType, double premiumAmount) {
        this.holderId = holderId;
        this.name = name;
        this.age = age;
        this.policyType = policyType;
        this.premiumAmount = premiumAmount;
    }
}

class RiskAssessment {
    String holderId;
    String name;
    double riskScore;

    public RiskAssessment(String holderId, String name, double riskScore) {
        this.holderId = holderId;
        this.name = name;
        this.riskScore = riskScore;
    }

    public String toString() {
        return holderId + " - " + name + " - Risk Score: " + riskScore;
    }
}

public class RiskAssessmentAnalysis {
    public static void main(String[] args) {
        List<PolicyHolder> holders = Arrays.asList(
            new PolicyHolder("H001", "Alice", 65, "Life", 400.0),
            new PolicyHolder("H002", "Bob", 72, "Health", 500.0),
            new PolicyHolder("H003", "Charlie", 70, "Life", 600.0),
            new PolicyHolder("H004", "Diana", 61, "Life", 250.0),
            new PolicyHolder("H005", "Ethan", 59, "Life", 500.0),
            new PolicyHolder("H006", "Fiona", 75, "Life", 1000.0)
        );

        List<RiskAssessment> assessments = holders.stream()
            .filter(h -> h.policyType.equals("Life") && h.age > 60)
            .map(h -> new RiskAssessment(h.holderId, h.name, h.premiumAmount / h.age))
            .sorted((a, b) -> Double.compare(b.riskScore, a.riskScore))
            .collect(Collectors.toList());

        Map<String, List<RiskAssessment>> categorized = assessments.stream()
            .collect(Collectors.groupingBy(a -> a.riskScore > 0.5 ? "High Risk" : "Low Risk"));

        categorized.forEach((category, list) -> {
            System.out.println(category + ":");
            list.forEach(System.out::println);
        });
    }
}
