package ir.phgnight;
//Calculates a sample payroll calculation.

public class Ex35 {

    public static void main(String[] args) {
        Ex35 dailyCost= new Ex35();

        System.out.print(dailyCost.estimateCost(20, 9, 8,(float)4.6,(float)1.4));
    }

    public float estimateCost(float milesPerDay, int costPerGallon, int averageMilesPerGallon, float parkingFee, float tolls){
        return milesPerDay * parkingFee * tolls * costPerGallon * (milesPerDay/averageMilesPerGallon) * costPerGallon;

    }

}








