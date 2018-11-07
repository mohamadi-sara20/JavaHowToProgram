package ir.phgnight;

import java.util.Scanner;

public class Analysis {
    public static void main(String[] args){
        int passes, failures, counter, result;
        passes = 0;
        failures = 0;
        counter = 0;

        Scanner input = new Scanner(System.in);

        while (counter<10){
            System.out.print("Enter the result! Either 1 or 2, please!");
            result = input.nextInt();
            if (result == 1){
                passes += 1;}
            else if(result == 2){
                failures += 1;
            }
            else{System.out.print("The numer is not valid!");
                break; }
            counter +=  1;}

        System.out.printf("Passes: %d%nFailures: %d%n", passes, failures);
        if (passes > 8){
            System.out.print("Bonus to the instructor! ");
        }
    }

}