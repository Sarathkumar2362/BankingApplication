package src;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts = new ArrayList<>();

    public void createAccount(String accNo, String name) {
        accounts.add(new Account(accNo, name));
        System.out.println("Account Created Successfully!");
    }

    public Account findAccount(String accNo) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accNo)) {
                return acc;
            }
        }
        return null;
    }
}
