//(Prime Numbers and Prime Factors) Write a program that takes a whole number input
//from a user and determines whether it’s prime. If the number is not prime, display its unique prime728
//Chapter 16 Generic Collections
//factors. Remember that a prime number’s factors are only 1 and the prime number itself. Every
//number that’s not prime has a unique prime factorization. For example, consider the number 54.
//The prime factors of 54 are 2, 3, 3 and 3. When the values are multiplied together, the result is 54.
//For the number 54, the prime factors output should be 2 and 3. Use Set s as part of your solution.

package JavaHowToProgram.Chapter16;

import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number, please!");
        int number = input.nextInt();
        SortedSet<Integer> factors = new TreeSet<>();
        int c = 2;
        boolean flag = false;

        while (c < number) {

            flag = false;

            if ((number % c) == 0) {

                if (factors.isEmpty())
                    factors.add(c);

                else {
                    for (Integer integer : factors) {
                        if (c % integer == 0)
                            flag = true;
                    }

                    if(flag == false)
                        factors.add(c);
                }
            }
            c++;

        }


        if (factors.size() == 0)
            System.out.printf("%d is a prime number!", number);
        else
            System.out.print("Factors: ");
        for (Integer integer : factors)
            System.out.printf("%d ", integer);
    }
}
