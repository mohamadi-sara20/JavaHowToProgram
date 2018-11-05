package ir.phgnight;
//Calculates the product of three numbers.
import java.util.Scanner;

public class Ex17 {

    public static void main(String[] args){

        //

        int num1, num2, num3;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number!");
        num1 = input.nextInt();
        System.out.print("Enter a number!");
        num2 = input.nextInt();
        System.out.print("Enter a number!");
        num3 = input.nextInt();

        System.out.printf("Average: %d. %n", (num1 + num2 + num3) / 3);
        System.out.printf("Product: %d. %n", (num1 * num2 * num3));
        System.out.printf("Smallest number: %d. %n", java.lang.Math.min(num1, java.lang.Math.min(num2, num3)));


    }

    }


