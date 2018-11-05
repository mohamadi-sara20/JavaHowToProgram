package ir.phgnight;
//Exercise#2.5&2.6
//Calculates the product of three numbers.  
import java.util.Scanner;

public class Ex5Ex6 {
    private String age;

    public static void main(String[] args){
        int x, y, z, result;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first digit!");
        x = input.nextInt();
        System.out.println();
        System.out.print("Enter the second digit!");
        y = input.nextInt();
        System.out.println();
        System.out.print("Enter the third digit!");
        z = input.nextInt();
        System.out.println();
        result = x * y * z;
        System.out.printf("Product is %d.", result);
    }
}

