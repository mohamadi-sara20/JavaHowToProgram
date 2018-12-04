//For this problem, we used two methods:
// Once we used Collections.sort() method to sort the elements each time we insert a new element.
//Once we used our own method(sortInsert) which finds the correct place for the item to be inserted.
//
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
        LinkedList<Integer> linkedList2 = new LinkedList<>();

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

        for (int i = 0; i < 25; i++) {
            number = 1 + rand.nextInt(100);
            sortedInsert(linkedList2, number);
            sum += number;
        }


        System.out.print("Sorted Linked List: \n");
        for(Integer integer: linkedList2)
            System.out.println(integer);

        System.out.printf("%s%d\t\t%s%d", "Sum:", sum,"Average:", sum/linkedList2.size());

    }

    public static void sortedInsert(LinkedList<Integer> linkedList, int element){

        if(linkedList.size() == 0)
            linkedList.add(element);

        else if(linkedList.get(0) >= element)
            linkedList.add(0, element);

        else if(linkedList.get(linkedList.size()-1) <= element)
            linkedList.add(linkedList.size(), element);

        else {
            int i = 0;
            while (linkedList.get(i) <= element)
                i++;
            linkedList.add(i,  element);

    }

}
}




