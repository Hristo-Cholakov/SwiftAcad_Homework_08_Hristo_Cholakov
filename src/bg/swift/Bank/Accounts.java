package bg.swift.Bank;

public abstract class Accounts {
    private int IBAN;
    private String ownerType;
    public double balance;
    private double monthlyInterestRate;
    int monthlyPeriod;
//    private String customerName;
//    private int customerType;

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

    public void setIBAN(int IBAN) {
        this.IBAN = IBAN;
    }

    public void setOwnerType(String ownerType) {
        this.ownerType = ownerType;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setMonthlyInterestRate(double monthlyInterestRate) {
        this.monthlyInterestRate = monthlyInterestRate;
    }

    public void setMonthlyPeriod(int monthlyPeriod) {
        this.monthlyPeriod = monthlyPeriod;
    }

    public abstract double getInterestRate();
    public double investMoney(double desiredAmount) {
       return balance += desiredAmount;
    }
}
