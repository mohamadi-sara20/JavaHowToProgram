//This program takes items a salesperson has sold one by one, and then calculates the commission and then the salary
//for that salesperson. It would have also been possible to input the overall amount of the sold items and then calcula-
//-te the commission.
package ir.phgnight;

import java.util.Scanner;

public class SeparatedDigits {
    public static int num;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number!");
        num = input.nextInt();

    System.out.print(displayDigit(num));

    }

    public static int CalculateInt(int a, int b) {
        return a / b;
    }

    public static int CalculateRem(int a, int b) {
        return a % b;
    }

    public static String displayDigit(int a) {
        String s = "";
        while ((a % 10) > 1) {

            s =  a % 10 + "  " + s ;
            a = a / 10;

        }

        s = a + "  " + s;
        return s;}
}
