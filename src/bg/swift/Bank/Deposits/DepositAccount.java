package bg.swift.Bank.Deposits;

import bg.swift.Bank.Customers.CompanyCustomer;

public class DepositAccount {
   private int IBAN;
   private String owner;
   private double balance;
   private double monthlyInterestRate;
   int monthlyPeriod;

    public DepositAccount(int IBAN, String owner, double balance,
                          double monthlyInterestRate, int monthlyPeriod) {
        this.IBAN = IBAN;
        this.owner = owner;
        this.balance = balance;
        this.monthlyInterestRate = monthlyInterestRate;
        this.monthlyPeriod = monthlyPeriod;
    }

    public static double interestRate(double monthlyInterestRate, int monthlyPeriod, double balance) {
        if (monthlyPeriod < 3 && )
        return monthlyInterestRate*monthlyPeriod*balance;
    }
}
