package bg.swift.Bank.Deposits;

public class MortgageAccount extends DepositAccount {

    public MortgageAccount(int IBAN, String owner, double balance, double monthlyInterestRate) {
        super(IBAN, owner, balance, monthlyInterestRate);
    }
}
