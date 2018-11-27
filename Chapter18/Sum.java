package JavaHowToProgram.Chapter18;

public class Sum {

    public static void main(String[] args){

        System.out.println(sum(5));
        System.out.println(sum(2));
        System.out.println(sum(0));
        System.out.println(sum(1));
        System.out.println(sum(10));

    }

    public static int sum(int n){
        if(n <=1)
            return n;
        else
            return n + sum(n-1);

    }
}
