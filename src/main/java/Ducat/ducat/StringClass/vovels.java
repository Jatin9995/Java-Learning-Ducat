package Ducat.ducat.StringClass;

public class vovels {
    public static void main(String[] args) {
        String str = "Hello We are from Java Backend batch";

        int vovelsCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U') {
                vovelsCount++;

            }
        }

        System.out.println("Total number of vowels in the string: " + vovelsCount);
    }
}
