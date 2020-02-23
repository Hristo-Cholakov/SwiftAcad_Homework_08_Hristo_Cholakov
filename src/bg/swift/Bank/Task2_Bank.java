package bg.swift.Bank;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Task2_Bank {
   static NumberFormat numberFormat = new DecimalFormat("00000000");
   private static int IBAN = 0;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (!("end").equalsIgnoreCase(scanner.nextLine())) {
            if (("open").equalsIgnoreCase(scanner.nextLine())) {
                String[] open = scanner.nextLine().split(" ");
                if (open[2].equals("1")) {
                    DepositAccount depositAccount = new DepositAccount(openAccount(), 1)
                }
            }
        }


//


    }

    public static void openAccount() {

        IBAN++;
        System.out.println(numberFormat.format(IBAN));
    }

}
