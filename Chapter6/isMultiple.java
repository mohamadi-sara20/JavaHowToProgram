package ir.phgnight;

import java.util.Scanner;

public class isMultiple {
    public static int a, b;
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter two numbers and see if the second is a multiple of the first!");
        a = input.nextInt();
        b = input.nextInt();
        System.out.print(isMultiple(a, b));
    }
    public static boolean isMultiple(int a, int b){
        if(b % a == 0)
            return true;
        else
            return false;}


}

