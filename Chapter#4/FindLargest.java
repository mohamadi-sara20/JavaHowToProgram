package ir.phgnight;


import com.sun.org.apache.xpath.internal.operations.Bool;
import org.junit.Test;

import javax.naming.NameNotFoundException;
import java.util.Scanner;

public class FindLargest {

    public static void main(String[] args) {
        int counter;
        Double number;
        Double largest = null;

        Scanner input = new Scanner(System.in);

        //System.out.print("Enter a number!");
        //number = input.nextDouble();
        //largest = number;

        for (counter =1; counter <= 9; counter++){
            System.out.print("Enter a number!");
            number = input.nextDouble();
            if (largest == null)
                largest = number;
            else
               {if (largest<number)
                    largest = number;}}

        System.out.printf("Largest Number: %.2f", largest);
}}

