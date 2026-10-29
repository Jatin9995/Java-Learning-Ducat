package Ducat.ducat.StringClass;

//Q6.Count total no of small words in a given String?

public class smallWords {

    public static void main(String[] args) {

        String str = "Hello we are From JAVA backend BATCH";
        int totalWord = 0;
        int smallWord = 0;
        String word = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                word = word + ch;

            }

            if (ch == ' ' || i == str.length() - 1) {
                totalWord++;
                int smallLetter = 0;
                for (int j = 0; j < word.length(); j++) {
                    char small = word.charAt(j);
                    if (small >= 'a' && small <= 'z') {
                        smallLetter++;
                    }

                }

                if (smallLetter == word.length()) {
                    smallWord++;

                }

                word = "";

            }

        }

        System.out.println("\nTotal words: " + totalWord);
        System.out.println("Small words: " + smallWord);

    }

}
