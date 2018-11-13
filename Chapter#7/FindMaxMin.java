package ir.phgnight;
//These two methods find the min and max in a mu
public class FindMaxMin {
    public static void main(String[] args) {
        final int ArraySize = 3;
        int[][] myArray = {{1, 7, 4}, {5, 12, 94}, {0, -5, 73}};

        System.out.println(findMin(myArray));
        System.out.println(findMax(myArray));

    }


    public static int findMin(int[][] array) {

        int minimum = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < minimum)
                    minimum = array[i][j];
            }
        }
        return minimum;


    }

    public static int findMax(int[][] array) {

        int maximum = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > maximum)
                    maximum = array[i][j];
            }
        }
        return maximum;


    }
}
