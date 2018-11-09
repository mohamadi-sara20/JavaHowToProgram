package ir.phgnight;


import java.util.Scanner;

public class DigitPalindrome {

    public static void main(String[] args) {
        int number;
        String num;
        boolean palindrome;
        palindrome = false;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number!");
        number = input.nextInt();

        if (String.valueOf(number).length()!= 5)
            while (String.valueOf(number).length() != 5)
                {System.out.print("Enter a new value!");
                number = input.nextInt();}

        num = Integer.toString(number);

        for (int i=0; i < (String.valueOf(number).length()-1)/2; i++){
            if(num.charAt(i) != num.charAt(String.valueOf(number).length()-(i+1)))
                break;
            else
                palindrome = true;}
        if (palindrome == true)
            System.out.print("You have a palindrome!");
        else
            System.out.print("Not a palindrome! Sorry!");






        }



    }