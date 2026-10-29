package Ducat.ducat.StringClass;

//Longest word

public class longestWord {
    public static void main(String[] args) {

        String str = "Hello we are From JAVA backend BATCH";

        int totalWords = 0;
        int longestwordlength = 0;
        String word = "";
        String longestWordName = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                word = word + ch;

            }

            if (ch == ' ' || i == str.length() - 1) {
                totalWords++;

                if (word.length() > longestwordlength) {
                    longestwordlength = word.length();

                }

                if (word.length() > longestWordName.length()) {
                    longestWordName = word;

                }

                word = "";

            }

        }

        System.out.println("Total words in a String: " + totalWords);
        System.out.println("Longest word Length: " + longestwordlength);
        System.out.println("Longest Word: " + longestWordName);

    }
}
