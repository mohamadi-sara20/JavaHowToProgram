//Completea)b)c)d)e)f)the following tasks, assuming that each applies to the same program:
//Write a statement that opens file "oldmast.txt" for input—use Scanner variable in-
//OldMaster.
//Write a statement that opens file "trans.txt" for input—use Scanner variable in-
//Transaction.
//Write a statement that opens file "newmast.txt" for output (and creation)—use for-
//matter variable outNewMaster.
//Write the statements needed to read a record from the file "oldmast.txt". Use the data
//to create an object of class Account—use Scanner variable inOldMaster . Assume that
//class Account is the same as the Account class in Fig. 15.9.
//Write the statements needed to read a record from the file "trans.txt". The record is
//an object of class TransactionRecord—use Scanner variable inTransaction. Assume
//that class TransactionRecord contains method setAccount (which takes an int) to set
//the account number and method setAmount (which takes a double) to set the amount
//of the transaction.
//Write a statement that outputs a record to the file "newmast.txt". The record is an ob-
//ject of type Account—use Formatter variable outNewMaster.

package JavaHowToProgram.Chapter15;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.Scanner;

public class Question2 {
    private static Formatter OutNewMaster;
    public static void main(String[] args) throws IOException{

        OutNewMaster = new Formatter("src/JavaHowToProgram/Chapter15/newmast.txt");
        Scanner inOldMaster = new Scanner(Paths.get("src/JavaHowToProgram/Chapter15/oldmast.txt"));
        Scanner inTransaction = new Scanner(Paths.get("src/JavaHowToProgram/Chapter15/trans.txt"));


            while (inOldMaster.hasNext()) {
                Account account = new Account();
                account.setAccount(inOldMaster.nextInt());
                account.setFirstName(inOldMaster.next());
                account.setSalary(inOldMaster.nextInt());
                account.setYear(inOldMaster.nextInt());
                System.out.printf("%d   %s   %d  %d%n", account.getAccount(), account.getFirstName(), account.getSalary(), account.getYear());
            }

        while (inTransaction.hasNext()){
            TransactionRecord transactionRecord = new TransactionRecord();
            transactionRecord.setAccountNumber(inTransaction.nextInt());
            transactionRecord.setAmount(inTransaction.nextDouble());

        }



    Account account = new Account(42453, "Sahar", 3000, 1990);
        OutNewMaster.format("%d %s  %d  %d", account.getAccount(), account.getFirstName(), account.getSalary(), account.getYear());
        OutNewMaster.close();
        }



}
