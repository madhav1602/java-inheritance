// Base Class: BankAccount
class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccountType() {
        System.out.println("General Bank Account");
    }
}

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }
}

// Subclass: CheckingAccount
class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }
}

// Subclass: FixedDepositAccount
class FixedDepositAccount extends BankAccount {
    private int lockInPeriod;

    public FixedDepositAccount(String accountNumber, double balance, int lockInPeriod) {
        super(accountNumber, balance);
        this.lockInPeriod = lockInPeriod;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }
}

// Main Class
public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA001", 5000, 4.5);
        CheckingAccount ca = new CheckingAccount("CA002", 10000, 2000);
        FixedDepositAccount fda = new FixedDepositAccount("FD003", 50000, 12);

        sa.displayAccountType();
        ca.displayAccountType();
        fda.displayAccountType();
    }
}
