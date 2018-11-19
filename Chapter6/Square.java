package ir.phgnight;

import java.util.Scanner;

public class Square {
    public static int side;
    public static char filled;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side of your square and the your desire character to draw the square!");
        side = input.nextInt();
        filled = input.next().charAt(0);

        squareOfAsteriks(side, filled);
    }


    public static void squareOfAsteriks(int side, char filledChar){
        for(int i = 1; i <= side; i++){
            for(int j = 1; j <=side ; j++){
                System.out.print(filledChar);}
         System.out.println();}
    }
}