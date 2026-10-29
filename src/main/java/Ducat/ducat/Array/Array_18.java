package Ducat.ducat.Array;

//WAP to find the prime number in SDA element size 8.

class PrimeNumber {

    public static void isPrime(int[] arr) {
        System.out.print("Prime Numbers in the array: ");
        for (int i = 0; i < arr.length; i++) {

            int num = arr[i];

            int factor = 0;

            for (int j = 1; j <= num; j++) {

                if (num % j == 0) {
                    factor++;
                }

            }

            if (factor == 2) {
                System.out.print(num + " ");

            }

        }

        System.out.println();

    }

}

public class Array_18 {

    public static void main(String[] args) {

        int[] arr = { 2, 1, 5, 4, 6, 7, 8, 9, 11, 14, 15, 17, 18, 20 };

        PrimeNumber.isPrime(arr);

    }
}
