package JavaHowToProgram.Chapter18;

public class Power {

    public static void main(String[] args){

        System.out.println(power(2, 3));
        System.out.println(power(2, 8));
        System.out.println(power(3, 3));


    }


    public static int power(int a, int b){
        if(b == 1)
            return a;
        else
            return a * power(a, b-1);

    }
}
