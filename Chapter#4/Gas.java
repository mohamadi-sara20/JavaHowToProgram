package ir.phgnight;

public class Gas {
    public static void main(String[] args) {

        public int miles, gas, totalMiles, totalGas;
        public double average;
        totalGas = 0;
        totalMiles = 0;
        average = 0;
        gas = 0; 

        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter miles. Enter -1 to quit. ");
        miles = input.nextInt();
        if (miles == -1)
            System.out.print("Not a valid number!");
        else {
            System.out.print("Enter gas.");
            gas = input.nextInt();
            totalGas += gas;
            totalMiles += miles;
            System.out.printf("Miles per gallon for this trip: %.2f%n", (double) miles / (double) gas);
        }

        while (miles != -1) {
            totalGas += gas;
            totalMiles += miles;
            System.out.print("Enter miles. Enter -1 to quit.");
            miles = input.nextInt();
            System.out.print("Enter gas.");
            gas = input.nextInt();
            System.out.printf("Miles per gallon for this trip: %.2f%n", (double) miles / (double) gas);}

        average = (double) totalMiles / (double) totalGas;

        if (!(Double.isNaN(average)))
            System.out.printf("Overall miles per gallon %.2f%n", average);


    }
}
