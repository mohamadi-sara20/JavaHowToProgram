package ir.phgnight;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        System.out.printf("%s%10s%10s%10s%n", "n", "10*n", "100*n", "1000*n");
        for(int i = 1; i <=5; i++){
            System.out.printf("%d%10d%10d%10d%n", i, i*10, i * 100, i * 1000);



        }
    }}
