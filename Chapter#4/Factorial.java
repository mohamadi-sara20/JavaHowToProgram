package ir.phgnight;
import java.util.Scanner;
public class Factorial {

    public static int computeFactorial(int n){
        int product = 1;
        if(n==0)
            return product;
        else
            for (int i = 1; i <=n; i++){
                product = i * product;}

        return product; }
}
