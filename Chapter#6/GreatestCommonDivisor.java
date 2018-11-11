package ir.phgnight;
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestCommonDivisor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter two numers!");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.print(greatestCommonDivisor(a, b));

    }

    public static int greatestCommonDivisor(int a, int b) {
       if (a%b == 0 || b%a ==0)
           return Math.min(a, b);
        else if (a>b)
           return greatestCommonDivisor(a%b,b);
        return greatestCommonDivisor(b%a,a); }
    }