package JavaHowToProgram.Chapter18;

public class Collatz {

    public static void main(String[] args) {

        System.out.println(collatz(10));
        System.out.println(collatz(10));
        System.out.println(collatz(10));
    }


    public static int collatz(int n) {
        if (n == 1)
            return 1;

        else if (n % 2 == 0)
            return 1 + collatz(n / 2);

        else
            return 1 + collatz(3 * n + 1);
    }
}                                       