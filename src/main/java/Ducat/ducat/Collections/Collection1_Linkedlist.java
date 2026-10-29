package Ducat.ducat.Collections;

import java.util.Collections;
import java.util.LinkedList;

public class Collection1_Linkedlist {

    public static void main(String[] args) {

        // Linked list is just like the array list.
        // Linked list is used to store the data in the form of doubly linked list.
        // Doubly linked list is used to store the data in the form of nodes. Each node
        // contains data and address of next and previous node. Linked list is used to
        // store the data in the form of nodes.

        LinkedList<String> list = new LinkedList<String>(); // Creating LinkedList
        list.add("Jatin"); // adding object to arraylist
        list.add("Vijit");
        list.add("Shilpa");
        list.add("Nitish");
        list.add("Vivek");
        list.add("Aayush");
        list.add("Jatin");

        System.out.println(list);

        // changing the element. set is used to change the element at particular index.
        // that particular element will be removed and new element will be added at that
        // index.
        list.set(1, "testJatin");
        System.out.println(list);

        // adding the element at particular index. rest elements will be shifted to
        // right.
        list.add(1, "Vijit");
        System.out.println(list);

        // Traversing list using for-each loop
        for (String n : list) {
            System.out.println(n);

        }

        // sorting the list. List will be aligned in asending order.
        Collections.sort(list);
        System.out.println(list);

        // Removing specific element from list. remove method is used to remove the
        // element from list.
        list.remove("testJatin");
        System.out.println(list);

        // Removing element at particular index. remove method is used to remove the
        list.remove(0);
        System.out.println(list);

        LinkedList<String> list2 = new LinkedList<String>();
        list2.add("Vikas");
        list2.add("Unnati");
        list2.add("Pragati");
        list2.add("Shanti");
        list2.add("Ravi");
        list2.add("Jatin");

        // Adding new elements to LinkedList. addAll method is used to add all elements
        // of one

        list.addAll(list2);
        System.out.println(list);

        // Removing all new elements from LinkedList. removeAll method is used to remove
        // all
        list.removeAll(list2);
        System.out.println(list);

        // Removing all elements from LinkedList. clear method is used to remove all

        list.clear();
        System.out.println(list);

        // checking whether LinkedList is empty or not. isEmpty method is used to check
        // whether LinkedList is empty or not.
        System.out.println(list.isEmpty());

        // checking whether LinkedList contains particular element or not. contains
        // method is used to check whether LinkedList contains particular element or
        // not.
        System.out.println(list.contains("Jatin"));

        // getting the size of LinkedList. size method is used to get the size of
        System.out.println(list.size());

    }

}
