import java.util.*;
import java.util.stream.*;

class Transaction {
    String transactionId;
    String policyNumber;
    double amount;
    String transactionDate;
    boolean isFraudulent;

    public Transaction(String transactionId, String policyNumber, double amount, String transactionDate, boolean isFraudulent) {
        this.transactionId = transactionId;
        this.policyNumber = policyNumber;
        this.amount = amount;
        this.transactionDate = transactionDate;
        this.isFraudulent = isFraudulent;
    }
}

class FraudAlert {
    String policyNumber;
    int fraudulentTransactionCount;
    double totalFraudAmount;

    public FraudAlert(String policyNumber, int fraudulentTransactionCount, double totalFraudAmount) {
        this.policyNumber = policyNumber;
        this.fraudulentTransactionCount = fraudulentTransactionCount;
        this.totalFraudAmount = totalFraudAmount;
    }

    public String toString() {
        return "Policy " + policyNumber + " - Fraudulent Transactions: " + fraudulentTransactionCount + ", Total Fraud Amount: $" + totalFraudAmount;
    }
}

public class FraudDetection {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
            new Transaction("T001", "P1001", 12000.0, "2024-01-01", true),
            new Transaction("T002", "P1001", 8000.0, "2024-01-10", false),
            new Transaction("T003", "P1002", 20000.0, "2024-02-05", true),
            new Transaction("T004", "P1002", 5000.0, "2024-02-20", true),
            new Transaction("T005", "P1003", 15000.0, "2024-03-15", true),
            new Transaction("T006", "P1001", 30000.0, "2024-03-25", true),
            new Transaction("T007", "P1003", 7000.0, "2024-04-10", true),
            new Transaction("T008", "P1004", 25000.0, "2024-04-20", true),
            new Transaction("T009", "P1004", 5000.0, "2024-04-30", false),
            new Transaction("T010", "P1005", 12000.0, "2024-05-05", true)
        );

        Map<String, List<Transaction>> groupedFraudulentTransactions = transactions.stream()
            .filter(t -> t.isFraudulent && t.amount > 10000)
            .collect(Collectors.groupingBy(t -> t.policyNumber));

        List<FraudAlert> alerts = groupedFraudulentTransactions.entrySet().stream()
            .map(e -> {
                int fraudulentCount = e.getValue().size();
                double totalFraudAmount = e.getValue().stream().mapToDouble(t -> t.amount).sum();
                return new FraudAlert(e.getKey(), fraudulentCount, totalFraudAmount);
            })
            .filter(alert -> alert.fraudulentTransactionCount > 5 || alert.totalFraudAmount > 50000)
            .collect(Collectors.toList());

        alerts.forEach(System.out::println);
    }
}
