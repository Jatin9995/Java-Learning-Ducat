package Ducat.ducat.StringClass;

//Q1.Count total no of alphabets from a given String?

public class CountAlphabet {

    public static void main(String[] args) {
        String str = "Hello We are from Java Backend batch";

        int countAlphabet = 0;

        for (int i = 0; i < str.length(); i++) {
            char alphabetcount = str.charAt(i);

            // if (Character.isLetter(alphabetcount)) {
            // countAlphabet++;
            // }

            if (alphabetcount != ' ') {
                countAlphabet++;

            }

        }

        System.out.println(countAlphabet);

    }

}
