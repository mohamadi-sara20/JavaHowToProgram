package ir.phgnight;
import java.util.Scanner;

public class Expression {

    public static double expressionRes(int n){
        double e;
        e = 0;

        for (int i = 0; i <= n; i++){
            e += 1 / Factorial.computeFactorial(i);


        }
        return e;}


    public static double expression2Res(int n, double x){
        double e;
        e = 0;
        for(int i=0; i <=n; i++){
            e += Math.pow(x, i) / Factorial.computeFactorial(i);
        }

        return e;}
    }
