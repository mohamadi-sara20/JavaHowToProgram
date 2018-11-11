package ir.phgnight;

import java.util.Scanner;

public class Minimum {
    public static double n1, n2, n3;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter three floating-point numbers!");
        n1 = input.nextDouble();
        n2 = input.nextDouble();
        n3 = input.nextDouble();

        System.out.printf("The minimum between %.10f, %.10f and %.10f is %.10f. %n",n1, n2, n3, minimum3(n1, n2, n3));

    }


    public static double minimum3(double a, double b, double c){
        return Math.min(a, (Math.min(b, c)));}

}
