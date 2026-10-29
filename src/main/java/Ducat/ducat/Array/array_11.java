package Ducat.ducat.Array;

//WAP to find Count even and odd elements in SDA size 8

public class array_11 {


public static void countEvenOdd(int[] arr){

    int evenCount = 0;
    int oddCount = 0;

    for(int i=0;i<arr.length;i++){

        if(arr[i]%2==0){
            evenCount++;
            
         }else{

            oddCount++;
           

         }

    }

    System.out.println("Total Even Elements: " + evenCount);
        System.out.println("Total Odd Elements:  " + oddCount);

}


    public static void printArray(int[] arr){
    
        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+ " ");

        }

        System.out.println();
    
    }

    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,6,7,8};

        System.out.println("Array elements:");
        printArray(arr);

        System.out.println("\nCounting Results:");
        countEvenOdd(arr);

    }
    
}
