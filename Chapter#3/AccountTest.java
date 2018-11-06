package ir.phgnight;

/**
 * Unit test for simple App.
 */

import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        Accountt myAccount = new Accountt("Sara", 20.456);
        myAccount.withdraw(19);
        myAccount.withdraw(5);
    }
}





