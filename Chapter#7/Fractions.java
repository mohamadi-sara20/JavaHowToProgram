package ir.phgnight;
//Question 7.3 of the book
public class Fractions {
    public static void main(String[] args) {
        double[] ArraySize = new double[10];
        double total = 0;
        System.out.printf("Element4: %f%n", ArraySize[3]);
        ArraySize[9] = 1.667;
        ArraySize[6] = 3.333;

        for(int x = 0; x <ArraySize.length; x++){
            total += ArraySize[x];
        }
        System.out.printf("Total: %f", total);
    }

    }