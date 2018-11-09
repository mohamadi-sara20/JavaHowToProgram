package ir.phgnight;

public class Interest {
    public static void main(String[] args){
        double amount, rate, years, finalAmount;


        amount = 100;
        rate = 0.05;

        System.out.printf("%s%20s%n", "Year", "Amount on deposit");
        for (int r =5; r <= 10; r++) {
            rate = r * 0.01;
            for (int i = 1; i <= 10; i++) {
                years = i;
                finalAmount = amount * java.lang.Math.pow((1 + rate), years);
                System.out.printf("After %.2f year(s), the amount is: %.2f.%n", years, finalAmount);

            }
        }
}}
