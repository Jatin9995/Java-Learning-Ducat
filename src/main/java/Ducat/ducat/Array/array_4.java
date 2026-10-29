package Ducat.ducat.Array;

//WAP to display square of all elements in SDA size 8

public class array_4 {

    public static void squareAnArray(int[] arr) {
    for (int i=0; i<arr.length; i++){
        int square=arr[i] * arr[i];
        System.out.println("Square of array[" + i + "]: " + square);

      }

    }

    public static void main(String[] args) {
      int[] arr={1,2,3,4,5,6,7,8};
      squareAnArray(arr);
        

    }
    
}
