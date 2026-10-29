package Ducat.ducat.Array;

import java.util.Arrays;
import java.util.Scanner;

//WAP to add all even and odd elements of SDA size 8.


class evenOddArray {

    public static void addEvenOddArray(int[] arr) {


        int sumEven = 0;
        int sumOdd = 0;

for(int i=0; i<arr.length; i++ ){

    if(arr[i]%2==0){
        sumEven=sumEven+arr[i];
    }else{
        sumOdd=sumOdd+arr[i];

    }


}

System.out.println("Sum of even elements: "+sumEven);
System.out.println("Sum of odd elements: "+sumOdd);

    }


    public static void sortArray(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Sorted array: "+Arrays.toString(arr));

    }

}



public class Array_13 {
    
public static void main(String[] args) {

    int[] arr=new int[8];
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter the elements of array: ");

    for(int i=0; i<arr.length; i++){
        System.out.print("Enter element "+(i)+": ");
        arr[i]=sc.nextInt();
    
    }

    System.out.println("Array elements: "+Arrays.toString(arr));

    sc.close();

    System.out.println("--- Result ---");

    evenOddArray.addEvenOddArray(arr);
    evenOddArray.sortArray(arr);
    



}



}
