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
        System.out.printf("%s%n%s%n%s%n%s%n%s%n", "BMI Values", "Underweight: less than 18.5","Normal: between 18.5 and 24.9","Overweight: between 25 and 29.9","Obese: 30 or greater");



    }}









