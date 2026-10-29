package Ducat.ducat.Array;

//WAP to add all prime number of SDA size 8.

class Arrays_21 {

    public static void SumPrime(int[] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            // Safety guard: Numbers <= 1 are never prime
            if (num <= 1) {
                continue; // Skip straight to the next element
            }

            int factor = 0;

            for (int j = 1; j <= num; j++) {
                if (num % j == 0) {
                    factor++;
                }

            }

            if (factor == 2) {
                sum = sum + num;
                System.out.print(num + " ");

            }

        }

        System.out.println("\nSum of prime numbers is: " + sum);

    }
}

public class Array_21 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };

        Arrays_21.SumPrime(arr);

    }

}