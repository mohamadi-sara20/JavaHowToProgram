package ir.phgnight;
//Calculates a sample payroll calculation.
import java.util.Scanner;
public class Ex24 {

    public static void main(String[] args){
        int a, b, c, d, e;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number!");
        a = input.nextInt();
        System.out.print("Enter a number!");
        b = input.nextInt();
        System.out.print("Enter a number!");
        c = input.nextInt();
        System.out.print("Enter a number!");
        d = input.nextInt();
        System.out.print("Enter a number!");
        e = input.nextInt();

        if (a > b && a > c && a > d && a > e){
            System.out.printf("%d is the largest.%n", a );}
        if (b > a && b > c && b > d && b > e){
            System.out.printf("%d is the largest.%n", b );}
        if (c > a && c > b && c > d && c > e){
            System.out.printf("%d is the largest.%n", c );}
        if(d > a && d > b && d > c && d > e){
            System.out.printf("%d is the largest.%n", d );}
        if(e > a && e > b && e > c && e > d){
            System.out.printf("%d is the largest.%n", e);}

        if (a < b && a < c && a < d && a < e){
            System.out.printf("%d is the smallest.%n", a);}
        if (b < a && b < c && b < d && b < e){
            System.out.printf("%d is the smallest.%n", b);}
        if (c < a && c < b && c < d && c < e){
            System.out.printf("%d is the smallest.%n", c);}
        if (d < a && d < b && d < c && d < e){
            System.out.printf("%d is the smallest.%n", d);}
        if (e < a && e < b && e < c && e < c){
            System.out.printf("%d is the smallest.%n", e);}
    }

    }




