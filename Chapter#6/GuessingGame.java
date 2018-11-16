package ir.phgnight;
import java.security.SecureRandom;
import java.util.Scanner;

public class GuessingGame {
    private static int r;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();
        r = 1 + rand.nextInt(1000);
        System.out.println("Enter a number!");
        int n = input.nextInt();


        while ( n != r) {
            if (n > r) {
                System.out.print("Too high! Guess again!");
                n = input.nextInt();
            }
            else if (n < r){
                System.out.print("Too low! Guess again!");
                n = input.nextInt();}
        }
        System.out.println("Congrats!");


    }}