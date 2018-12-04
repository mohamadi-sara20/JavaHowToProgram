// (Duplicate Elimination) Write a program that reads in a series of first names and eliminates
//duplicates by storing them in a Set . Allow the user to search for a first name.

package JavaHowToProgram.Chapter16;

import java.util.*;
import java.util.Scanner;


public class Duplicate {
    public static void main(String[] args) {
        String name;
        Set<String> set = new HashSet<>();
        Scanner input = new Scanner(System.in);

        while (input.hasNext()) {
            name = input.next();
            set.add(name.toLowerCase());
        }

        for (String set1 : set)
            System.out.println(set1);


        System.out.println(searchName(set, "Sara"));
        System.out.println(hasName(set, "Sara"));


    }

    public static int searchName(Set<String> set, String firstName) {

        SortedSet<String> finalSet = new TreeSet<>(set);
        firstName = firstName.toLowerCase();
        int count = 0;
        Iterator iterator = finalSet.iterator();

        while (iterator.hasNext()) {
            count += 1;
            if (iterator.next().equals(firstName))
                return count - 1;
        }

        return -1;
    }
    public static boolean hasName(Set<String> set, String firstName){

        SortedSet<String> finalSet = new TreeSet<>(set);
        firstName = firstName.toLowerCase();
        Iterator iterator = finalSet.iterator();

        while (iterator.hasNext()){
            if(iterator.next().equals(firstName))
                return true;
        }
        return false;

    }
}
