//This is the answer to the below question; although, we did noy put the results in a table format due to it being urgent,
// but the functionality is the same as required. Only the representation is different from what's asked in the book.
//
//
//(Text Analysis) The availability of computers with string-manipulation capabilities has re-
//sulted in some rather interesting approaches to analyzing the writings of great authors. Much atten-
//tion has been focused on whether William Shakespeare ever lived. Some scholars believe there’s
//substantial evidence indicating that Christopher Marlowe actually penned the masterpieces attrib-
//uted to Shakespeare. Researchers have used computers to find similarities in the writings of these
//two authors. This exercise examines three methods for analyzing texts with a computer.
//a) Write an application that reads a line of text from the keyboard and prints a table indi-
//cating the number of occurrences of each letter of the alphabet in the text. For example,
//the phrase
//To be, or not to be: that is the question:
//b)contains one “a,” two “b’s,” no “c’s,” and so on.
//Write an application that reads a line of text and prints a table indicating the number
//of one-letter words, two-letter words, three-letter words, and so on, appearing in the
//text. For example, Fig. 14.25 shows the counts for the phrase
//Whether 'tis nobler in the mind to suffer
//c)Write an application that reads a line of text and prints a table indicating the number
//of occurrences of each different word in the text. The application should include the
//words in the table in the same order in which they appear in the text. For example, the
//lines
//To be, or not to be: that is the question:
//Whether 'tis nobler in the mind to suffer
//contain the word “to” three times, the word “be” two times, the word “or” once, etc.


package JavaHowToProgram.Chapter14;

import java.util.HashMap;
import java.util.Scanner;
public class FrequencyCounting {
    public static void main(String[] args){
        System.out.println(getLetterFrequency("sdfgst").get('s'));

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word/phrase/sentence!");
        String s = input.nextLine();


        HashMap<Integer, Integer> lengthFrequencies = new HashMap<Integer, Integer>();
        lengthFrequencies = getWordLengthFrequency(s);


        for(Integer key: lengthFrequencies.keySet()){
            System.out.printf("%s%s: %s%n", "Frequency of length", key, lengthFrequencies.get(key));
        }

        for(Object key: getLetterFrequency(s).keySet()){
            System.out.printf("%s%s: %d%n", "Frequency of ", key, getLetterFrequency(s).get(key));
        }


        for(Object key: getWordFrequency(s).keySet()){
            System.out.printf("%s%s: %s%n", "Frequency of ", key, getWordFrequency(s).get(key));
        }

    }



    public static HashMap getLetterFrequency(String s){
        HashMap <Character, Integer> FreqDict = new HashMap<Character, Integer>();

        for(int i = 0; i < s.length()-1; i++){

            if(FreqDict.containsKey(s.charAt(i))) {

                FreqDict.put(s.charAt(i), FreqDict.get(s.charAt(i)) + 1);

            }
            else
                FreqDict.put(s.charAt(i), 1);

        }

        return FreqDict;

    }


    public static HashMap getWordLengthFrequency(String s){
        HashMap <Integer, Integer> FreqDict = new HashMap<Integer, Integer>();
        String[] wordsArray = s.split(" ");

        for(int i = 0; i < wordsArray.length; i++){
            Integer val = FreqDict.get(wordsArray[i].length());

            if(FreqDict.containsKey(wordsArray[i].length())){
                FreqDict.put(wordsArray[i].length(), val + 1);
            }
            else{
                FreqDict.put(wordsArray[i].length(), 1);
            }

        }
        return FreqDict;
    }


    public static HashMap getWordFrequency(String s){
        HashMap <String, Integer> FreqDict = new HashMap<String, Integer>();
        String[] wordsArray = s.split(" ");

        for(int i = 0; i < wordsArray.length ; i++){
            Integer val = FreqDict.get(wordsArray[i]);
            if(FreqDict.containsKey(wordsArray[i]))
                FreqDict.put(wordsArray[i], val + 1);
            else
                FreqDict.put(wordsArray[i], 1);

        }
        return FreqDict;
    }



}
