package ir.phgnight;
//Calculates the product of three numbers.
import java.util.Scanner;

public class Ex16 {

    public static void main(String[] args){

        int num1, num2;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number!");
        num1 = input.nextInt();
        System.out.print("Enter a number!");
        num2 = input.nextInt();

        if (num1 > num2){
            System.out.printf("%d is larger. %n", num1);}
        else if(num2 > num1){
            System.out.printf("%d is larger.%n", num2);}
        else{
            System.out.printf("These numbers are equal. %n");


    }

    }
}

