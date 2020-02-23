package bg.swift.Bank;

public class Task2_Bank {
    public static void main(String[] args) {

        Customer customer = new Customer("john");
        DepositAccount depositAccount = new DepositAccount(543743, "individual", 500, 0.2, 3);
        depositAccount.investMoney(500);
        System.out.println(depositAccount.getBalance());



    }

}
