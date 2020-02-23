package bg.swift.Bank;

public class DepositAccount extends Accounts {

    public DepositAccount(int IBAN, String ownerType, double balance, double monthlyInterestRate, int monthlyPeriod) {
        super(IBAN, ownerType, balance, monthlyInterestRate, monthlyPeriod);
    }

    @Override
    public double getInterestRate() {
        return getMonthlyInterestRate()*getMonthlyPeriod()*getBalance();
    }

    public static double withdrawMoney(double balance, double desiredAmount) {
        return balance - desiredAmount;
    }
}
