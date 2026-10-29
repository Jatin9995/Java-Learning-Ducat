package Ducat.ducat.Array;

import java.util.Scanner;
// Array is the collection of similar data types.
//WAP to input and display element of SDA size 15

public class array_1 {

public static void printAnArray(int[] arr){
    System.out.println("Printing your array.....................");
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
        
    }

  

}

public static void inputAnArray(int[] arr){

    Scanner sc = new Scanner(System.in);

    System.out.println("Taking elelemnts for your array................");
    for(int i=0; i<arr.length; i++){
        System.out.print("Enter for arr["+i+"]:");
        arr[i] = sc.nextInt();

    }

 
}



    public static void main(String[] args) {
        int[] wrr= new int[15];
        inputAnArray(wrr);
        printAnArray(wrr);
        

    }
    
}
