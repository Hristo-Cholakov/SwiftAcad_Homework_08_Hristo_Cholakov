package bg.swift.Bank;

public class LoanAccount extends Accounts {

    public LoanAccount(int IBAN, String ownerType, double balance, double monthlyInterestRate, int monthlyPeriod) {
        super(IBAN, ownerType, balance, monthlyInterestRate, monthlyPeriod);
    }

    @Override
    public double getInterestRate() {
        if (getMonthlyPeriod() <= 3 && getOwnerType().toUpperCase().contains("individual")) {
            return 0;
        } else if (getMonthlyPeriod() <= 2 && getOwnerType().toUpperCase().contains("company")) {
            return 0;
        } else {
            return getMonthlyInterestRate()*getMonthlyPeriod()*getBalance();
        }
    }


}
