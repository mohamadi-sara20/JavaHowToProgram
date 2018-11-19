package ir.phgnight;


import java.util.Scanner;
import java.util.Arrays;
public class Dup {
    public static void main(String[] args) {
        int a;
        int[] array = new int[5];
        Arrays.fill(array, -1);
        boolean isDup = false;
        Scanner input = new Scanner(System.in);


        for(int i = 0; i < array.length; ){
            isDup = false;
            System.out.println("Enter a number between 1-100;");
            a = input.nextInt();
            if(a>100 || a<1)
                System.out.print("Invalid number! Enter a number in range 1-100!");

            else {
                for (int j = 0; j < i; j++) {
                    if (array[j] == a) {
                        System.out.print("Duplicate element! ");
                        isDup = true;
                    }
                }
                if (!(isDup))
                    array[i] = a;
                i++;
            }
        }
    }
}



