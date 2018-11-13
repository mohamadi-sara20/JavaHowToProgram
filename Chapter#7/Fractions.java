package ir.phgnight;
//Question 7.3 of the book
public class Fractions {
    public static void main(String[] args) {
        final int ArraySize = 10;
        double[] myArr = new double[ArraySize];
        double total = 0;
        System.out.printf("Element4: %f%n", myArr[3]);
        myArr[9] = 1.667;
        myArr[6] = 3.333;

        for(int x = 0; x <myArr.length; x++){
            total += myArr[x];
        }
        System.out.printf("Total: %f", total);
    }

    }
