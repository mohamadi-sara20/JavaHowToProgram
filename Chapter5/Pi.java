package ir.phgnight;

public class Pi {
    public static void main(String[] args) {
        double e;
        e = 4;
        for (int i = 3; i <= 300000; i+=4) {
            e += ((double) -4/i) + ((double) 4/(i+2));
            System.out.printf("Round: %d    %f%n", i, e);
        }
        System.out.print(e);
}}
