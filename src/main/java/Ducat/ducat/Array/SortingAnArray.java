package Ducat.ducat.Array;

import java.util.Arrays;

public class SortingAnArray {

    public static void main (String[] args){
     /*   
        int[] arr={2,19,7,81,13,89,3};
        
        System.out.println("Unsorted array");
        for(int num:arr){
            System.out.print(num + " ");
        }

        Arrays.sort(arr);

        System.out.println("\nSorted array");

        for(int num2:arr){
            System.out.print(num2 + " ");

        }
        */


        //Sorting using bubble sort
       int[] arr={50 , 20  ,40  ,10 , 30};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                }

    }
    System.out.println("Sorted array using bubble sort");
    for(int num3:arr){
        System.out.print(num3 + " ");
    }   

}
}
    

