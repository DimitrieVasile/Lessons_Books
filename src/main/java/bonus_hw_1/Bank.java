package bonus_hw_1;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    final private List<BankAccount> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public void executeTransaction(Transaction transaction) {
        transaction.process();
    }

    public void displayAccountInfo() {
        for (BankAccount account : accounts) {
            System.out.println("Bank account owner : " + account.getName());
            System.out.println("Account number : " + account.getAccountNumber());
            System.out.println("Account balance: : " + account.getAccountBalance()+"\n");
        }
    }
    public void displayAllAccounts(){
        for (BankAccount account : accounts){
            System.out.println("Account number : " + account.getAccountNumber()+"\n");
        }
    }
}
