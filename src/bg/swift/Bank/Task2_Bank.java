package bg.swift.Bank;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Task2_Bank {
    static NumberFormat numberFormat = new DecimalFormat("00000000");
    private static int IBAN = 1;


    public static void main(String[] args) {
        final String END_OPERATOR = "END";
        DepositAccount depositAccount = new DepositAccount();

        Scanner scanner = new Scanner(System.in);
//        ArrayList<Object> loanAccounts = new ArrayList<>();
//        ArrayList<Object> depositAccounts = new ArrayList<>();

        while (!END_OPERATOR.equals(scanner)) {
            String[] captureInput = scanner.nextLine().split(" ");

            if (captureInput[0].equalsIgnoreCase("open") && captureInput[3].equals("1")) {
                depositAccount = new DepositAccount(captureInput[1], Integer.parseInt(captureInput[2]),
                        Integer.parseInt(captureInput[3]), Double.parseDouble(captureInput[4]),
                        Double.parseDouble(captureInput[5]), IBAN);
                System.out.println(numberFormat.format(depositAccount.getIBAN()));
                incIBAN();
//                depositAccounts.add(depositAccount);
            }
            if (captureInput[0].equalsIgnoreCase("open") && captureInput[3].equals("2")) {
                LoanAccount loanAccount = new LoanAccount(captureInput[1], Integer.parseInt(captureInput[2]),
                        Integer.parseInt(captureInput[3]), Double.parseDouble(captureInput[4]),
                        Double.parseDouble(captureInput[5]), IBAN);
                System.out.println(numberFormat.format(loanAccount.getIBAN()));
                incIBAN();
            }
            if (captureInput[0].equalsIgnoreCase("open") && captureInput[3].equals("3")) {
                MortgageAccount mortgageAccount = new MortgageAccount(captureInput[1], Integer.parseInt(captureInput[2]),
                        Integer.parseInt(captureInput[3]), Double.parseDouble(captureInput[4]),
                        Double.parseDouble(captureInput[5]), IBAN);
                System.out.println(numberFormat.format(mortgageAccount.getIBAN()));
                incIBAN();
            }

            if (captureInput[0].equalsIgnoreCase("put") &&
                    (captureInput[1].equals(depositAccount.getIBAN()) || captureInput[1].equals(depositAccount.getCustomerName()))) {
                DepositAccount.
            }

        }


    }

    public static void incIBAN() {
        IBAN++;
    }


}
