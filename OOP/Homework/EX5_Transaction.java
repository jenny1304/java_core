package OOP.Homework;

public class EX5_Transaction {
    private String operation;
    private double amount;
    private double balance;

    public static final String DEPOSIT = "deposit";
    public static final String WITHDRAW = "withdraw";

    public EX5_Transaction(String operation, double amount, double balance) {
        this.operation = operation;
        this.amount = amount;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

}
