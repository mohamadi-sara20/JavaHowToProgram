package ir.phgnight;
import java.security.SecureRandom;
import java.util.Scanner;

public class CommissioArray {

    public static void main(String[] args) {
        double s, commission;
        int[] myArray = new int[10];

        Scanner input = new Scanner(System.in);

        System.out.print("For the chosen salesperson, enter the overall amount of items he's sold. Enter -1 to exit.");
        s = input.nextInt();
        if (s == -1) {
            System.out.print("No commission. This salesperson will get only 200$.");

        }

        else{

            do{

                commission = 9 * s / 100 + 200;
                System.out.println(commission + "       ");

                if(((int) commission /100) <10 && ((int)commission/100)>=2)
                    myArray[(int)commission/100] += 1;
                else
                    myArray[myArray.length-1] += 1;

                System.out.print("Enter the next amount! Enter -1 to exit!");
                s = input.nextInt();

            }
                while (s != -1);
        }

        for(int i = 1; i < myArray.length; i++){
            System.out.printf("%-2d-%-2d    %d",  (i+1) * 100, (i+1) * 100 + 99,myArray[i]);
            System.out.println();}


}
}
