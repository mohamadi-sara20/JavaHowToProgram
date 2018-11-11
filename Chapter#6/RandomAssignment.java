package ir.phgnight;
import java.security.SecureRandom;

public class RandomAssignment {

    public static void main(String[] args) {

        SecureRandom rand = new SecureRandom();
        //part a
        int num = 1 + rand.nextInt(2);
        System.out.println(num);
        //part b
        num = 1 + rand.nextInt(100);
        System.out.println(num);
        //part c
        num = rand.nextInt(10);
        System.out.println(num);
        //part d
        num = 1000 + rand.nextInt(113);
        System.out.println(num);
        //part e
        num = -1 + rand.nextInt(3);
        System.out.println(num);
        //part f
        num = -3 + rand.nextInt(15);
        System.out.println(num);
    }}