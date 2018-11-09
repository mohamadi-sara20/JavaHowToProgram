package ir.phgnight;


import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        double salary, hours, salaryPerHour;


        Scanner input = new Scanner(System.in);

        for(int i=0; i<3; i++){
            System.out.print("How many hours did this employee work this month?");
            hours = input.nextDouble();
            System.out.print("How much does this employee get an hour?");
            salaryPerHour = input.nextDouble();
            if (hours <= 40)
                salary = (int)hours/10 * salaryPerHour * 10;
            else
                salary = (int) hours /10 * salaryPerHour * 10 + hours %40 * 1.5 * salaryPerHour;

            System.out.printf("Salary for this employee is: %.2f.%n", salary);

}}}
