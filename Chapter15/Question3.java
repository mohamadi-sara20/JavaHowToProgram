//Complete the following tasks, assuming that each applies to the same program:
//a) Write a statement that opens file "oldmast.ser" for input—use ObjectInputStream
//variable inOldMaster to wrap an InputStream object.
//b) Write a statement that opens file "trans.ser" for input—use ObjectInputStream vari-
//able inTransaction to wrap an InputStream object.
//680
// Chapter 15 Files, Streams and Object Serialization
//c) Write a statement that opens file "newmast.ser" for output (and creation)—use
//ObjectOutputStream variable outNewMaster to wrap an OutputStream.
//d) Write a statement that reads a record from the file "oldmast.ser". The record is an
//object of class Account —use ObjectInputStream variable inOldMaster. Assume class
//Account is the same as the Account class in Fig. 15.9
//e) Write a statement that reads a record from the file "trans.ser". The record is an object
//of class TransactionRecord—use ObjectInputStream variable inTransaction.
//f) Write a statement that outputs a record of type Account to the file "newmast.ser"—use
//ObjectOutputStream variable outNewMaster.
package JavaHowToProgram.Chapter15;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Question3 {
    private static ObjectOutputStream outNewMaster;
    public static void main(String[] args){
        try {

            ObjectInputStream inOldMaster = new ObjectInputStream(Files.newInputStream(Paths.get("oldmaster.ser")));
            ObjectInputStream inTransaction = new ObjectInputStream(Files.newInputStream(Paths.get("trans.ser")));

            Account account = new Account(34567, "Sam", 2000, 1930);
            outNewMaster = new ObjectOutputStream(Files.newOutputStream(Paths.get("src/JavaHowToProgram/Chapter15/newmast.ser")));
            outNewMaster.writeObject(account);

            ObjectInputStream inputStream = new ObjectInputStream(Files.newInputStream(Paths.get("src/JavaHowToProgram/Chapter15/oldmast.ser")));

            Account account1 =  (Account) inOldMaster.readObject();
            TransactionRecord transaction = (TransactionRecord) inTransaction.readObject();


        }

        catch(IOException e){
                System.err.println("IOE exception!");
            }

        }

}
