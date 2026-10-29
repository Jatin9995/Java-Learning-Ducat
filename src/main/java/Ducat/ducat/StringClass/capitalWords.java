package Ducat.ducat.StringClass;

//Q6.Count total no of capital words in a given String?

public class capitalWords {

    public static void main(String[] args) {

        String str = "Hello we are From JAVA backend BATCH";
        int totalWords = 0;
        int capitalWord = 0;
        String word = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                word = word + ch;
            }

            if (ch == ' ' || i == str.length() - 1) {
                totalWords++;

                int CapitalLetter = 0;
                for (int j = 0; j < word.length(); j++) {
                    char c = word.charAt(j);
                    if (c >= 'A' && c <= 'Z') {
                        CapitalLetter++;

                    }

                }

                if (CapitalLetter == word.length()) {
                    capitalWord++;

                }

                word = "";

            }

        }

        System.out.println("Total words in the String: " + totalWords);
        System.out.println("Total capital words in the String: " + capitalWord);

    }

}
