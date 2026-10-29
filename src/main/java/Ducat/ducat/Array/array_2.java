package Ducat.ducat.Array;

import java.util.Scanner;
// Array is the collection of similar data types.
// Array is a SDA (Static Data Array) which means the size of an array is fixed at the time of declaration.
//WAP to add all elements of SDA size 8 and print the sum.

public class array_2 {


    public static void inputAnArray(int[] arr){

        Scanner sc = new Scanner(System.in);
        System.out.println("Taking elelemnts for your array................");
        for (int i=0; i<arr.length; i++){
         System.out.print("Enter for array["+i+"]:");
            arr[i]=sc.nextInt();

        }

    }

    public static void printAnArray(int[] arr){
        System.out.println("Printing elements of your array.");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
       
    }

    public static void sumOfArray(int[] arr){
        int sum=0;

        for (int i=0; i<arr.length; i++){
            sum=sum + arr[i];

        }
        System.out.println("Sum of all elements of an array is :" + sum);

    }


    


    public static void main(String[] args) {     
        
        int[] arr=new int[8];
        inputAnArray(arr);
        sumOfArray(arr);
        printAnArray(arr);



    }
    
}
