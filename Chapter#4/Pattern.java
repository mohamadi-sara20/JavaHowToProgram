package ir.phgnight;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        int rows = 8;

        for(int i = 0; i <rows; i++){
            if(i%2 == 0){
                for(int j=0; j <8; j++)
                System.out.print("* ");}

            else
            {System.out.print(" ");
            for(int j=0; j <8; j++)
                System.out.print("* ");}
            System.out.println();
            
        }

        }
    }

