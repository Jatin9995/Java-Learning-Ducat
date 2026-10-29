package Ducat.ducat.Collections;

// Comparisons in Java are quite easy, until they're not.

// When working with custom types, or trying to compare objects that aren't directly comparable, we need to make use of a comparison strategy. We can build one simply by making use of the Comparator or Comparable interfaces
// Comparable is an interface defining a strategy of comparing an object with other objects of the same type. This is called the class's "natural ordering.
// The sorting order is decided by the return value of the compareTo method.
// The Integer. compare(x, y) returns -1 if x is less than y, O if they're equal, and 1 otherwise.
// If we are not satisfying with default natural sorting order (or) if
// default natural sorting order is not available then we can define our
// own customized sorting by Comparator object.
// Comparable meant for default natural sorting order.
// Comparator meant for customized sorting order.

public class Emp implements Comparable<Emp> {

    int id;
    String name, gender;

    public Emp(int id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "ComparableNComparator [id=" + id + ", name=" + name + ", gender=" + gender + "]";
    }

    // Implementing Comparable interface
    // compareTo method is used to compare two objects
    // It returns 0 if both objects are equal, -1 if this object is less than the
    // other object, and 1 if this object is greater than the other object.
    // Here, we are comparing two objects based on their id.
    // If we want to compare based on name or gender, we can modify the compareTo
    // method accordingly.
    @Override
    public int compareTo(Emp o) {
        return this.id - o.id;
    }

}
