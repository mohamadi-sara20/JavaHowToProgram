package ir.phgnight;
//Calculates a sample payroll calculation.
import java.util.Scanner;

public class Ex25 {

    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number!");
        a = input.nextInt();

        if (a % 2 == 0) {
            System.out.printf("%d is even.%n", a);
        } else {
            System.out.printf("%d is odd.%n", a);
        }


    }

}




