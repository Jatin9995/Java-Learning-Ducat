package Ducat.ducat.StringClass;

//Q3.Count total no of small letters from a given String?

public class smallLetter {
    public static void main(String[] args) {
        String str = "Hello We are From JAVA Backend BATCH";

        int totalWords = 0;
        String word = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ' ' || i == str.length() - 1) {
                totalWords++;

            }

            if (ch != ' ') {
                word = word + ch;
            } else if (ch == ' ') {
                System.out.println(word);
                word = "";

            }

        }

        System.out.println("\nTotal words in the string are: " + totalWords);

    }
}
