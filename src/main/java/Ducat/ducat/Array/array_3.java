package Ducat.ducat.Array;

import java.util.Scanner;

//WAP to multiply all elements of SDA size 12

public class array_3 {

    public static void inputAnArray(int[] arr){

        Scanner sc=new Scanner(System.in);
        System.out.println("Taking input from user for array: ");
        for (int i=0; i<arr.length; i++){
            System.out.print("Enter for array["+i+"]:");
            arr[i]=sc.nextInt();

        }

        sc.close();
    }



    public static void multiplyAnArray(int[] arr){
        long product=1;
        for(int i=0; i<arr.length; i++){
            product=product * arr[i];

        }

        System.out.println("Product of all elements is: " + product);


    }

    public static void printAnArray(int[] arr){
        System.out.println("Printing user input array elements : ");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");

        }

        System.out.println();
    }


    public static void main(String[] args) {    

        int[] arr= new int[12];
        inputAnArray(arr);
        printAnArray(arr);
        multiplyAnArray(arr);
        



    }
    
}
