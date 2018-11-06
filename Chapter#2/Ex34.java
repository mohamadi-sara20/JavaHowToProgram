package ir.phgnight;
//Calculates a sample payroll calculation.
import oracle.jrockit.jfr.events.DynamicValueDescriptor;

import java.util.Scanner;

public class Ex34 {


    public static void main(String[] args) {
        float worldpop;
        Ex34 pop = new Ex34();
        System.out.print(pop.estimatePopulation(1.06, (long)75000000000L, 1));


    }
    public double estimatePopulation(double growthRate, long currentPopulation, int year){
         return year* growthRate * currentPopulation;
    }

}








