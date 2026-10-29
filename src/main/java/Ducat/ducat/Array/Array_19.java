package Ducat.ducat.Array;

//WAP to count prime number is SDA

class countPrime {

    public static void countPrimeNumber(int[] arr) {
        int count = 0;
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
                count++;

            }

        }

        System.out.println("\nTotal count of prime numbers: " + count);

    }

}

public class Array_19 {

    public static void main(String[] args) {

        int[] arr = { 2, 4, 3, 5, 6, 11, 56, 77, 88, 14 };
        countPrime.countPrimeNumber(arr);

    }

}
