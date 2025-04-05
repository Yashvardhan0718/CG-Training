class BankAccount1 {
   public long accountNumber;
   protected String accountHolder;
   private long balance;          
   public BankAccount1(long accountNumber, String accountHolder, long balance) {
       this.accountNumber = accountNumber;
       this.accountHolder = accountHolder;
       this.balance = balance;
   }
   public long getBalance() {
       return balance;
   }
   public void setBalance(long newBalance) {
       this.balance = newBalance;
   }
}


class SavingsAccount extends BankAccount1 {
   public SavingsAccount(long accountNumber, String accountHolder, long balance) {
       super(accountNumber, accountHolder, balance);
   }
   public void displayAccDetails() {
       System.out.println("Account Number: " + accountNumber);
       System.out.println("Account Holder: " + accountHolder);
       System.out.println("Balance: $" + getBalance());
   }
}


class Main {
   public static void main(String[] args){
       SavingsAccount myAcc = new SavingsAccount(123456789L, "The Life", 45555555555L);
       myAcc.displayAccDetails();
       System.out.println("New Balance: $" + myAcc.getBalance());
       myAcc.setBalance(1000000000L);
       System.out.println("Updated Balance: $" + myAcc.getBalance());
   }
}
