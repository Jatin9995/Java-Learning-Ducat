package Ducat.ducat.Collections;

import java.util.ArrayList;

/*
Collection is the root interface of the Java Collections Framework and represents a group of elements.
ArrayList Dynamic Array use karti hai. [10][20][30][40].Har element continuous memory me store hota hai.
LinkedList Doubly Linked List use karti hai. null <- [10] <-> [20] <-> [30] -> null. Har node me:Prev Address | Data | Next Address
ArrayList me direct index access possible hai. LinkedList me node by node travel karna padta hai.
ArrayList Agar beech se element delete karo:[10][20][30][40][50]. 30 remove kiya:[10][20][40][50]. 40 aur 50 ko shift karna padega.
LinkedList 10 <-> 20 <-> 30 <-> 40. 30 delete:10 <-> 20 <-> 40. Sirf links update karne hain.
Insert/Delete jyada ho → LinkedList. ArrayList me shifting hoti hai. LinkedList me links update hoti hai.
ArrayList Sirf List interface implement karti hai. List<Integer> list = new ArrayList<>();
LinkedList List + Queue + Deque implement karti hai. LinkedList<Integer> list = new LinkedList<>();. Queue operations bhi kar sakte ho. offer(), poll(), peek(). Queue banana ho → LinkedList
ArrayList list.get(100);Direct 100th index mil jata hai.
LinkedList 100th node tak pahunchne ke liye:1 -> 2 -> 3 -> ...Traverse karna padega.Slow. Reading/Accessing → ArrayList Best
ArrayList Memory continuous hoti hai. LinkedList Address ke through connected rehte hain. Memory alag-alag jagah ho sakti hai.
ArrayList = Contiguous Memory, LinkedList = Non-Contiguous Memory
ArrayList: new ArrayList<>(); Default capacity concept hota hai.Generally: 10. Capacity bharne par resize hoti hai.
LinkedList: new LinkedList<>(); Koi default capacity nahi hoti. Node tab banta hai jab data add karte ho.
ArrayList = Capacity Concept, LinkedList = No Capacity Concept.

Feature                  ArrayList           LinkedList
Internal Structure       Dynamic Array       Doubly Linked List
Access Speed             Fast O(1)           Slow O(n)
Insert/Delete            Slow                Fast
Memory Usage             Less                More
Memory Storage           Contiguous          Non-Contiguous
Queue Support            No                  Yes
Default Capacity         Yes                 No
Best For                Reading/Data Access  Insertion/Deletion
ArrayList = Fast Reading
LinkedList = Fast Modification

 */

public class Collection1_arrayList {

    public static void main(String[] args) {

        // arrayList is a class that implements the List interface in Java. It is used
        // to store elements of any data type. if we write ArrayList<String> al = new
        // ArrayList<>(); then it will store only String type of data.

        ArrayList al = new ArrayList();

        al.add("Jatin");
        al.add("Vijit");
        al.add("Shilpa");
        al.add("Nitish");
        al.add("Vivek");
        al.add("Manish");
        al.add("Rajesh");
        al.add("Rajat");
        al.add(22);
        al.add(22.56);
        al.add(true);

        System.out.println(al);

    }

}
