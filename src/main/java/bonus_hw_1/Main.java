package bonus_hw_1;

public class Main {
    public static void main(String[] args) {

        Bank myBank = new Bank();

        BankAccount account1 = new BankAccount("Ciobanu Ion");
        myBank.addAccount(account1);
        BankAccount account2 = new BankAccount("Guzun Andrei");
        myBank.addAccount(account2);
        BankAccount account3 = new BankAccount("Dimitriev Daniela");
        myBank.addAccount(account3);

        myBank.executeTransaction(new DepositTransaction(account1, 10000));
        myBank.executeTransaction(new DepositTransaction(account2, 500));
        myBank.executeTransaction(new DepositTransaction(account3, 9574));

        myBank.executeTransaction(new WithdrawalTransaction(account3, 596));
        myBank.executeTransaction(new WithdrawalTransaction(account2, 499));
        myBank.executeTransaction(new WithdrawalTransaction(account1, 9111));

        myBank.displayAllAccounts();

        myBank.displayAccountInfo();

    }
}
