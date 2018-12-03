//This is a concise answer to Question#4 and Question#5 at the same time.
//We used our own data and not the book's.
//
// (File Matching) Self-Review Exercise 15.2 asked you to write a series of single statements.
//Actually, these statements form the core of an important type of file-processing program—namely,
//a file-matching program. In commercial data processing, it’s common to have several files in each
//application system. In an accounts receivable system, for example, there’s generally a master file con-
//taining detailed information about each customer, such as the customer’s name, address, telephone
//number, outstanding balance, credit limit, discount terms, contract arrangements and possibly a
//condensed history of recent purchases and cash payments.
//Exercises
// 681
//As transactions occur (i.e., sales are made and payments arrive in the mail), information about
//them is entered into a file. At the end of each business period (a month for some companies, a
//week for others, and a day in some cases), the file of transactions (called "trans.txt") is applied to
//the master file (called "oldmast.txt") to update each account’s purchase and payment record.
//During an update, the master file is rewritten as the file "newmast.txt", which is then used at the
//end of the next business period to begin the updating process again.
//File-matching programs must deal with certain problems that do not arise in single-file pro-
//grams. For example, a match does not always occur. If a customer on the master file has not made
//any purchases or cash payments in the current business period, no record for this customer will
//appear on the transaction file. Similarly, a customer who did make some purchases or cash pay-
//ments could have just moved to this community, and if so, the company may not have had a
//chance to create a master record for this customer.
//Write a complete file-matching accounts receivable program. Use the account number on
//each file as the record key for matching purposes. Assume that each file is a sequential text file with
//records stored in increasing account-number order.
//a) Define class TransactionRecord. Objects of this class contain an account number and
//amount for the transaction. Provide methods to modify and retrieve these values.
//b) Modify class Account in Fig. 15.9 to include method combine, which takes a Transac-
//tionRecord object and combines the balance of the Account object and the amount val-
//ue of the TransactionRecord object.
//d) Create class FileMatch to perform the file-matching functionality. The class should
//contain methods that read oldmast.txt and trans.txt. When a match occurs (i.e., re-
//cords with the same account number appear in both the master file and the transaction
//682
// Chapter 15 Files, Streams and Object Serialization
//file), add the dollar amount in the transaction record to the current balance in the mas-
//ter record, and write the "newmast.txt" record. (Assume that purchases are indicated
//by positive amounts in the transaction file and payments by negative amounts.) When
//there’s a master record for a particular account, but no corresponding transaction re-
//cord, merely write the master record to "newmast.txt". When there’s a transaction re-
//cord, but no corresponding master record, print to a log file the message "Unmatched
//transaction record for account number..." (fill in the account number from the trans-
//action record). The log file should be a text file named "log.txt".
//15.5 (File Matching with Multiple Transactions) It’s possible (and actually common) to have
//several transaction records with the same record key. This situation occurs, for example, when a cus-
//tomer makes several purchases and cash payments during a business period. Rewrite your accounts
//receivable file-matching program from Exercise 15.4 to provide for the possibility of handling sev-
//eral transaction records with the same record key. Modify the test data of CreateData.java to in-
//clude the additional transaction records in Fig. 15.16.

package JavaHowToProgram.Chapter15;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.Scanner;

public class FileMatch {
    public static void main(String[] args) throws IOException{

        FileWriter f = new FileWriter("src/JavaHowToProgram/Chapter15/updatedSalaries.txt");
        Formatter newMaster = new Formatter(f);


        try {


            Scanner oldMaster = new Scanner((Paths.get("src/JavaHowToProgram/Chapter15/oldmast.txt")));


            while (oldMaster.hasNext()) {
                Account account = new Account(oldMaster.nextInt(), oldMaster.next(), oldMaster.nextInt(), oldMaster.nextInt());

                Scanner inTransction = new Scanner((Paths.get("src/JavaHowToProgram/Chapter15/trans.txt")));
                while (inTransction.hasNext()) {
                    TransactionRecord transactionRecord = new TransactionRecord(inTransction.nextInt(), inTransction.nextDouble());
                    if (transactionRecord.getAccountNumber() == account.getAccount()) {
                        account.combine(transactionRecord);
                    }
                }
                inTransction.close();
                newMaster.format("%d    %s  %f  %d%n", account.getAccount(), account.getFirstName(), account.getSalary(), account.getYear());
                System.out.printf("%d   %s  %f  %d%n", account.getAccount(), account.getFirstName(), account.getSalary(), account.getYear());
            }
            newMaster.close();
        }

        catch(IOException e){
                System.err.println("IOE exception!");
            }


        }
}


