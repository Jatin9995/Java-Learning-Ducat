package Ducat.ducat.Collections;

import java.util.HashSet;
import java.util.Set;

/*
Set is an interface in Java which extends Collection interface.
It represents the unordered set of elements which doesn't allow us to store the duplicate items.
We can store at most one null value in Set. Set is implemented by HashSet, LinkedHashSet, and TreeSet.
HashSet stores the elements by using a mechanism called hashing.
HashSet contains unique elements only.
HashSet allows null value.
HashSet class is non synchronized
HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
HashSet is the best approach for search operations.
jab object banate hai to interface left side hota hai or class right side hota hai. class ka object banake iterface k variable me save karte hai.isko upcasting kehte hai.
Interface ka koi object nahi banta.
HashSet is used when we need to store unique elements and we don't care about the order of elements.
*/

public class Collection_HashSet {
    public static void main(String[] args) {

        // jab object banate hai to interface left side hota hai or class right side
        // hota hai. class ka object banake iterface k variable me save karte hai.
        // Interface ka koi object nahi banta.
        Set<String> setofcolor = new HashSet<>();
        setofcolor.add("Blue"); // HashSet contains unique elements only. Hence Blue will print only once.
        setofcolor.add("Blue");
        setofcolor.add("White");
        setofcolor.add("black");
        setofcolor.add("Red");
        setofcolor.add("Yellow");
        setofcolor.add("Green");
        setofcolor.add("Orange");
        setofcolor.add(null);// null is allowed in HashSet

        System.out.println(setofcolor); // HashSet does not guarantee insertion order. Elements are displayed based on
                                        // hashing and may appear in any order.
        System.out.println(setofcolor.size()); // Size of the set is 8. Duplicate element has been removed

        setofcolor.remove("Blue");
        System.out.println(setofcolor);
        System.out.println(setofcolor.contains("Red"));
        System.out.println(setofcolor.isEmpty());
        // System.out.println(setofcolor.removeAll(setofcolor));
        setofcolor.clear();
        System.out.println(setofcolor.isEmpty());

    }

}
