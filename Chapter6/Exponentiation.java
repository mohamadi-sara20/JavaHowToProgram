package ir.phgnight;
import java.util.Scanner;
public class Exponentiation {

    public static int a, b;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the base and the power!");
        a = input.nextInt();
        b = input.nextInt();

        System.out.printf("%d to the power of %d equals %d. %n", a, b, integerPower(a, b));}

    public static int integerPower(int a, int b){
        int res = 1;
        for (int i = 1; i <= b; i++){
            res = res * a;}
        return res;}
}
