package ir.phgnight;

//method sumColumn returns the sum of a specific column by index.
//It gets an array and a number which is the index of the column whose sum we desire.
//method display prints the array in a table format. 


public class SumColumn {
    public static void main(String[] args) {
        int[][] myArray = {{67, 26, -56}, {51, 34, 91}};
        System.out.println(sumColumn(myArray, 1));
        display(myArray);

    }

    public static int sumColumn(int[][] array, int n) {
        int sum = 0;
        for (int i = 0; i < array.length; i++)
            sum += array[i][n];

        return sum;
    }

    public static void display(int[][] array) {
        int m = array[0].length;

        for (int i = 0; i < array.length; i++) {
            if (array[i].length > m)
                m = array[i].length;
        }

        for (int i = 0; i < m; i++)
            System.out.printf("%12s %d", "column#", i + 1);


        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.printf("row#%d", i + 1);
            for (int j = 0; j < array[i].length; j++)
                System.out.print("   " + array[i][j] + "         ");
            System.out.println();
        }


    }
}
