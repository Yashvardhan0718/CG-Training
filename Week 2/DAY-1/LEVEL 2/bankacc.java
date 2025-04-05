class BankAccount {
   String accountHolder;
   int accountNumber;
   double balance;


   BankAccount(String accountHolder, int accountNumber, double balance) {
       this.accountHolder = accountHolder;
       this.accountNumber = accountNumber;
       this.balance = balance;
   }
   void deposit(double amount) {
       if (amount > 0) {
           balance += amount;
           System.out.println("Deposited: " + amount);
       } else {
           System.out.println("Invalid deposit amount.");
       }
   }
   void withdraw(double amount) {
       if (amount > 0 && amount <= balance) {
           balance -= amount;
           System.out.println("Withdrawn: " + amount);
       } else {
           System.out.println("Insufficient balance or invalid amount.");
       }
   }


   // Method to display balance
   void displayBalance() {
       System.out.println("Account Holder: " + accountHolder);
       System.out.println("Account Number: " + accountNumber);
       System.out.println("Current Balance: " + balance);
   }
}
public class atm {
   public static void main(String[] args) {
       BankAccount account = new BankAccount("Aromal", 123456789, 1000.00);
       account.deposit(500.00);
       account.withdraw(200.00);
       account.displayBalance();
   }
}
