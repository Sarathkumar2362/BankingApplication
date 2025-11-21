package src;

import java.util.ArrayList;

public class Account {
    private String accountNumber;
    private String name;
    private double balance;
    private ArrayList<String> transactions;

    public Account(String accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
        transactions.add("Account created for " + name);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add("Deposited: Rs " + amount);
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            return false;
        }
        balance -= amount;
        transactions.add("Withdrawn: Rs " + amount);
        return true;
    }

    public double getBalance() {
        return balance;
    }

    public ArrayList<String> getTransactions() {
        return transactions;
    }
}
