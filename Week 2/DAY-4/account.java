import java.util.*;

 class Account {
 	private static int idCounter = 1000;
 	private int accountId;
 	private double balance;
 	private Bank bank;
 	private Customer customer;

 	public Account(Bank bank, Customer customer, double initialDeposit) {
     	this.accountId = idCounter++;
     	this.bank = bank;
     	this.customer = customer;
     	this.balance = initialDeposit;
 	}

 	public int getAccountId() {
     	return accountId;
 	}

 	public double getBalance() {
     	return balance;
 	}

 	public Bank getBank() {
     	return bank;
 	}

 	public Customer getCustomer() {
     	return customer;
 	}

 	public void deposit(double amount) {
     	balance += amount;
 	}

 	public void withdraw(double amount) {
     	if (amount <= balance) {
         	balance -= amount;
     	} else {
         	System.out.println("Insufficient balance for withdrawal.");
     	}
 	}
 }

 class Customer {
 	private String name;
 	private List<Account> accounts = new ArrayList<>();

 	public Customer(String name) {
     	this.name = name;
 	}

 	public void addAccount(Account account) {
     	accounts.add(account);
 	}

 	public void viewBalance() {
     	System.out.println("\nAccount balances for " + name + ":");
     	for (Account acc : accounts) {
         	System.out.println("  Account ID: " + acc.getAccountId() +
                            	", Balance: $" + acc.getBalance() +
                            	", Bank: " + acc.getBank().getBankName());
     	}
 	}

 	public String getName() {
     	return name;
 	}
 }

 class Bank {
 	private String bankName;
 	private List<Customer> customers = new ArrayList<>();

 	public Bank(String bankName) {
     	this.bankName = bankName;
 	}

 	public void openAccount(Customer customer, double initialDeposit) {
     	Account newAccount = new Account(this, customer, initialDeposit);
         customer.addAccount(newAccount);
     	if (!customers.contains(customer)) {
         	customers.add(customer);
     	}
     	System.out.println("Opened new account for " + customer.getName() + " with $" + initialDeposit);
 	}

 	public String getBankName() {
     	return bankName;
 	}
 }

 public class BankSystem {
 	public static void main(String[] args) {
     	Bank sbi = new Bank("SBI Bank");

     	Customer rahul = new Customer("Rahul");
     	Customer sneha = new Customer("Sneha");

     	sbi.openAccount(rahul, 10000);
     	sbi.openAccount(rahul, 2500);
     	sbi.openAccount(sneha, 8000);

     	rahul.viewBalance();
     	sneha.viewBalance();
 	}
 }