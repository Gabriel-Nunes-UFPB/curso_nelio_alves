package entities;

import exceptions.AccountException;

public class Account {
    private int number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public Account (){

    }

    public Account(int number, String holder, double balance, double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount) throws AccountException {
       validWithdraw(amount);
       balance -= amount;

    }

    public void validWithdraw(double amount) throws AccountException {
        if (amount > withdrawLimit){
            throw new AccountException("Withdrawal limit exceeded");
        } else if (amount > balance) {
            throw new AccountException("Insufficient balance");
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }
}
