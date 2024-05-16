package OOP.Homework;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class EX5_Account {
    private double balance;
    private ArrayList<EX5_Transaction> history;

    public ArrayList<EX5_Transaction> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<EX5_Transaction> history) {
        this.history = history;
    }

    public EX5_Account() {
        balance = 0;
        history = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    private void deposit(double amount) {
        if (amount > 0) {
            this.balance = this.balance + amount;
        } else {
            System.err.println("Invalid");
        }
    }

    private void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= this.balance) {
                this.balance = this.balance - amount;
            } else {
                System.err.println("Not enough money");
            }
        } else {
            System.err.println("Invalid");
        }
    }

    public void addTransaction(double amount, String operation) {
        if (operation.equals("deposit")) {
            deposit(amount);
        } else if (operation.equals("withdraw")) {
            withdraw(amount);
        } else {
            System.err.println("Invalid");
        }

        EX5_Transaction transaction = new EX5_Transaction(operation, amount, this.balance);
        history.add(transaction);
    }

    public void printTransaction() {
        DecimalFormat df = new DecimalFormat("#.##");

        for (int i = 0; i < history.size(); i++) {
            EX5_Transaction element = history.get(i);
            System.out.println(
                    "Giao dich " + (i + 1) + ": " + element.getOperation() + " $" + df.format(element.getAmount())
                            + ". So du luc nay: " + df.format(element.getBalance()));
        }
    }

    public static void main(String[] args) {
        EX5_Account acc = new EX5_Account();
        acc.addTransaction(2000.255, "deposit");
        acc.addTransaction(1000, "withdraw");
        acc.printTransaction();
    }
}