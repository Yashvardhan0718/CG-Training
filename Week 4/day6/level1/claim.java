import java.util.*;
import java.util.stream.*;

class Claim {
    String claimId;
    String policyNumber;
    double claimAmount;
    String claimDate;
    String status;

    public Claim(String claimId, String policyNumber, double claimAmount, String claimDate, String status) {
        this.claimId = claimId;
        this.policyNumber = policyNumber;
        this.claimAmount = claimAmount;
        this.claimDate = claimDate;
        this.status = status;
    }
}

class PolicyClaimStats {
    String policyNumber;
    double totalAmount;
    double averageAmount;

    public PolicyClaimStats(String policyNumber, double totalAmount, double averageAmount) {
        this.policyNumber = policyNumber;
        this.totalAmount = totalAmount;
        this.averageAmount = averageAmount;
    }

    public String toString() {
        return policyNumber + " - Total: $" + totalAmount + ", Avg: $" + averageAmount;
    }
}

public class ClaimsAnalysis {
    public static void main(String[] args) {
        List<Claim> claims = Arrays.asList(
            new Claim("C001", "P1001", 8000, "2024-01-01", "Approved"),
            new Claim("C002", "P1002", 4000, "2024-02-15", "Pending"),
            new Claim("C003", "P1001", 9000, "2024-03-01", "Approved"),
            new Claim("C004", "P1003", 3000, "2024-03-20", "Approved"),
            new Claim("C005", "P1002", 12000, "2024-04-05", "Approved"),
            new Claim("C006", "P1004", 15000, "2024-04-18", "Approved"),
            new Claim("C007", "P1004", 2000, "2024-04-25", "Rejected"),
            new Claim("C008", "P1001", 10000, "2024-05-01", "Approved"),
            new Claim("C009", "P1005", 7000, "2024-05-10", "Approved")
        );

        Map<String, List<Claim>> groupedClaims = claims.stream()
            .filter(c -> c.status.equals("Approved") && c.claimAmount > 5000)
            .collect(Collectors.groupingBy(c -> c.policyNumber));

        List<PolicyClaimStats> stats = groupedClaims.entrySet().stream()
            .map(e -> {
                double total = e.getValue().stream().mapToDouble(c -> c.claimAmount).sum();
                double average = e.getValue().stream().mapToDouble(c -> c.claimAmount).average().orElse(0);
                return new PolicyClaimStats(e.getKey(), total, average);
            })
            .sorted((a, b) -> Double.compare(b.totalAmount, a.totalAmount))
            .limit(3)
            .collect(Collectors.toList());

        stats.forEach(System.out::println);
    }
}
