package JavaHowToProgram.Chapter15;

import javax.xml.transform.stax.StAXResult;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
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
