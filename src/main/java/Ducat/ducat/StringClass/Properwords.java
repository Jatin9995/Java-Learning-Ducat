package Ducat.ducat.StringClass;

//Count total number of proper words in a given string

public class Properwords {

    public static void main(String[] args) {

        String str = "Hello we are From JAVA backend BATCH";
        int totalWords = 0;
        String word = "";
        int properWord = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                word = word + ch;

            }

            if (ch == ' ' || i == str.length() - 1) {
                totalWords++;

                int capitalLetter = 0;
                int smallLetter = 0;

                for (int j = 0; j < word.length(); j++) {
                    char c = word.charAt(j);
                    if (c >= 'A' && c <= 'Z') {
                        capitalLetter++;
                    } else if (c >= 'a' && c <= 'z') {
                        smallLetter++;

                    }

                }

                if (capitalLetter == 1 && smallLetter == word.length() - 1) {
                    properWord++;

                }

                word = "";

            }

        }
        System.out.println("Total words: " + totalWords);
        System.out.println("Total proper words: " + properWord);
        System.out.println("Total improper words: " + (totalWords - properWord));

    }

}
