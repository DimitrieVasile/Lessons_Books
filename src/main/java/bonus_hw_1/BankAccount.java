package bonus_hw_1;

import java.util.UUID;

public class BankAccount {
    private String accountNumber = UUID.randomUUID().toString().substring(0, 8); //copied from stack overflow :D
    final private String name;
    private double accountBalance;

    public BankAccount(String name) {
        this.accountNumber = getAccountNumber();
        this.name = name;
        this.accountBalance = 0.0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println("Client " + getName() + " - " + "deposit transaction : " + amount + " euro completed" + "\n");
        } else {
            System.out.println("The deposit amount must be positive");
        }
    }

    public void exclude(double amount) {
        if (amount > 0) {
            if (accountBalance >= amount) {
                accountBalance -= amount;
                System.out.println("Client " + getName() + " - " + "cash withdrawal " + amount + " Euro completed." + "\n");
            } else {
                System.out.println("Insufficient funds" + "\n");
            }
        } else {
            System.out.println("The withdrawal amount must be positive" + "\n");
        }
    }
}

