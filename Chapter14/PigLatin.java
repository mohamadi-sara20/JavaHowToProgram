//(Pig Latin) Write an application that encodes English-language phrases into pig Latin. Pig
//Latin is a form of coded language. There are many different ways to form pig Latin phrases. For
//simplicity, use the following algorithm:
//To form a pig Latin phrase from an English-language phrase, tokenize the phrase into words
//with String method split. To translate each English word into a pig Latin word, place the first
//letter of the English word at the end of the word and add the letters “ay.” Thus, the word “jump”
//becomes “umpjay,” the word “the” becomes “hetay,” and the word “computer” becomes “omputer-
//cay.” Blanks between words remain as blanks. Assume the following: The English phrase consists of
//words separated by blanks, there are no punctuation marks and all words have two or more letters.
//Method printLatinWord should display each word. Each token is passed to method printLatin-
//Word to print the pig Latin word. Enable the user to input the sentence.

package JavaHowToProgram.Chapter14;
import java.util.Scanner;
public class PigLatin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String pigSentence = "";
        for(String string: sentenceTokenizer(sentence))
            pigSentence += printLatinWord(string) + " ";

        System.out.printf("%s: %s", "Pig latin equivalent:", pigSentence);

    }

    public static String printLatinWord(String word){
        String pigWord = word.substring(1, word.length()) + word.substring(0, 1) +   "ay";
        return pigWord;
    }

    public static String[] sentenceTokenizer(String sentece){
        sentece = sentece.toLowerCase();
        return sentece.split(" ");


    }

}