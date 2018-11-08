package ir.phgnight;

/**
 * Unit test for simple App.
 */

import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {

        Accountt account1 = new Accountt("Jane Green", 50.00);
        Accountt account2 = new Accountt("John Blue", -7.53);

        System.out.printf("%s %n", account1.displayAccount(account1));
        System.out.printf("%s %n", account2.displayAccount(account2));

        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account1: ");
        double amount = input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance%n%n", amount);
        account1.deposit(amount);

        System.out.printf("%s %n", account1.displayAccount(account1));
        System.out.printf("%s %n", account2.displayAccount(account2));


        System.out.print("Enter deposit amount for account2: "); 
        amount = input.nextDouble();
        System.out.printf("%nadding to account2 balance%n%n", amount);


        System.out.printf("%s %n", account1.displayAccount(account1));
        System.out.printf("%s %n", account2.displayAccount(account2));








    }
}





