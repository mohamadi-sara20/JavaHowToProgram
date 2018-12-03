// (File Matching with Object Serialization) Recreate your solution for Exercise 15.5 using
//object serialization. Use the statements from Exercise 15.3 as your basis for this program. You may
//want to create applications to read the data stored in the .ser files—the code in Section 15.5.2 can
//be modified for this purpose.
package JavaHowToProgram.Chapter15;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileMatchingSer {
    public static ObjectInputStream inputStream;
    public static void main(String[] args) throws IOException {


        try {


            Scanner oldMaster = new Scanner((Paths.get("src/JavaHowToProgram/Chapter15/oldmast.txt")));

            ObjectOutputStream newMaster = new ObjectOutputStream(Files.newOutputStream(Paths.get("src/JavaHowToProgram/Chapter15/updatedSalaries.ser")));

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
                Account account1 = new Account(account.getAccount(), account.getFirstName(), account.getSalary(), account.getYear());
                newMaster.writeObject(account1);
            }
            newMaster.close();

        }

        catch(IOException e){
            System.err.println("IOE exception!");
        }


        openFile();
        readObjects();

    }

    public static void openFile(){
        try {

            inputStream = new ObjectInputStream(Files.newInputStream(Paths.get("src/JavaHowToProgram/Chapter15/updatedSalaries.ser")));
        }
        catch (IOException e){
            System.err.println("IOE Exception!");
            System.exit(1);
        }
    }

    public static void readObjects(){

        try {
            while (true){
                Account account = (Account) inputStream.readObject();
                System.out.printf("%d   %s  %f  %d%n", account.getAccount(), account.getFirstName(), account.getSalary(), account.getAccount());
            }

        }
        catch (EOFException e){
            System.out.println("End of records!");
            System.exit(0);

        }
        catch (IOException e){

            System.err.println("IOE Exception!");
            System.exit(1);
        }
        catch (ClassNotFoundException e){

            System.err.println("Class not found!");
        }

    }

    public static void closeFile(){
        try {
            if (inputStream != null)
                inputStream.close();
        }
        catch (IOException e){
        System.err.println("IOE Exception!");
        System.exit(1);
        }
    }


}



