package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {
            System.out.println("\n===== BANKING SYSTEM =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Transaction History");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    String accNo = sc.next();
                    System.out.print("Enter Name: ");
                    String name = sc.next();
                    bank.createAccount(accNo, name);
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    String accNoD = sc.next();
                    Account accD = bank.findAccount(accNoD);

                    if (accD == null) {
                        System.out.println("Account Not Found!");
                        break;
                    }

                    System.out.print("Enter Amount: ");
                    double amountD = sc.nextDouble();
                    accD.deposit(amountD);
                    System.out.println("Amount Deposited Successfully!");
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    String accNoW = sc.next();
                    Account accW = bank.findAccount(accNoW);

                    if (accW == null) {
                        System.out.println("Account Not Found!");
                        break;
                    }

                    System.out.print("Enter Amount: ");
                    double amountW = sc.nextDouble();
                    if (accW.withdraw(amountW)) {
                        System.out.println("Withdrawal Successful!");
                    } else {
                        System.out.println("Insufficient Balance!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    String accNoB = sc.next();
                    Account accB = bank.findAccount(accNoB);

                    if (accB == null) {
                        System.out.println("Account Not Found!");
                        break;
                    }

                    System.out.println("Current Balance: Rs " + accB.getBalance());
                    break;

                case 5:
                    System.out.print("Enter Account Number: ");
                    String accNoT = sc.next();
                    Account accT = bank.findAccount(accNoT);

                    if (accT == null) {
                        System.out.println("Account Not Found!");
                        break;
                    }

                    System.out.println("\nTransaction History:");
                    for (String t : accT.getTransactions()) {
                        System.out.println("• " + t);
                    }
                    break;

                case 6:
                    System.out.println("Thank you for using our Banking App!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
