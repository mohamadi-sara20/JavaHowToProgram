package ir.phgnight;

import java.util.Scanner;

public class squareOfAsteriks {
    public static int side;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side of your square!");
        side = input.nextInt();
        squareOfAsteriks(side);
    }


    public static void squareOfAsteriks(int side){
        for(int i = 1; i <= side; i++){
            for(int j = 1; j <=side ; j++){
                System.out.print("*");}
         System.out.println();}
    }
}