//(Morse Code) Perhaps the most famous of all coding schemes is the Morse code, developed
//by Samuel Morse in 1832 for use with the telegraph system. The Morse code assigns a series of dots
//and dashes to each letter of the alphabet, each digit, and a few special characters (e.g., period, com-
//ma, colon, semicolon). In sound-oriented systems, the dot represents a short sound and the dash a
//long sound. Other representations of dots and dashes are used with light-oriented systems and sig-
//nal-flag systems. Separation between words is indicated by a space or, simply, the absence of a dot
//or dash. In a sound-oriented system, a space is indicated by a short time during which no sound is
//transmitted. The international version of the Morse code appears in Fig. 14.26.
//Write an application that reads an English-language phrase and encodes it into Morse code.
//Also write an application that reads a phrase in Morse code and converts it into the English-lan-
//guage equivalent. Use one blank between each Morse-coded letter and three blanks between each
//Morse-coded word.


package JavaHowToProgram.Chapter14;
import java.util.Arrays;

public class MorseCode {
    public static Character[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
            'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
    public static String[] morseAlphabet = {".-", "-...", "-.-.","-..",".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
            "-." , "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
            ".----","..---", "..---", "....-", ".....", "-....", "--...", "---..", "----.", "-----"};

    public static void main(String[] args) {
        System.out.println(converToMorseCode("HELLO"));
        System.out.println(convertToEnglish("... .. -"));
    }


    public static String converToMorseCode(String utterance){

        int index = 0;
        String morseUtteranc = "";

        for(int i = 0; i < utterance.length(); i++) {
            index = Arrays.asList(alphabet).indexOf(utterance.charAt(i));
            morseUtteranc += morseAlphabet[index];
        }
        return morseUtteranc;

    }

    public static String convertToEnglish(String morseUtterance){
        //We assume the morse utterance has a space boundary between its words.
        int index = 0;
        String englishUtterance = "";
        String[] morse = morseUtterance.split(" ");

        for(int i = 0; i < morse.length; i++) {
            index = Arrays.asList(morseAlphabet).indexOf(morse[i]) - 1;
            englishUtterance += alphabet[index];
        }
        return englishUtterance;

    }


}
