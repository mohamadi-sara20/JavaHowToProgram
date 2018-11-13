package ir.phgnight;
//Question 7.4 of the book
public class Table {
    public static void main(String[] args) {
        int[][] table = new int[3][3];
        int counter = 0;
        for(int x = 0; x < table.length; x++){

            for(int y = 0; y < table[x].length; y++){
                counter += 1;
                table[x][y] = x + y;
                System.out.printf("Element[%d][%d]: %d%n",x, y, table[x][y]);
            }
        }

        System.out.printf("Number of elements equals %d. %n", counter);


    }

    }