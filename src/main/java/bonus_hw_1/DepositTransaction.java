package bonus_hw_1;

public class DepositTransaction implements Transaction {
    final private BankAccount account;
    final private double amount;

    public DepositTransaction(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void process() {
        account.deposit(amount);
    }
}

