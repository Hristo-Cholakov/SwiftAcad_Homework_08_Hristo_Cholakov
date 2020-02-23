package bg.swift.Bank;

public class MortgageAccount extends Accounts {
    public MortgageAccount(int IBAN, String ownerType, double balance, double monthlyInterestRate, int monthlyPeriod) {
        super(IBAN, ownerType, balance, monthlyInterestRate, monthlyPeriod);
    }

    @Override
    public double getInterestRate() {
        if (getMonthlyPeriod() <= 6 && getOwnerType().toUpperCase().contains("individual")) {
            return 0;
        } else if (getMonthlyPeriod() <= 12 && getOwnerType().toUpperCase().contains("company")) {
            return 0.5*getMonthlyPeriod()*getBalance();
        } else {
            return getMonthlyInterestRate()*getMonthlyPeriod()*getBalance();
        }
    }


}
