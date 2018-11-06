package ir.phgnight;

import java.util.Scanner;


public class ClassAverage {
    public static void main(String[] args){
        int counter, total, score;
        double average;
        counter = 1;
        total = 0;

        Scanner input = new Scanner(System.in);
        while (counter<=10){
            System.out.print("Enter the score, please!");
            score = input.nextInt();
            total = total + score;
            counter = counter + 1;
        }
        average = (double) total/10;
        System.out.printf("Class average is: %.2f", average);


    }
}