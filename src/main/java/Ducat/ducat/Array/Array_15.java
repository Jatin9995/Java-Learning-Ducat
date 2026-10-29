package Ducat.ducat.Array;

//WAP to find | count an element in SDA size 8

public class Array_15 {
    
   public static void main(String[] args) {
        int[] arr = {3, 2, 3, 4, 3};
        int element = 3;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                System.out.println("Element found at index: " + i);
                count++;
            }
        } // <-- Close the loop here!

        System.out.println("Total count of element: " + count); // Now this runs once at the end
    } 
}
        