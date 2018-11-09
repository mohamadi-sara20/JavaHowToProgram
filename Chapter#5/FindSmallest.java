package ir.phgnight;

import java.util.Scanner;

public class FindSmallest {
    public static void main(String[] args) {
        int a, smallest;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number!");
        a = input.nextInt();
        smallest = a;

        for(int i = 0; i <a; i++){
            System.out.print("Enter a number!");
            a = input.nextInt();
            if (a < smallest)
                smallest = a;
            }
        System.out.printf("The smallest number is %d.%n", smallest);
}}

