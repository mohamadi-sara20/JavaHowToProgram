//(Converting int Values to Characters) Write an application that inputs an integer code for
//a character and displays the corresponding character. Modify this application so that it generates all
//possible three-digit codes in the range from 000 to 255 and attempts to print the corresponding
//characters.
package JavaHowToProgram.Chapter14;

public class DigitToChar {
    public static void main(String[] args){

        System.out.println(intToCharConverter(0));
        System.out.println(intToCharConverter(13));
        System.out.println(intToCharConverter(100));
        System.out.println(intToCharConverter(199));
        System.out.println(intToCharConverter(255));
        System.out.println(intToCharConverter(256));

    }

    public static char intToCharConverter(int digit){
        char code = (char) ( digit + '0');
        return code;
    }

}


