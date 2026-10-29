package Ducat.ducat.Collections;

import java.util.Set;
import java.util.TreeSet;

/*
Stores unique elements only.
Maintains elements in ascending (natural) order.
Does not allow duplicate elements.
Does not allow null values.
Internally uses a Red-Black Tree.
It is slower than HashSet.
It is used when we need to maintain elements in sorted order.

Feature               HashSet      LinkedHashSet      TreeSet
Duplicates            ❌           ❌                ❌
Null Allowed          ✅           ✅                ❌
Insertion Order       ❌           ✅                ❌
Sorted Order          ❌           ❌                ✅
Performance           Fastest      Fast             Slower
Internal Structure    HashTable    HashTable+List   Red-Black Tree

 */

public class Collection_TreeSet {
    public static void main(String[] args) {

        Set<String> tree = new TreeSet<>();
        tree.add("Blue");
        tree.add("Blue"); // Won't allow duplicate element. Hence Blue prints only once.
        tree.add("Black");
        tree.add("Red");
        tree.add("Yellow");
        tree.add("Pink");
        tree.add("Green");
        // tree.add(null); //TreeSet must compare elements to sort them, and null cannot
        // be compared.
        System.out.println(tree); // by-default it sorts the elements in ascending order

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println(numbers.first()); // returns the first element in the set
        System.out.println(numbers.last()); // returns the last element in the set
        System.out.println(numbers.higher(35)); // returns the element greater than 35
        System.out.println(numbers.lower(35)); // returns the element less than 35
        System.out.println(numbers.ceiling(35)); // returns the element greater than or equal to 35
        System.out.println(numbers.pollFirst());
        System.out.println(numbers.pollLast());
        System.out.println(numbers);
    }

}
