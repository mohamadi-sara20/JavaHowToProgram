package ir.phgnight;

import java.util.ArrayList;
import java.util.Arrays;
public class BruteForceQueens {
    public static final int size = 8;
    public static int[] queens = new int[size];

    public static void main(String[] args) {

        for(int i1 = 0; i1 < size; i1++){
            for(int i2 = 0; i2<size; i2++){
                for(int i3=0;i3<size; i3++){
                    for(int i4 = 0; i4 <size; i4++){
                        for(int i5 = 0; i5 <size; i5++){
                            for(int i6 = 0; i6 < size; i6++){
                                for(int i7 = 0; i7 < size; i7++){
                                    for(int i8 = 0; i8 <size; i8++){
                                        int[][] chessboard = new int[size][size];
                                        for (int l = 1; l <= size ; l++){
                                            for(int m = 1; m <= size; m++){
                                                chessboard[l-1][m-1] = 1;
                                            }
                                        }
                                        queens[0] = i1;
                                        emptyPlaces(chessboard, 0, i1, true);

                                        if(chessboard[1][i2] == 0)
                                            continue;
                                        queens[1] = i2;
                                        emptyPlaces(chessboard, 1, i2, true);

                                        if(chessboard[2][i3] == 0)
                                            continue;
                                        queens[2] = i3;
                                        emptyPlaces(chessboard, 2, i3, true);

                                        if(chessboard[3][i4] == 0)
                                            continue;
                                        queens[3] = i4;
                                        emptyPlaces(chessboard, 3, i4, true);

                                        if(chessboard[4][i5] == 0)
                                            continue;
                                        queens[4] = i5;
                                        emptyPlaces(chessboard, 4, i5, true);

                                        if(chessboard[5][i6] == 0)
                                            continue;
                                        queens[5] = i6;
                                        emptyPlaces(chessboard, 5, i6, true);

                                        if(chessboard[6][i7] == 0)
                                            continue;
                                        queens[6] = i7;
                                        emptyPlaces(chessboard, 6, i7, true);

                                        if(chessboard[7][i8] == 0)
                                            continue;
                                        queens[7] = i8;

                                        System.out.printf("Arrangement found! ");
                                        for(int k = 0; k < queens.length; k++)
                                            System.out.print(queens[k]);
                                        System.out.println();

                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }


    public static ArrayList<Integer> emptyPlaces(int[][] array, int ind1, int ind2, boolean found) {

        ArrayList<Integer> ar = new ArrayList<Integer>();

        for (int i = 0; i < size; i++) {
            ar.add(array[ind1][i]);
            if (found)
                array[ind1][i] = 0;
        }

        for (int j = 0; j < size; j++) {
            ar.add(array[j][ind2]);
            if(found)
                array[j][ind2] = 0;
        }

        for (int k = 0; k < size; k++){
            for(int p = 0; p <size; p++){
                if((p + k) == ind1 + ind2){
                    ar.add(array[k][p]);
                    if(found)
                        array[k][p] = 0;
                }
                if(k - p == ind1 - ind2){
                    ar.add(array[k][p]);
                    if(found)
                        array[k][p] = 0;
                }

            }
        }

        return ar;

    }
}

