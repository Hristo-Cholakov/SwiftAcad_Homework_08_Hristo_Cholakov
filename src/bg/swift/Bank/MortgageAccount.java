package bg.swift.Bank;

public class MortgageAccount extends Accounts {

    public MortgageAccount(String customerName, int customerType, int accountType, double balance, double monthlyInterestRate) {
        super(customerName, customerType, accountType, balance, monthlyInterestRate);
    }

    @Override
    public double getInterestRate() {
        if (monthlyPeriod <= 6 && getCustomerType()==1) {
            return monthlyPeriod*getBalance();
        } else if (monthlyPeriod <= 12 && getCustomerType()==2) {
            return 0.5*monthlyPeriod*getBalance();
        } else {
            return getMonthlyInterestRate()*monthlyPeriod*getBalance();
        }
    }


}
