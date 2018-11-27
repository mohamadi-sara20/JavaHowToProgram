package JavaHowToProgram.Chapter18;

public class GCD {
    public static void main(String[] args){
        System.out.println(gcd(2061517, 624129));
    }


    public static int gcd(int a, int b) {

        if (a % b == 0)
            return b;
        else
            return gcd (a, a % b);
    }
}
