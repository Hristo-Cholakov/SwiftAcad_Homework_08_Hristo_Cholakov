package bg.swift.Bank;

public class LoanAccount extends Accounts {


    public LoanAccount(String customerName, int customerType, int accountType, double balance, double monthlyInterestRate) {
        super(customerName, customerType, accountType, balance, monthlyInterestRate);
    }

    @Override
    public double getInterestRate() {
        if (monthlyPeriod <= 3 && getCustomerType()==1) {
            return monthlyPeriod*balance;
        } else if (monthlyPeriod <= 2 && getCustomerType()==2) {
            return monthlyPeriod*balance;
        } else {
            return getMonthlyInterestRate()*monthlyPeriod*getBalance();
        }
    }


}
