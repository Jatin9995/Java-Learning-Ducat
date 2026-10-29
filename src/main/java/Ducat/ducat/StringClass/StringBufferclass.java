package Ducat.ducat.StringClass;

/*
String is an immutable class. once we have created a string object then we cannot change it. if we want to change the string then we have to create a new string object.
StringBuffer is a mutable class. once we have created a StringBuffer object then we can change it. StringBuffer is used to perform string manipulation.
StringBuffer is faster than String because StringBuffer is mutable and String is immutable.
StringBuffer is used to perform string manipulation. 
 */

public class StringBufferclass {
    public static void main(String[] args) {

        // String object example

        String str = new String("Jatin");
        String str1 = new String("Jatin");
        str.concat("Rout");
        System.out.println("String class: " + str); // it will print "Jatin" only because str is immutable and we cannot
                                                    // change it.

        System.out.println("str.equals(str1): " + str.equals(str1)); // content comparison. Content dono ka same hai to
                                                                     // answer true aaya.
        System.out.println("str == str1: " + (str == str1)); // reference comparison. dono new object hai or dono ka
                                                             // address memory me alag alag hai. islye answer false hai.

        System.out.println("------------------------------------------------");

        // StringBuffer object example
        // StringBuffer class is also called synchonized class. StringBuffer class is
        // used to perform string manipulation.

        StringBuffer str3 = new StringBuffer("Jatin ");
        StringBuffer str4 = new StringBuffer("Jatin ");

        str3.append("Rout"); // inplace of concat, append method is used in StringBuffer to add string to
                             // existing string.
        System.out.println("StringBuffer class: " + str3); // It will print "Jatin Rout" because str1 is mutable and we
                                                           // can change it.

        System.out.println("str3.equals(str4): " + str3.equals(str4)); // equals method string class ka hai.
                                                                       // Stringbuffer class sirf referencece means
                                                                       // address match karata hai. islye answer false
                                                                       // hai.
        System.out.println("str3 == str4: " + (str3 == str4)); // reference comparison. dono new object hai or dono ka
                                                               // address memory me alag alag hai. islye answer false

        // Few methods of StringBuffer class
        StringBuffer sb = new StringBuffer("Jatin Rout ");
        sb.append("Welcome To Ducat ");
        sb.append("Noida Sector 63");
        sb.insert(6, "testinsert"); // inserted "testinsert" at index 6
        sb.delete(0, 6);// deleting from index 0 to 6 sb.replace(0, 0, str1)
        sb.replace(0, 4, "Replace");
        sb.deleteCharAt(0); // deleting character at index 0
        System.out.println(sb);
        sb.reverse(); // reversing the string
        System.out.println(sb);

        System.out.println("Total character capacity: " + sb.capacity());

    }

}
