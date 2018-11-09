package ir.phgnight;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.util.ArrayList;
import java.util.Scanner;
public class BarAsteriks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList arrlist = new ArrayList(5);

        for(int i = 0; i < 5; i++){
            System.out.print("Enter a numebr between 1 and 30!");
            int a = input.nextInt();
            arrlist.add(i, a);}

        for(int i=0; i < arrlist.size(); i++){
            for(int j=0; j < (int) arrlist.get(i); j++)
                System.out.print("*");
            System.out.println();




        }

    }}