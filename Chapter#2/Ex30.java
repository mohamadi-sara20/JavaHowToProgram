package ir.phgnight;
//Calculates a sample payroll calculation.
import java.util.Scanner;
public class Ex30 {

    public static void main(String[] args) {
        int a;
        int x;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number!");
        a = input.nextInt();
        String d = "";
        while(a / 10 > 1){
            x = a % 10;
            d = x + " " + d + " ";
            a = a / 10;


        }
        d = a +" " + d;
        System.out.print(d);

        }}









