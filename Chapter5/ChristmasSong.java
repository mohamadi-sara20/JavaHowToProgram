package ir.phgnight;
import java.util.Scanner;

public class ChristmasSong {
    public static void main(String[] args) {
        int day ;
        for(day = 1; day <=12; day++) {
            System.out.print("On the ");
            switch (day) {
                case 1:
                    System.out.print(Integer.toString(day) + "st");
                    break;

                case 2:
                    System.out.print(Integer.toString(day) + "nd");
                    break;
                case 3:
                    System.out.print(Integer.toString(day) + "rd");
                    break;
                default:
                    System.out.print(Integer.toString(day) + "th");
            }
            System.out.print(" day of Christmas, my true love sent to me: \n");

    switch (day){

        case 12:
            System.out.print("12 Drummers Drumming\n");
        case 11:
            System.out.print("11 Pipers Piping\n");
        case 10:
            System.out.print("10 Lords a Leaping\n");
        case 9:
            System.out.print("9 Ladies Dancing\n");
        case 8:
            System.out.print("8 Maids a Milking\n");
        case 7:
            System.out.print("7 Swans a Swimming\n");
        case 6:
            System.out.print("6 Geese a Laying\n");
        case 5:
            System.out.print("5 Golden Rings\n");
        case 4:
            System.out.print("4 Calling Birds\n");
        case 3:
            System.out.print("3 French Hens\n");
        case 2:
            System.out.print("2 Turtle Doves\n");
        case 1:
            System.out.print("A Partridge in a Pear Tree\n");

    }

    }}}