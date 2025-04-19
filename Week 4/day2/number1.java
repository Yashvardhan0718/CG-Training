package week4.day2.level3;

import java.time.LocalDate;
import java.util.*;

public class number1 {

    static class Policy {
        private String policyNumber;
        private String policyholderName;
        private LocalDate expiryDate;
        private String coverageType;
        private double premiumAmount;

        public Policy(String policyNumber, String policyholderName, LocalDate expiryDate, String coverageType, double premiumAmount) {
            this.policyNumber = policyNumber;
            this.policyholderName = policyholderName;
            this.expiryDate = expiryDate;
            this.coverageType = coverageType;
            this.premiumAmount = premiumAmount;
        }

        public String getPolicyNumber() {
            return policyNumber;
        }

        public String getPolicyholderName() {
            return policyholderName;
        }

        public LocalDate getExpiryDate() {
            return expiryDate;
        }

        public String toString() {
            return policyNumber + " | " + policyholderName + " | " + coverageType + " | ₹" + premiumAmount + " | " + expiryDate;
        }
    }

    static class PolicySystem {
        private Map<String, Policy> hashMap = new HashMap<>();
        private Map<String, Policy> linkedHashMap = new LinkedHashMap<>();
        private TreeMap<LocalDate, List<Policy>> treeMap = new TreeMap<>();

        public void addPolicy(Policy policy) {
            hashMap.put(policy.getPolicyNumber(), policy);
            linkedHashMap.put(policy.getPolicyNumber(), policy);

            treeMap.computeIfAbsent(policy.getExpiryDate(), k -> new ArrayList<>()).add(policy);
        }

        public Policy getPolicyByNumber(String policyNumber) {
            return hashMap.get(policyNumber);
        }

        public List<Policy> getPoliciesExpiringInNextDays(int days) {
            List<Policy> result = new ArrayList<>();
            LocalDate today = LocalDate.now();
            LocalDate cutoff = today.plusDays(days);
            for (Map.Entry<LocalDate, List<Policy>> entry : treeMap.subMap(today, true, cutoff, true).entrySet()) {
                result.addAll(entry.getValue());
            }
            return result;
        }

        public List<Policy> getPoliciesByHolder(String holderName) {
            List<Policy> result = new ArrayList<>();
            for (Policy policy : hashMap.values()) {
                if (policy.getPolicyholderName().equalsIgnoreCase(holderName)) {
                    result.add(policy);
                }
            }
            return result;
        }

        public void removeExpiredPolicies() {
            LocalDate today = LocalDate.now();
            Iterator<Map.Entry<String, Policy>> iterator = hashMap.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, Policy> entry = iterator.next();
                if (entry.getValue().getExpiryDate().isBefore(today)) {
                    iterator.remove();
                    linkedHashMap.remove(entry.getKey());
                }
            }

            treeMap.headMap(today, false).clear();
        }

        public void displayAllPolicies() {
            for (Policy policy : linkedHashMap.values()) {
                System.out.println(policy);
            }
        }
    }

    public static void main(String[] args) {
        PolicySystem system = new PolicySystem();

        system.addPolicy(new Policy("P001", "Alice", LocalDate.now().plusDays(5), "Health", 1500));
        system.addPolicy(new Policy("P002", "Bob", LocalDate.now().plusDays(45), "Auto", 2200));
        system.addPolicy(new Policy("P003", "Alice", LocalDate.now().plusDays(25), "Home", 1800));
        system.addPolicy(new Policy("P004", "Charlie", LocalDate.now().minusDays(1), "Life", 2000));
        system.addPolicy(new Policy("P005", "David", LocalDate.now().plusDays(10), "Travel", 1300));

        System.out.println("Retrieve Policy by Number (P003):");
        System.out.println(system.getPolicyByNumber("P003"));

        System.out.println("\nPolicies Expiring in Next 30 Days:");
        for (Policy p : system.getPoliciesExpiringInNextDays(30)) {
            System.out.println(p);
        }

        System.out.println("\nPolicies for Policyholder Alice:");
        for (Policy p : system.getPoliciesByHolder("Alice")) {
            System.out.println(p);
        }

        System.out.println("\nRemoving Expired Policies...");
        system.removeExpiredPolicies();

        System.out.println("\nAll Active Policies:");
        system.displayAllPolicies();
    }
}

