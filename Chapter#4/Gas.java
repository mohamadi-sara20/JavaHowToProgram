package ir.phgnight;
import java.util.Scanner;
public class Gas {
     static int miles, gas;
     static double totalGas, totalMiles;
     static double average=0;

    public static void main(String[] args) {
        totalGas = 0;
        totalMiles = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter miles. Enter -1 to quit. ");
        miles = input.nextInt();
        if (miles == -1)
            System.out.print("Not a valid number!");
        else {
            System.out.print("Enter gas.");
            gas = input.nextInt();
            totalGas += gas;
            totalMiles += miles;}

        while (miles != -1) {
            System.out.printf("Miles per gallon for this trip: %.2f%n", (double) miles / (double) gas);
            totalGas += gas;
            totalMiles += miles;
            System.out.print("Enter miles. Enter -1 to quit.");
            miles = input.nextInt();
            System.out.print("Enter gas.");
            gas = input.nextInt();}

        average =  totalMiles / totalGas;

        if (!(Double.isNaN(average)))
            System.out.printf("Overall miles per gallon %.2f%n", average);


    }
}
