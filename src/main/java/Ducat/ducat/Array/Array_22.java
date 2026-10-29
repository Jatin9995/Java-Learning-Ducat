package Ducat.ducat.Array;

//WAP to reverse an SDA size 8

class reverse {
    public static void reverseAnArray(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;

        }

    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class Array_22 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80 };

        reverse.reverseAnArray(arr);
        System.out.println("Reversed array:");
        reverse.printArray(arr);

    }

}
