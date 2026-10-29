package Ducat.ducat.Exception;

public class multiplecatch {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };

        String s = "hi";
        try {
            System.out.println("Hello Java.......................1");
            System.out.println("Hello Java.......................2");
            System.out.println("Hello Java.......................3 " + 100 / 10);
            System.out.println(arr[9]);
            System.out.println(s.length());
            System.out.println("Hello Java.......................4"); // Corrected the closing parenthesis

        } catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e) { // Single catch handle
                                                                                                  // multiple exception
                                                                                                  // with pipe symbol

            System.err.println("ArithmeticException aaya.....  ");
            e.printStackTrace();

        }

    }

}
