package week4.day2.level1;

import java.time.LocalDate;
import java.util.*;

public class InsurancePolicySystem {

    static class Policy implements Comparable<Policy> {
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

        public String getCoverageType() {
            return coverageType;
        }

        public LocalDate getExpiryDate() {
            return expiryDate;
        }

        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Policy policy = (Policy) obj;
            return policyNumber.equals(policy.policyNumber);
        }

        public int hashCode() {
            return policyNumber.hashCode();
        }

        public int compareTo(Policy other) {
            return this.expiryDate.compareTo(other.expiryDate);
        }

        public String toString() {
            return policyNumber + " | " + policyholderName + " | " + coverageType + " | ₹" + premiumAmount + " | " + expiryDate;
        }
    }

    static class PolicyManager {
        private Set<Policy> hashSet = new HashSet<>();
        private Set<Policy> linkedHashSet = new LinkedHashSet<>();
        private Set<Policy> treeSet = new TreeSet<>();

        public void addPolicy(Policy policy) {
            hashSet.add(policy);
            linkedHashSet.add(policy);
            treeSet.add(policy);
        }

        public Set<Policy> getAllUniquePolicies() {
            return hashSet;
        }

        public Set<Policy> getPoliciesByCoverageType(String coverageType) {
            Set<Policy> result = new HashSet<>();
            for (Policy policy : hashSet) {
                if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
                    result.add(policy);
                }
            }
            return result;
        }

        public Set<Policy> getExpiringPoliciesWithin(int days) {
            Set<Policy> result = new HashSet<>();
            LocalDate today = LocalDate.now();
            LocalDate cutoff = today.plusDays(days);
            for (Policy policy : treeSet) {
                if (!policy.getExpiryDate().isAfter(cutoff)) {
                    result.add(policy);
                }
            }
            return result;
        }

        public Set<String> getDuplicatePolicies() {
            Set<String> seen = new HashSet<>();
            Set<String> duplicates = new HashSet<>();
            for (Policy policy : hashSet) {
                if (!seen.add(policy.getPolicyNumber())) {
                    duplicates.add(policy.getPolicyNumber());
                }
            }
            return duplicates;
        }
    }

    static class PerformanceTest {
        public static void runPerformanceTest(Set<Policy> set, List<Policy> sampleData) {
            long startAdd = System.nanoTime();
            for (Policy p : sampleData) {
                set.add(p);
            }
            long endAdd = System.nanoTime();

            long startSearch = System.nanoTime();
            set.contains(sampleData.get(sampleData.size() / 2));
            long endSearch = System.nanoTime();

            long startRemove = System.nanoTime();
            set.remove(sampleData.get(0));
            long endRemove = System.nanoTime();

            System.out.println(set.getClass().getSimpleName() + " => Add: " + (endAdd - startAdd) + "ns | Search: " + (endSearch - startSearch) + "ns | Remove: " + (endRemove - startRemove) + "ns");
        }
    }

    public static void main(String[] args) {
        PolicyManager manager = new PolicyManager();

        manager.addPolicy(new Policy("P001", "Alice", LocalDate.now().plusDays(5), "Health", 1500));
        manager.addPolicy(new Policy("P002", "Bob", LocalDate.now().plusDays(40), "Auto", 2200));
        manager.addPolicy(new Policy("P003", "Charlie", LocalDate.now().plusDays(20), "Home", 1800));
        manager.addPolicy(new Policy("P004", "Diana", LocalDate.now().plusDays(15), "Health", 1700));
        manager.addPolicy(new Policy("P005", "Eve", LocalDate.now().plusDays(29), "Auto", 2100));

        System.out.println("All Unique Policies:");
        for (Policy p : manager.getAllUniquePolicies()) {
            System.out.println(p);
        }

        System.out.println("\nExpiring Within 30 Days:");
        for (Policy p : manager.getExpiringPoliciesWithin(30)) {
            System.out.println(p);
        }

        System.out.println("\nPolicies with Coverage Type 'Health':");
        for (Policy p : manager.getPoliciesByCoverageType("Health")) {
            System.out.println(p);
        }

        System.out.println("\nDuplicate Policy Numbers:");
        System.out.println(manager.getDuplicatePolicies());

        List<Policy> testData = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            testData.add(new Policy("PX" + i, "User" + i, LocalDate.now().plusDays(i % 365), "Health", 1000 + i));
        }

        PerformanceTest.runPerformanceTest(new HashSet<>(), testData);
        PerformanceTest.runPerformanceTest(new LinkedHashSet<>(), testData);
        PerformanceTest.runPerformanceTest(new TreeSet<>(), testData);
    }
}

