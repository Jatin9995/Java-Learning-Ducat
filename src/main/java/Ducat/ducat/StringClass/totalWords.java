package Ducat.ducat.StringClass;

//Q5.Count total no of words a given String?

//If we are creating an string obj by using literals It will store in SCP(String Constant Pool)
//		SCP is a special memory area present in the Heap.(No Duplicate Object)

public class totalWords {
    public static void main(String[] args) {

        String str = "Hello We are From Java Backend Batch";

        int totalwords = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ' ' || i == str.length() - 1) { // i==str.length()-1 is taken to count the indexing so that the
                                                      // last word can be count. else it will only calculate till
                                                      // "backend & space after backend word.
                totalwords++;

            }

        }

        System.out.println("Total lwords count: " + totalwords);
    }

}
