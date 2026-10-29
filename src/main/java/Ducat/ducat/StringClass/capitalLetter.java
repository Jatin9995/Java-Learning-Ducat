package Ducat.ducat.StringClass;

//Count total no of capital letters a given String?

public class capitalLetter {

    public static void main(String[] args) {
        String str = "Hello We are From Java Backend Batch";

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                count++;

            }

        }

        System.err.println("Total no of Capital letters in the String is: " + count);

    }

}
