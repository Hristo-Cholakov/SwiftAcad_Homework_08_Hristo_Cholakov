package bg.swift.Bank;

public abstract class Accounts {
    private int IBAN;
    private String ownerType;
    private double balance;
    private double monthlyInterestRate;
    int monthlyPeriod;

    public Accounts(int IBAN, String ownerType, double balance, double monthlyInterestRate, int monthlyPeriod) {
        this.IBAN = IBAN;
        this.ownerType = ownerType;
        this.balance = balance;
        this.monthlyInterestRate = monthlyInterestRate;
        this.monthlyPeriod = monthlyPeriod;
    }

    public int getIBAN() {
        return IBAN;
    }

    public String getOwnerType() {
        return ownerType;
    }

    public double getBalance() {
        return balance;
    }

    public double getMonthlyInterestRate() {
        return monthlyInterestRate;
    }

    public int getMonthlyPeriod() {
        return monthlyPeriod;
    }

    public abstract double getInterestRate();
}
