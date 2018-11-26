package JavaHowToProgram.Chapter14;
import java.util.Scanner;


public class RegionMatches {

public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a string!");
    String s1 = input.nextLine();
    System.out.println("Enter the second string!");
    String s2 = input.nextLine();

    System.out.println("From where in the first string would you like to start the search?");
    int s1Start = input.nextInt();
    System.out.println("From where in the second string would you like to start the search?");
    int s2Start = input.nextInt();
    System.out.println("How many characters would you like to compare?");
    int number = input.nextInt();

    System.out.println(s1.regionMatches(true, s1Start, s2, s2Start, 4));


}


}
