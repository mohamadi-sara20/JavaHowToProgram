package JavaHowToProgram.Chapter18;

import java.util.ArrayList;
import java.util.Arrays;

public class Fibonacci {
    private static ArrayList<Integer> x = new ArrayList<>();

    public static void main(String[] args) {
        int n = 10;
        for(int i = 0; i < n; i++)
            System.out.println(fibonacci(i));



    }


        public static int fibonacci ( int n) {

            if (n <= 1)
                return 1;
            else
                return fibonacci(n - 1) + fibonacci(n - 2);




            }

        }



