package bg.swift.Bank;

public class DepositAccount extends Accounts {


    public DepositAccount(String customerName, int customerType, int accountType, double balance, double monthlyInterestRate, int IBAN) {
        super(customerName, customerType, accountType, balance, monthlyInterestRate, IBAN);
    }

    public DepositAccount() {
    }

    @Override
    public double getInterestRate() {
        return getMonthlyInterestRate()*monthlyPeriod*getBalance();
    }

    public double withdrawMoney(double desiredAmount) {
        return balance-=desiredAmount;
    }
}
