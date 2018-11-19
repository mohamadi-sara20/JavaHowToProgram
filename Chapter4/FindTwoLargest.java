package ir.phgnight;


import java.util.Scanner;

public class FindTwoLargest {

    public static void main(String[] args) {
        int counter;
        Double number;
        Double largest = null;
        Double secondLargest = null;
        Double temp;
        Scanner input = new Scanner(System.in);
        temp = Double.MIN_VALUE;

        for (counter =1; counter <= 9; counter++) {
            System.out.print("Enter a number!");
            number = input.nextDouble();
            if (counter==1)
                largest = number;
            else if (counter==2){
                secondLargest = number;
                if (secondLargest > largest)
                    temp = largest;
                    largest = secondLargest;
                    secondLargest = temp;}

            else {
                if (largest < number && number > secondLargest)
                    largest = number;
                else if (number> secondLargest && number < largest)
                    secondLargest = number;
            }

        }

        System.out.printf("Largest Number: %.2f.%n", largest);
        System.out.printf("Second Largest Number: %.2f.%n", secondLargest);

    }}

