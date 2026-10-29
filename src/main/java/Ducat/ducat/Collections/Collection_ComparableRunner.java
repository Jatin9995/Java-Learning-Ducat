package Ducat.ducat.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Collection_ComparableRunner {
    public static void main(String[] args) {

        ArrayList<Emp> al = new ArrayList<Emp>();
        Emp e1 = new Emp(1, "Ankit", "Male");
        al.add(e1);
        al.add(new Emp(89, "Janvi", "Female"));
        al.add(new Emp(10, "Lokesh", "Male"));
        al.add(new Emp(100, "Raj", "Male"));
        al.add(new Emp(101, "jatin", "Male"));
        System.out.println(al);

        System.out.println("------------------------------");

        Collections.sort(al);
        System.out.println(al);

    }
}
