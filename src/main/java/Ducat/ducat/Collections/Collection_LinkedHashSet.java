package Ducat.ducat.Collections;

import java.util.LinkedHashSet;
import java.util.Set;

/*
Feature	                   HashSet	             LinkedHashSet
Duplicate elements	      ❌ Not allowed	    ❌ Not allowed
Null values               ✅ One null allowed	✅ One null allowed
Insertion order	          ❌ Not maintained	    ✅ Maintained
Performance	              ✅ Slightly faster	    ✅ Slightly slower
Internal structure	      Hash Table	         Hash Table + Linked List

LinkedHashSet is similar to HashSet, but it maintains insertion order by using a hash table along with a linked list. 
It stores unique elements and allows one null value.
*/

public class Collection_LinkedHashSet {
    public static void main(String[] args) {

        Set<String> setofcolor = new LinkedHashSet<>();
        setofcolor.add("Blue"); // LinkedHashSet contains unique elements only. Hence Blue will print only once.
                                // Insertion order is by-default maintained in LinkedHashSet.
        setofcolor.add("Blue");
        setofcolor.add("White");
        setofcolor.add("black");
        setofcolor.add("Red");
        setofcolor.add("Yellow");
        setofcolor.add("Green");
        setofcolor.add("Orange");
        setofcolor.add(null);// null is allowed in LinkedHashSet

        System.out.println(setofcolor); // Elements are displayed in the same order in which they were inserted.
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
