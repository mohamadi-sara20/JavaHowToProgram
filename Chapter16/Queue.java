//(Changing a PriorityQueue ’s Sort Order) The output of Fig. 16.15 shows that Priority-
//Queue orders Double elements in ascending order. Rewrite Fig. 16.15 so that it orders Double ele-
//ments in descending order (i.e., 9.8 should be the highest-priority element rather than 3.2 ).


package JavaHowToProgram.Chapter16;
import java.util.Collections;
import java.util.PriorityQueue;
public class Queue {
    public static void main(String[] args)
    {
        PriorityQueue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.offer(3.2);
        queue.offer(9.8);
        queue.offer(5.4);
        System.out.print("Polling from queue: ");
        while ( queue.size() > 0)
        {
            System.out.printf("%.1f ", queue.peek() ); // view top element
            queue.poll(); // remove top element
        }
    }
}

