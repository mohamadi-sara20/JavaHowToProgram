package ir.phgnight;
import java.util.Scanner;

public class RoundingNumbers {
    private static double num;

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number you want rounded!");
        num = input.nextDouble();

        System.out.printf("Original value: %f Rounded: %4f %n", num, roundToInteger(num));
        System.out.printf("Original value: %f Rounded: %4f %n", num,roundToTenths(num));
        System.out.printf("Original value: %f Rounded: %4f %n", num,roundToHundreths(num));
        System.out.printf("Original value: %f Rounded: %4f %n", num,roundToThousands(num));}


    public static double roundToInteger(double num){
        return Math.floor(num + 0.5);}

    public static double roundToTenths(double num){
        return Math.floor(num * 10 + 0.5) / 10;}

    public static double roundToHundreths(double num){
        return Math.floor(num * 100 + 0.5) / 100; }

    public static double roundToThousands(double num){
        return Math.floor(num * 1000 + 0.5) / 1000;}

}
