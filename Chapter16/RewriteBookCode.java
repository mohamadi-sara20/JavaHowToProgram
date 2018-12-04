//Rewrite lines 16–25 in Fig. 16.3 to be more concise by using the asList method and the
//LinkedList constructor that takes a Collection argument:::
//
//
//String[] colors =
//{"black", "yellow", "green", "blue", "violet", "silver"};
//List<String> list1 = new LinkedList<>();
//for (String color : colors)
//list1.add(color);
//// add colors2 elements to list2
//String[] colors2 =
//{"gold", "white", "brown", "blue", "gray", "silver"};
//List<String> list2 = new LinkedList<>();
//for (String color : colors2)
//list2.add(color);
package JavaHowToProgram.Chapter16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class RewriteBookCode {
   public static void main(String[] args){
       String[] colors = {"black", "yellow", "green", "blue", "violet", "silver"};
       List<String> list1 = new LinkedList<>(Arrays.asList(colors));

       String[] colors2 = {"gold", "white", "brown", "blue", "gray", "silver"};
       List<String> list2 = new LinkedList<>(Arrays.asList(colors2));


   }


}
