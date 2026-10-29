package Ducat.ducat.Array;

import java.util.Scanner;

//WAP to replace even by 0 odd by 1 element in SDA size 5


class replaceEvenOdd {

    public static void evenOdd(int[] arr) {

        int evencount = 0; // Declare them locally inside the method
        int oddcount = 0;

        for (int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                arr[i]=0;
                evencount=evencount+1;
            }else{
                arr[i]=1;
                oddcount=oddcount+1;

            }

        }
        System.out.println("\n--- Counts ---");
        System.out.println("Even count: " + evencount);
        System.out.println("Odd count: " + oddcount);

    }

}


public class Array_14 {

    public static void main(String[] args) {

        int[] arr=new int[5];


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter the element at index " + i + ":");
            arr[i]=sc.nextInt();

        }

        sc.close();

        replaceEvenOdd.evenOdd(arr);
        System.out.println("\nArray after replacing even by 0 and odd by 1:");
        for(int i=0; i<arr.length; i++){
            System.out.println("Element at index " + i + ": " + arr[i]);



    }
    
}

}
