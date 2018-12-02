package JavaHowToProgram.Chapter15;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

public class PhoneNumber {

    private static char[][] numbers = {null, null, {'A', 'B', 'C'}, {'D', 'E', 'F'}, {'G', 'H', 'I'}, {'J', 'K', 'L'}, {'M', 'N', 'O'}, {'P', 'R', 'S'}, {'T', 'U', 'V'}, {'W', 'X', 'Y'}};


    public static void main(String[] args) throws FileNotFoundException{
        wordGenerator("8345678");




    }


    public static void wordGenerator(String number) throws FileNotFoundException{
        PrintStream printStream = new PrintStream(new FileOutputStream("src/JavaHowToProgram/Chapter15/phoneNumber.txt"));

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                for(int k = 0; k < 3; k++)
                    for (int l = 0; l < 3; l++)
                        for (int m = 0; m < 3; m++)
                            for (int n = 0; n < 3; n++)
                                for (int g = 0; g < 3; g++)
                                    printStream.printf(Locale.ENGLISH, "%c%c%c%c%c%c%c%n", numbers[number.charAt(0) - 48][i], numbers[number.charAt(1) - 48][j], numbers[number.charAt(1) - 48][k], numbers[number.charAt(1) - 48][l], numbers[number.charAt(1) - 48][m], numbers[number.charAt(1) - 48][n], numbers[number.charAt(1) - 48][g]);

         printStream.close();
    }

}



