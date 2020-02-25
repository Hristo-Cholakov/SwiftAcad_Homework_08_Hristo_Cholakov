package bg.swift.Bank;

public abstract class Accounts {
    private String customerName;
    private int customerType;
    private int accountType;
    private int IBAN;
    public double balance;
    private double monthlyInterestRate;
    //private String ownerType;
    public static int monthlyPeriod;

    public Accounts() {
    }

    public Accounts(String customerName, int customerType, int accountType, double balance,
                    double monthlyInterestRate, int IBAN) {
        this.customerName = customerName;
        this.customerType = customerType;
        this.accountType = accountType;
        this.balance = balance;
        this.monthlyInterestRate = monthlyInterestRate;
        this.IBAN = IBAN;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getCustomerType() {
        return customerType;
    }

    public int getAccountType() {
        return accountType;
    }

    public int getIBAN() {
        return IBAN;
    }

    public double getMonthlyInterestRate() {
        return monthlyInterestRate;
    }

    public double getBalance() {
        return balance;
    }

    public abstract double getInterestRate();
    public double investMoney(double desiredAmount) {
       return balance += desiredAmount;
    }
}
