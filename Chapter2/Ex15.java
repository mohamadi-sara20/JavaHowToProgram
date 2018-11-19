package ir.phgnight;
//Calculates the product of three numbers.
import java.util.Scanner;
public class Ex15 {

    public static void main(String[] args){

        int num1, num2;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number!");
        num1 = input.nextInt();
        System.out.print("Enter a number!");
        num2 = input.nextInt();

        System.out.printf("Sum: %d.%n", num1 + num2 );

        System.out.printf("Difference: %d.%n", java.lang.Math.abs(num1 - num2));
        System.out.printf("Product: %d.%n", num1 * num2 );

        if (num1 >= num2){
            System.out.printf("Quotient: %d.%n", num1 / num2 );}
        else{
            System.out.printf("Quotient: %d.%n", num2 / num1);


    }

    }
}

