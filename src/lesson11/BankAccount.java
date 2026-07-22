package lesson11;

public class BankAccount {

    private String accountNumber;
    private double balance;


    public BankAccount(String accountNumber, double balance) {
        if (balance < 0) this.balance = 0;
        else this.balance = balance;

        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.err.println("Insufficient funds");
        } else {
            this.balance -= amount;
        }
    }

}
