package ir.phgnight; 

import java.util.Scanner;

public class TestMathMethods {
    public static int a;
    public static Double b;

    public static void main(String[] args){
        a = -1;
        b = 5.87;

        System.out.printf("abs method %d%n", Math.abs(a));
        System.out.printf("ceil method %.2f%n", Math.ceil(b));
        System.out.printf("floor method %.2f%n", Math.floor(b));
        System.out.printf("cosine method %.2f%n", Math.cos(a));
        System.out.printf("sinus method %.2f%n", Math.sin(a));
        System.out.printf("exp method %.2f%n", Math.exp(a));
        System.out.printf("log method %.2f%n", Math.log(a));
        System.out.printf("Max method %.2f%n", Math.max(a, b));
        System.out.printf("Min method %.2f%n", Math.min(a, b));
        System.out.printf("Pow method %.2f%n", Math.pow(a, 2));
        System.out.printf("Square method %.2f%n", Math.sqrt(a));
        System.out.printf("Tangent method %.2f%n", Math.tan(a));



    }


}
