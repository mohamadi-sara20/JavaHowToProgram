//(Inserting Elements in a LinkedList in Sorted Order) Write a program that inserts 25 ran-
//dom integers from 0 to 100 in order into a LinkedList object. The program should sort the ele-
//ments, then calculate the sum of the elements and the floating-point average of the elements.

package JavaHowToProgram.Chapter16;


import java.security.SecureRandom;
import java.util.Collections;
import java.util.LinkedList;

public class RandomLikedList {

    public static void main(String[] args) {

        SecureRandom rand = new SecureRandom();

        LinkedList<Integer> linkedList = new LinkedList<>();
        int number = 0;
        int sum = 0;
        double average = 0.0;
        for (int i = 0; i < 25; i++) {
            number = 1 + rand.nextInt(100);
            linkedList.add(number);
            Collections.sort(linkedList);
            sum += number;
        }

        System.out.print("Sorted Linked List: \n");
        for(Integer integer: linkedList)
            System.out.println(integer);

        System.out.printf("%s%d\t\t%s%d", "Sum:", sum,"Average:", sum/linkedList.size());



    }
}


