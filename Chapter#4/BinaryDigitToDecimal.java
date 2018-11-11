package ir.phgnight;

import java.util.Scanner;

public class BinaryDigitToDecimal {
    public static void main(String[] args) {
        int binaryDigit;
        int decimal, counter;
        String num;
        decimal = 0;
        counter = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary digit!");
        binaryDigit = input.nextInt();
        num = Integer.toString(binaryDigit);

        for (int i = (String.valueOf(binaryDigit).length() - 1); i >= 0; i--) {
            Character d = num.charAt(String.valueOf(binaryDigit).length()-1-i);
            int digit = d - '0';
            decimal += (int) Math.pow(2, i) * digit;}

        System.out.print(decimal);

        }
    }

