package ir.phgnight;

import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        int a, b, c;
        boolean triangle;
        triangle = false;

        Scanner input = new Scanner(System.in);


        System.out.print("Enter the first side!");
        a = input.nextInt();

        System.out.print("Enter the second side!");
        b = input.nextInt();

        System.out.print("Enter the third side!");
        c = input.nextInt();

        if (a+b > c && b+c>a && a+c >b)
            triangle = true;

        if(triangle == true)
                System.out.print("It's a right triangle!");
        else
            System.out.print("It's not a right triangle!");
    }

        }
