package ir.phgnight;

import org.omg.CORBA.MARSHAL;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        int a, b, c;
        boolean triangle;
        triangle = false;

        java.util.Scanner input = new Scanner(System.in);


        System.out.print("Enter the first side!");
        a = input.nextInt();

        System.out.print("Enter the second side!");
        b = input.nextInt();

        System.out.print("Enter the third side!");
        c = input.nextInt();

        if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c,2))
            triangle = true;
        else if (Math.pow(b, 2)+Math.pow(c,2) == Math.pow(a,2))
            triangle = true;
        else if (Math.pow(a,2) + Math.pow(c,2) == Math.pow(b,2))
            triangle = true;

        if(triangle == true)
                System.out.print("It's a triangle!");
        else
            System.out.print("It's not a triangle!");
    }

        }
