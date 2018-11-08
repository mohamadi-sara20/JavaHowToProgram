package ir.phgnight;


public class Gas {
    public static void main(String[] args) {

        int miles, gas, totalMiles, totalGas;
        double average;
        totalGas = 0;
        totalMiles = 0;
        average = 0;
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter miles. Enter -1 to quit. ");
        miles = input.nextInt();

        if (miles != -1){
            System.out.print("Enter gas.");
            gas = input.nextInt();
            totalGas += gas;
            totalMiles += miles;
            System.out.printf("Miles per gallon for this trip: %.2f%n", (double)miles/(double)gas);

        }


        while (miles != -1){
            System.out.print("Enter miles. Enter -1 to quit.");
            miles = input.nextInt();

            if (miles != -1){
                System.out.print("Enter gas. ");
                gas = input.nextInt();

                totalGas += gas;
                totalMiles += miles;
                System.out.printf("Miles per gallon for this trip: %.2f%n", (double) miles/(double) gas);
            }}
        average = (double) totalMiles/(double)totalGas;

        System.out.printf("Overall miles per gallon %.2f%n", average);


        }
    }
