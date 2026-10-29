package Ducat.ducat.Collections;

import java.util.Vector;

public class Collection1_vector {
    public static void main(String[] args) {
        /*
         * Vector is a legacy, synchronized dynamic array. ArrayList is its modern,
         * non-synchronized and faster alternative
         * Vector is a dynamic array just like ArrayList.
         * Vector is synchronized, making it thread-safe for individual operations.
         * Vector is generally slower than ArrayList because of synchronization
         * overhead.
         * Vector supports generics just like ArrayList.
         * Vector can be used in multi-threaded applications, but modern concurrent
         * collections are usually preferred.
         * In single-threaded applications, ArrayList is generally preferred over Vector
         * because synchronization is unnecessary.
         * 
         */

        Vector<String> v = new Vector<>();
        v.add("Apple");
        v.add("Mango");
        v.add("Banana");
        v.add("Orange");
        System.out.println(v);

        v.remove("Banana");
        System.out.println(v);

        System.out.println(v.get(1));

        v.set(1, "Pineapple");
        System.out.println(v);

        v.remove(0);
        System.out.println(v);

        System.out.println(v.size());

        System.out.println(v.contains("Orange"));

        System.out.println(v.isEmpty());
        System.out.println(v.capacity()); // default capacity is 10

    }
}
