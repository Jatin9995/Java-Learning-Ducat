package Ducat.ducat.Collections;

import java.util.ArrayDeque;
import java.util.Deque;

/*
Deque interface extends the Queue interface.
In Deque, we can remove and add the elements from both the side.
Deque stands for a double-ended queue which enables us to perform the operations at both the ends.
*/

public class Collection_deque {
    public static void main(String[] args) {

        Deque<String> d = new ArrayDeque<>();
        d.offer("Jatin");
        d.offerFirst("Vijit");
        d.offerLast("Shilpa");
        System.out.println(d);

        d.offerFirst("Deepu"); // Add element at the first of the queue.
        System.out.println(d);

        System.out.println("After offerfirst Traversal: "); // for-each loop to print elements
        for (String s : d) {
            System.out.println(s);

        }

        d.pollFirst(); // Remove element from the first of the queue.
        System.out.println(d);

        d.pollLast(); // Remove element from the last of the queue.
        System.out.println(d);

        System.out.println("After pollfirst and pollLast Traversal: "); // for-each loop to print elements
        for (String s : d) {
            System.out.println(s);

        }

    }

}
