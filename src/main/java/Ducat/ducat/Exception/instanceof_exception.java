package Ducat.ducat.Exception;

//instanceof operator is used to check the type of exception at runtime in catch block. After that we can handle the exception accordingly.

public class instanceof_exception {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3 };
        String s = null;
        try {
            System.out.println("Hello Java.......................1");
            System.out.println("Hello Java.......................2");
            System.out.println(100 / 10);
            System.out.println(arr[2]);
            System.out.println(s.length());
            System.out.println("Hello Java.......................4");

        } catch (Exception e) {

            if (e instanceof ArithmeticException) {
                System.err.println("ArithmeticException aaya.....  ");

            } else if (e instanceof NullPointerException) {
                System.err.println("NullPointerException aaya.....  ");

            } else if (e instanceof ArrayIndexOutOfBoundsException) {
                System.err.println("ArrayIndexOutOfBoundsException aaya.....  ");

            } else {
                System.err.println("Exception aaya.........."); // Out and err dono printing k liye use hota hai.
                                                                // differentce bus itna hai ki "err" use karne se red
                                                                // color me error show hota hai
            }

        }

        System.out.println("Your program terminated successfully........");

    }

}
