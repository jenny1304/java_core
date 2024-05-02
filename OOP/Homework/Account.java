package OOP.Homework;

public class Account {
    private int id;
    private String name;
    private int balance = 0;

    public Account(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
        } else if (balance < amount) {
            System.err.println("That amount exceeds your current balance.");
        }
    }

    public void display(Account Account) {
        System.err.println("Id: " + Account.getBalance());
        System.err.println("Name: " + Account.getName());
        System.err.println("Balance: " + Account.getBalance());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public static void main(String[] args) {
        Account account1 = new Account(1000, "Tuan", 2000);
        account1.display(account1);
        account1.withdraw(2100);
        account1.deposit(600);
        System.out.println("Balance: " + account1.getBalance());
        account1.withdraw(2100);
        System.out.println("Balance: " + account1.getBalance());
    }

}
