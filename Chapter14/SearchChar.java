//(Searching Strings) Write an application that inputs a line of text and a search character and
//uses String method indexOf to determine the number of occurrences of the character in the text.
package JavaHowToProgram.Chapter14;
import java.util.Scanner;
public class SearchChar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string!");
        String s = input.nextLine();
        System.out.println("Enter the char you want to search in the string!");
        char c = input.next().charAt(0);
        int counter = 0;
        int ind = 0;
        while (true) {
            if(s.indexOf(c, ind) == -1)
                break;
            else {
                ind = s.indexOf(c, ind);
                counter += 1;
                ind += 1;
            }
        }
        System.out.println(counter);

    }

}
