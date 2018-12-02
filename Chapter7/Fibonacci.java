package ir.phgnight;

public class Fibonacci {
    public static void main(String[] args) {
        
        System.out.print(fibonacci(3));
    }



    public static int fibonacci(int n){

        if(n <= 1)
            return 1;

        else
            return fibonacci(n-1) + fibonacci(n-2);



    }
}

