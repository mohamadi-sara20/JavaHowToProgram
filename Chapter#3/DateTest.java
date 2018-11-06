package ir.phgnight;
//a quick test of Date class.

public class DateTest {
    public static void main(String[] args){

        Date myRv = new Date(23, 11, 2013);
        System.out.printf("Our first date was on either %s or ", myRv.displayDate());
        myRv.setDay(25);
        myRv.setMonth(12);
        System.out.printf("on %s. %n", myRv.displayDate());




    }
}