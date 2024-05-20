package Bank;

public class Account {
    private final int COUNT_NUMBER;
    public String name;
    private double balance = 0;

    public Account(int COUNT_NUMBER, String name, double balance) {
        this.COUNT_NUMBER = COUNT_NUMBER;
        this.name = name;
        this.balance = balance;
    }

    public int getCOUNT_NUMBER() {
        return COUNT_NUMBER;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }
    public void withdraw(double amount) {
        this.balance -= (amount + 5);
    }

    @Override
    public String toString() {
        return "Updated Account: " + '\'' +
                "Account Number: " + COUNT_NUMBER +
                ", Name: '" + name + '\'' +
                ", Balance: " + balance;
    }
}
