package ir.phgnight;
import java.util.Scanner;
import java.security.SecureRandom;

public class Coin {

    public enum State {Heads, Tails};

    public static void main(String[] args) {

        int c1 = 0;
        int c2 = 0;

        for (int i = 0; i <1000; i++){
            if(flip()==State.Tails)
                c1 += 1;
            else
                c2 += 1;
        }
        System.out.printf("Tails: %d%nHeads:%d ", c1, c2);
    }


    public static State flip(){

        SecureRandom rand = new SecureRandom();
         int coin = rand.nextInt(2);
         if (coin == 0)
             return State.Heads;
         else
             return State.Tails; }

    }
