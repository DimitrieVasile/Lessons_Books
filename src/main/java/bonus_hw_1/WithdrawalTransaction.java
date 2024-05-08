package bonus_hw_1;

public class WithdrawalTransaction implements Transaction {
    final private BankAccount account;
    final private double amount;

    public WithdrawalTransaction(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void process() {
        account.exclude(amount);
    }
}
