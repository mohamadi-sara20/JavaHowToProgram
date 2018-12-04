//(Counting Letters) Modify the program of Fig. 16.18 to count the number of occurrences
//of each letter rather than of each word. For example, the string "HELLO THERE" contains two Hs, three
//Es, two L s, one O, one T and one R. Display the results.

package JavaHowToProgram.Chapter16;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class CountLetter {
    public static void main(String[] args) {

        Map<Character, Integer> myMap = new HashMap<>();
        createMap(myMap);
        displayMap(myMap);
    }


    private static void createMap(Map<Character, Integer> map) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        input = input.toLowerCase();


        for (int i = 0; i < input.length(); i++) {

            if (map.containsKey(input.charAt(i))) {
                int count = map.get(input.charAt(i));

                map.put(input.charAt(i), count + 1);
            } else {
                if (input.charAt(i) != ' ')
                    map.put(input.charAt(i), 1);
            }
        }
    }

    private static void displayMap(Map<Character, Integer> map) {
        Set<Character> keys = map.keySet();
        TreeSet<Character> sortedKeys = new TreeSet<>(keys);
        System.out.printf("%nMap contains:%nKey\t\t\t\tValue%n");

        for (Character key : sortedKeys)
            System.out.printf("%-10s%10s%n", key, map.get(key));


    }
}