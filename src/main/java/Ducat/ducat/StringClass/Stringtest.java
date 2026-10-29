package Ducat.ducat.StringClass;

public class Stringtest {
    public static void main(String[] args) {
        String str = "Hello we are From JAVA backend BATCH";
        int totalWord = 0;
        int smallword = 0;
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
                    char c = word.charAt(j);
                    if (c >= 'a' && c <= 'z') {
                        smallLetter++;
                    }

                }
                if (smallLetter == word.length()) {
                    smallword++;
                }

                word = ""; // Next word ke liye reset

            }

        }
        System.out.println("Total word: " + totalWord);
        System.out.println("Small word: " + smallword);

    }

}
