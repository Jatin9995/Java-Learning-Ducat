package Ducat.ducat.Collections;

import java.util.Comparator;
import java.util.PriorityQueue;

/*
Queue interface maintains the first-in-first-out order.
There are various classes like priorityqueue, linkedlist, arraydeque which implements the queue interface,.
poll(): It is used to retrieves and removes the head of this queue, or returns null if this queue is empty.
peek(): It is used to retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.

The PriorityQueue class implements the Queue interface.
It holds the elements or objects which are to be processed by their priorities.
PriorityQueue doesn't allow null values to be stored in the queue.
The elements in PriorityQueue must be of Comparable type.
String and Wrapper classes are Comparable by default.
To add user-defined objects in PriorityQueue, you need to implement Comparable interface.
 // Priorityqueue works on minheep data structure. data saved in binarytree in
        // minheep structure.
        // minheep means that the smallest element is always at the top of the queue.
        // It is used to maintain the order of elements in ascending order.
*/

public class Collection_queue1 {
    public static void main(String[] args) {

        PriorityQueue<Integer> pg = new PriorityQueue<>();
        pg.offer(12);
        pg.offer(10);
        pg.offer(14);
        pg.offer(11);
        pg.offer(20);
        pg.add(25);

        System.out.println(pg);

        // isi tarah maxheep datastructure mein data save hota hai. Maxheep means that
        // the largest element is always at the top of the queue. uski liye "Comparator"
        // method use hota hai. Comparator.reverseorder();

        PriorityQueue<Integer> pg1 = new PriorityQueue<>(Comparator.reverseOrder());
        pg1.offer(12);
        pg1.offer(10);
        pg1.offer(14);
        pg1.offer(11);
        pg1.offer(20);
        pg1.add(25);

        System.out.println(pg1);
    }
}
