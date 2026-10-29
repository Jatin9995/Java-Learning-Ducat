package Ducat.ducat.Array;

//WAP to replace by 0 prime number in SDA element size 8.

class Arrays_20 {

    public static void replacePrime(int[] arr) {

        int replace = 0;

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            int factor = 0;

            for (int j = 1; j <= num; j++) {
                if (num % j == 0) {
                    factor++;
                }
            }

            if (factor == 2) {
                arr[i] = replace;
                System.out.println("Prime number found at index " + i + " and replaced by " + replace);
            } else {
                System.out.println("Not a prime number at index " + i);

            }

        }

    }

    public static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

}

public class Array_20 {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };

        Arrays_20.replacePrime(arr);
        System.out.println("\nFinal Updated Array:");
        Arrays_20.printArray(arr);

    }

}
