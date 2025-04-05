class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayCommonInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        displayCommonInfo();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        displayCommonInfo();
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}
class FixedDepositAccount extends BankAccount {
    int maturityPeriod;

    FixedDepositAccount(String accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }

    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        displayCommonInfo();
        System.out.println("Maturity Period: " + maturityPeriod + " months");
    }
}
 class BankSystem {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA123", 5000.0, 3.5);
        CheckingAccount checking = new CheckingAccount("CA456", 2500.0, 1000.0);
        FixedDepositAccount fixed = new FixedDepositAccount("FD789", 10000.0, 12);

        System.out.println("=== Account Summaries ===");
        savings.displayAccountType();
        System.out.println("------------------------");
        checking.displayAccountType();
        System.out.println("------------------------");
        fixed.displayAccountType();
    }
}

