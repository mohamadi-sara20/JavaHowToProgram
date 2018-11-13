package ir.phgnight;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

//method sumColumn returns the sum of a specific column by index.
//It gets an array and a number which is the index of the column whose sum we desire.


public class SumColumn {
    public static void main(String[] args) {
        int[][] myArray = {{67, -56}, {51, 34, 91}};
        System.out.print(sumColumn(myArray, 1));
    }

    public static int sumColumn(int[][] array, int n) {
        int sum = 0;
        for (int i = 0; i < array.length; i++)
            sum += array[i][n];

        return sum;
    }
}