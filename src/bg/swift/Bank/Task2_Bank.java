package bg.swift.Bank;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Task2_Bank {
   static NumberFormat numberFormat = new DecimalFormat("00000000");
   private static int IBAN = 1;


    public static void main(String[] args) {
        final String END_OPERATOR = "END";

        Scanner scanner = new Scanner(System.in);
        String currentLine = scanner.nextLine();


        while (!END_OPERATOR.equals(currentLine)) {
            System.out.println("Enter values here:");
            String[]captureInput = scanner.nextLine().split(" ");
            System.out.println("yt");
            if (captureInput[0].equalsIgnoreCase("open") && captureInput[2].equals(1)) {
                DepositAccount depositAccount = new DepositAccount(captureInput[1], Integer.parseInt(captureInput[2]),
                        Integer.parseInt(captureInput[3]), Double.parseDouble(captureInput[4]),
                        Double.parseDouble(captureInput[5]));
                System.out.println("test");

            }

        }


//


    }

    public static void getIBAN() {
        System.out.println(numberFormat.format(IBAN));
        IBAN++;
    }

}
