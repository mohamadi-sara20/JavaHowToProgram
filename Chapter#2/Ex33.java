package ir.phgnight;
//Calculates a sample payroll calculation.
import java.util.Scanner;

public class Ex33 {

    public static void main(String[] args) {
        float weight, height;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your height in meters, please!");
        height = input.nextFloat();
        System.out.print("Enter your weight in kilograms, please!");
        weight = input.nextFloat();
        System.out.printf("Your BMI is: %f.%n", weight/(height*height));


    }}









