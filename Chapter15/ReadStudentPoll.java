// (Student Poll) Figure 7.8 contains an array of survey responses that’s hard coded into the
//program. Suppose we wish to process survey results that are stored in a file. This exercise requires
//two separate programs. First, create an application that prompts the user for survey responses and
//outputs each response to a file. Use a Formatter to create a file called numbers.txt. Each integer
//should be written using method format. Then modify the program in Fig. 7.8 to read the survey
//responses from numbers.txt. The responses should be read from the file by using a Scanner. Use
//method nextInt to input one integer at a time from the file. The program should continue to read
//responses until it reaches the end of the file. The results should be output to the text file "out-
//put.txt".

package JavaHowToProgram.Chapter15;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.Scanner;

public class ReadStudentPoll {
    private static Scanner input;
    private static Formatter output;
    public static int[] frequency = new int[6];
    public static void main(String[] args){

        try {
            openFile();
            readRecords();
            closeFile();
            System.out.printf("%10s  %10s%n", "Rating", "Frequency");
            for(int i = 0; i < frequency.length; i++)
                System.out.printf("%6d   %9d%n", i, frequency[i]);
        }
        catch (IOException e){
            System.err.println("IOE Exception!");
            System.exit(1);
        }
    }

    public static void openFile() throws IOException{
        input = new Scanner(Paths.get("src/JavaHowToProgram/Chapter15/numbers.txt"));
        output = new Formatter("src/JavaHowToProgram/Chapter15/SurveyResults.txt");
    }
    public static void readRecords(){
        while (input.hasNext()){
            int line = input.nextInt();
            try {
            frequency[line-1] += 1;
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.printf("%d is not between 1-6 so we ignored it!%n", line);
            }
        }

    }
    public static void closeFile(){
        if (input != null)
            input.close();


    }
}
