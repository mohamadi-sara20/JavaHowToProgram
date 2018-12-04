//(Counting Duplicate Words) Write a program that determines and prints the number of
//duplicate words in a sentence. Treat uppercase and lowercase letters the same. Ignore punctuation.


package JavaHowToProgram.Chapter16;
import java.util.*;

public class CountDuplicateWords {


    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence!");

        String sentence = input.nextLine();

        System.out.println(refineDuplicates(sentence));
    }


    public static String refineDuplicates(String sentence){

        sentence = sentence.toLowerCase().replaceAll("[!?.,\\(\\):;-]", "");
        String[] words = sentence.split(" ");

        HashMap<String, Integer> Duplicates = new HashMap<>();
        HashMap<String, Integer> freq = new HashMap<>();
        int c = 0;

        for(String word: words)
            if(freq.containsKey(word)) {
                Duplicates.put(word, 1);
                c+=1;
            }

            else
                freq.put(word, 1);

        String finalSentence = "";
        for(String word: words) {
            if(!Duplicates.containsKey(word))
                finalSentence += word + " ";

        }
        return finalSentence;
    }


}




