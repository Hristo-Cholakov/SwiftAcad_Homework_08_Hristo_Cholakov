package bg.swift.Bank.Deposits;

public class LoanAccount extends DepositAccount {
    public LoanAccount(int IBAN, String owner, double balance, double monthlyInterestRate) {
        super(IBAN, owner, balance, monthlyInterestRate);
    }
}
