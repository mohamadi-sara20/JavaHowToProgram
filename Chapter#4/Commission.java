package ir.phgnight;

//This program takes items a salesperson has sold one by one, and then calculates the commission and then the salary
//for that salesperson. It would have also been possible to input the overall amount of the sold items and then calcula-
//-te the commission.

import java.util.Scanner;

public class Commission {
    public static void main(String[] args) {
        double sold, s, commission;

        Scanner input = new Scanner(System.in);

        System.out.print("For the chosen salesperson, enter amount of items he's sold one by one. Enter -1 to exit.");
        sold = input.nextInt();
        if (sold == -1)
            System.out.print("No commission. This salesperson will get only 200$.");
        else{

            do{
                System.out.print("Enter the next amount! Enter -1 to exit!");
                s = input.nextInt();
                if (s == -1){
                    break;}
                else{
                    sold += s;
                    System.out.print(sold);}}
            while (sold != -1);


            commission = 9 * sold / 100 + 200;
            System.out.print(commission);}

    }

}