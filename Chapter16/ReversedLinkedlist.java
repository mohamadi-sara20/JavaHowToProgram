//We used two ways to solve this problem:
//Once we copied the linkelist into another linked list and then used .reverse() to reverse the characters.
//Once we used a while loop and .add() method to push the characters in a reversed order into the second list.
// (Copying and Reversing LinkedLists) Write a program that creates a LinkedList object of
//10 characters, then creates a second LinkedList object containing a copy of the first list, but in re-
//verse order.
//


package JavaHowToProgram.Chapter16;

import java.util.*;

public class ReversedLinkedlist {

    public static void main(String[] args){

        LinkedList<Character> linkedList = new LinkedList<>(Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'));
        LinkedList<Character> reversedLinkedList = new LinkedList<>();
        LinkedList<Character> reversedLinkedList2 = new LinkedList<>();

        reversedLinkedList = linkedList;
        Collections.reverse(reversedLinkedList);

        System.out.println("Reversed using '.reverse()' method: ");

        for(Character character: reversedLinkedList)
            System.out.println(character);

        int c = 0;
        while (c < linkedList.size()) {
            reversedLinkedList2.add(linkedList.get(linkedList.size() - c - 1));
            c++;

        }

        System.out.println("Reversed using an iterator: ");

        for(Character character: reversedLinkedList)
            System.out.println(character);


    }
}

