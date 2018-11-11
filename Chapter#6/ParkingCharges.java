package ir.phgnight;
import java.util.Scanner;

public class ParkingCharges {

    private static double hours = 0.0,  feeMax = 10.0;
    private static double totalCharges;
    private static double charge = 0.0;

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.printf("How many hours was this customer's car parked in the garage? Enter -1 to quit! %n");
        hours =  input.nextDouble();

        while (hours != -1) {
            double charge = calculateCharges(hours);
            totalCharges += charge;
            System.out.printf("This customer is charged %.2f %n", charge);
            System.out.printf("How many hours was this customer's car parked in the garage? Enter -1 to quit!%n");
            hours = input.nextDouble();}


        System.out.printf("Overall charge of today: %.2f%n", totalCharges);

    }
    public static double calculateCharges(double hours){

        if (hours <= 3.0)
            charge = 2.0;
        else
            charge =  2.0 + (hours - 3) * 0.5;

        if (charge > 10.0)
            charge = 10.0;

        return charge;}
}
