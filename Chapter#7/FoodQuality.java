//Twenty students were asked to rate on a scale of 1 to 5 the quality of the food in the
//student cafeteria, with 1 being “awful” and 5 being “excellent.” Place the 20 responses
//in an integer array and determine the frequency of each rating. We also depicted the 
//frequency with stars for each case.
package ir.phgnight;
import java.util.Scanner;

public class FoodQuality {
    public static void main(String[] args) {
        int[] myArray = new int[5];

        Scanner input = new Scanner(System.in);
        for(int i = 0; i <20; i++) {
            System.out.print("Enter the 20 scores here! Scores are between 1-5!");
            int num = input.nextInt();
            try {
                myArray[num - 1] += 1;
            }
            catch (ArrayIndexOutOfBoundsException exception){
                System.out.printf("%d is not within the score range! Enter another number within the range!", num);
                num =  input.nextInt();
            }
        }

        System.out.printf("%5s  %10s%n", "Score", "Frequency");
        for (int i=0; i <myArray.length; i++){{
            System.out.printf("%5d  %10d:    ",i+1, myArray[i]);
            for(int j = 0; j <myArray[i]; j++){
                System.out.print("*");
            }
            System.out.println();

            }


        }


    }

}

