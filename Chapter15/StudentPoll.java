package JavaHowToProgram.Chapter15;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;
public class StudentPoll {
    public static Scanner input;
    public static Formatter output;
    public static void main(String[] args){
        try {
            getRequest();

            output.close();
        }

        catch (FileNotFoundException r){
            System.err.println("FileNotFound");
            System.exit(1);
        }


    }

    public static void getRequest() throws FileNotFoundException {
        input = new Scanner(System.in);
        int line;
        output = new Formatter("src/JavaHowToProgram/Chapter15/numbers.txt");
        System.out.println("Enter numbers from 1-6 and when done, enter ctrl+d!");
        while (input.hasNext()) {
            line = input.nextInt();
            output.format("%d%n", line);

        }
    }

}
