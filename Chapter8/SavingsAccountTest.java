package ir.phgnight;

public class SavingsAccountTest {

    public static void main(String[] args){

        SavingsAccount saver1 = new SavingsAccount(2000.0);
        SavingsAccount saver2 = new SavingsAccount(3000.0);

        SavingsAccount.modifyInterestRate(0.04);
        System.out.printf("Monthly Interest: %f  Current Balance: %f%n", saver1.calculateMonthlyInterest(saver1.savingBalance), saver1.updateBalance());
        System.out.printf("Monthly Interest: %f Current Balance: %f%n", saver2.calculateMonthlyInterest(saver2.savingBalance), saver2.updateBalance());

        SavingsAccount.modifyInterestRate(0.05);
        System.out.printf("Monthly Interest: %f  Current Balance: %f%n", saver1.calculateMonthlyInterest(saver1.savingBalance), saver1.updateBalance());
        System.out.printf("Monthly Interest: %f Current Balance: %f%n", saver2.calculateMonthlyInterest(saver2.savingBalance), saver2.updateBalance());




    }



}


