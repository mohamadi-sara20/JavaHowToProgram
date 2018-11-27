package JavaHowToProgram.Chapter14;

public class DateReader {
    public static void main(String[] args){
        System.out.println(dateReader("04/5/1996"));
        System.out.println(dateReader("12/25/2018"));
        System.out.println(dateReader("01/29/2012"));



    }



    public static String dateReader(String date){
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September","October", "Novermber", "December"};
        String dateFormatted = "";
        String[] arrayDate = date.split("/");

        dateFormatted += months[Integer.parseInt(arrayDate[0])-1] + " " + arrayDate[1] + " " + arrayDate[2];
        return dateFormatted;
    }
}




