//(Sorting Words with a TreeSet ) Write a program that uses a String method split to to-
//kenize a line of text input by the user and places each token in a TreeSet . Print the elements of the
//TreeSet . [Note: This should cause the elements to be printed in ascending sorted order.]

package JavaHowToProgram.Chapter16;

import java.util.*;

public class WordsSort {

    public static void main(String[] args){
        String sentence;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence please!");
        sentence = input.nextLine();
        sentence = sentence.toLowerCase().replaceAll("[.,:;//)//(?!]", "");
        SortedSet<String> set = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
        String[] sent = sentence.split(" ");
        set.addAll(Arrays.asList(sent));
        for(String word: set)
            System.out.println(word);




    }
}
