interface Loanable {
   void applyForLoan();
   boolean calculateLoanEligibility();
} abstract class BankAccount {
   private String accountNumber;
   private String holderName;
   private double balance;


   public BankAccount(String accountNumber, String holderName, double balance) {
       this.accountNumber = accountNumber;
       this.holderName = holderName;
       this.balance = balance;
   }


   public void deposit(double amount) {
       if (amount > 0) {
           balance += amount;
           System.out.println(holderName + " deposited: " + amount);
       }
   }


   public void withdraw(double amount) {
       if (amount > 0 && amount <= balance) {
           balance -= amount;
           System.out.println(holderName + " withdrew: " + amount);
       } else {
           System.out.println("Insufficient balance or invalid amount.");
       }
   }


   public double getBalance() {
       return balance;
   }


   public String getAccountNumber() {
       return accountNumber;
   }


   public String getHolderName() {
       return holderName;
   }


   // Abstract method
   public abstract double calculateInterest();
}
class SavingsAccount extends BankAccount implements Loanable {
   private static final double INTEREST_RATE = 0.04;


   public SavingsAccount(String accNo, String name, double balance) {
       super(accNo, name, balance);
   }


   @Override
   public double calculateInterest() {
       return getBalance() * INTEREST_RATE;
   }


   @Override
   public void applyForLoan() {
       System.out.println(getHolderName() + " applied for a savings loan.");
   }


   @Override
   public boolean calculateLoanEligibility() {
       return getBalance() >= 1000;
   }
}
class CurrentAccount extends BankAccount implements Loanable {
   private static final double INTEREST_RATE = 0.02;


   public CurrentAccount(String accNo, String name, double balance) {
       super(accNo, name, balance);
   }


   @Override
   public double calculateInterest() {
       return getBalance() * INTEREST_RATE;
   }


   @Override
   public void applyForLoan() {
       System.out.println(getHolderName() + " applied for a business loan.");
   }


   @Override
   public boolean calculateLoanEligibility() {
       return getBalance() >= 5000;
   }
}
class BankTest {
   public static void main(String[] args) {
       BankAccount savings = new SavingsAccount("aro123", "A", 2000);
       BankAccount current = new CurrentAccount("CA456", "B", 7000);


       savings.deposit(500);
       current.withdraw(1000);


       System.out.println(savings.getHolderName() + " interest: " + savings.calculateInterest());
       System.out.println(current.getHolderName() + " interest: " + current.calculateInterest());


       Loanable l1 = (Loanable) savings;
       Loanable l2 = (Loanable) current;


       l1.applyForLoan();
       System.out.println("Savings loan eligible: " + l1.calculateLoanEligibility());


       l2.applyForLoan();
       System.out.println("Current loan eligible: " + l2.calculateLoanEligibility());
   }
}
