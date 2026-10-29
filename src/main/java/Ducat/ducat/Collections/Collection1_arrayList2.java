package Ducat.ducat.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Collection1_arrayList2 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>(); // Creating arraylist
        list.add("Jatin"); // adding object to arraylist
        list.add("Vijit");
        list.add("Shilpa");
        list.add("Nitish");
        list.add("Vivek");
        list.add("Aayush");
        list.add("Jatin");

        // Arraylist also maintain the insertion order.
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

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("Vikas");
        list2.add("Unnati");
        list2.add("Pragati");
        list2.add("Shanti");
        list2.add("Ravi");
        list2.add("Jatin");

        // Adding new elements to arraylist. addAll method is used to add all elements
        // of one

        list.addAll(list2);
        System.out.println(list);

        // Removing all new elements from arraylist. removeAll method is used to remove
        // all
        list.removeAll(list2);
        System.out.println(list);

        // Removing all elements from arraylist. clear method is used to remove all

        list.clear();
        System.out.println(list);

        // checking whether arraylist is empty or not. isEmpty method is used to check
        // whether arraylist is empty or not.
        System.out.println(list.isEmpty());

        // checking whether arraylist contains particular element or not. contains
        // method is used to check whether arraylist contains particular element or not.
        System.out.println(list.contains("Jatin"));

        // getting the size of arraylist. size method is used to get the size of
        System.out.println(list.size());

    }

}
