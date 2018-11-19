package ir.phgnight;
//Calculates a sample payroll calculation.
import java.util.Scanner;

public class Ex32 {

    public static void main(String[] args) {
        int a, b, c, d, e, odd, even, zero;

        even =0;
        odd=0;
        zero = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number!");
        a = input.nextInt();
        if (a%2==0){even = even +1;}
        if (a%2 ==1){odd = odd +1;}
        if (a==0){zero=zero+1;}

        System.out.print("Enter a number!");
        b = input.nextInt();
        if (b%2==0){even = even +1;}
        if (b%2 ==1){odd = odd +1;}
        if (a==0){zero=zero+1;}

        System.out.print("Enter a number!");
        c = input.nextInt();
        if (c%2==0){even = even +1;}
        if (c%2 ==1){odd = odd +1;}
        if (c==0){zero=zero+1;}

        System.out.print("Enter a number!");
        d = input.nextInt();
        if (d%2==0){even = even +1;}
        if (d%2 ==1){odd = odd +1;}
        if (d==0){zero=zero+1;}

        System.out.print("Enter a number!");
        e = input.nextInt();
        if (e%2==0){even = even +1;}
        if (e%2 ==1){odd = odd +1;}
        if (e==0){zero=zero+1;}

        System.out.printf("Odd: %d%nEven: %d%nZero %d%n", odd, even,zero
        );



    }}









