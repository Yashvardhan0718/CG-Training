package week4.day2.level3;

import java.util.*;

public class bank {

    static class Bank {
        private Map<Integer, Double> accountMap = new HashMap<>();
        private Queue<String> withdrawalQueue = new LinkedList<>();

        public void createAccount(int accountNumber, double initialBalance) {
            accountMap.put(accountNumber, initialBalance);
        }

        public void requestWithdrawal(int accountNumber, double amount) {
            withdrawalQueue.add(accountNumber + "," + amount);
        }

        public void processWithdrawals() {
            while (!withdrawalQueue.isEmpty()) {
                String[] parts = withdrawalQueue.poll().split(",");
                int accountNumber = Integer.parseInt(parts[0]);
                double amount = Double.parseDouble(parts[1]);

                if (!accountMap.containsKey(accountNumber)) {
                    System.out.println("Account " + accountNumber + " not found.");
                    continue;
                }

                double currentBalance = accountMap.get(accountNumber);
                if (currentBalance >= amount) {
                    accountMap.put(accountNumber, currentBalance - amount);
                    System.out.println("Withdrawal of ₹" + amount + " from Account " + accountNumber + " successful.");
                } else {
                    System.out.println("Insufficient balance in Account " + accountNumber + ".");
                }
            }
        }

        public void displayAccountsSortedByBalance() {
            TreeMap<Double, List<Integer>> sortedByBalance = new TreeMap<>();

            for (Map.Entry<Integer, Double> entry : accountMap.entrySet()) {
                double balance = entry.getValue();
                int accountNumber = entry.getKey();
                sortedByBalance.computeIfAbsent(balance, k -> new ArrayList<>()).add(accountNumber);
            }

            System.out.println("Accounts Sorted by Balance:");
            for (Map.Entry<Double, List<Integer>> entry : sortedByBalance.entrySet()) {
                for (int acc : entry.getValue()) {
                    System.out.println("Account " + acc + ": ₹" + entry.getKey());
                }
            }
        }

        public void displayAllAccounts() {
            System.out.println("All Accounts (Unsorted):");
            for (Map.Entry<Integer, Double> entry : accountMap.entrySet()) {
                System.out.println("Account " + entry.getKey() + ": ₹" + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.createAccount(1001, 10000);
        bank.createAccount(1002, 7500);
        bank.createAccount(1003, 15000);

        bank.requestWithdrawal(1002, 2000);
        bank.requestWithdrawal(1001, 12000);
        bank.requestWithdrawal(1003, 5000);

        bank.processWithdrawals();

        System.out.println();
        bank.displayAllAccounts();

        System.out.println();
        bank.displayAccountsSortedByBalance();
    }
}
