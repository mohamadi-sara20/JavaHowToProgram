package ir.phgnight;
import java.util.ArrayList;
import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for(int i = 1; i<=1000; i++)
            if (isPerfectNumber(i)){
                System.out.print(i);
                System.out.println();}


    }

    public static boolean isPerfectNumber(int a){
        int sum = 0;
        ArrayList<String> factors = new ArrayList<String>();

        for(int i=1; i <a; i++){
            if (a % i == 0){
                sum += i;
                factors.add(Integer.toString(i));}
        }

        if (sum == a)
            {System.out.printf("Factors:" +factors + "for number: ");
            return true;}
        else
            return false;}


}