package ir.phgnight;
import java.security.SecureRandom;

public class RandGen {

    public static void main(String[] args) {

        SecureRandom rand = new SecureRandom();
        //part a
        int num = 2 + 2* rand.nextInt(5);
        System.out.println(num);
        //part b
        num = 3 + 2 * rand.nextInt(5);
        System.out.println(num);
        //part c
        num = 6 + 4 * rand.nextInt(5);
        System.out.println(num);
    }}