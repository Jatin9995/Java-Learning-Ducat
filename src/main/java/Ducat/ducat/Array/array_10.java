package Ducat.ducat.Array;

//WAP to multiply even by 2 and odd by 3 in SDA size 8 

public class array_10 {

    public static void multiplyEvenOdd(int[] arr){
        for (int i=0; i<arr.length; i++){

            if(arr[i]%2==0){
                arr[i]=arr[i]*2;

            }else{
                arr[i]=arr[i]*3;
            }
    
        }
    }


    public static void printArray(int[] arr){
        for (int i=0; i<arr.length; i++){
        
            System.out.print(arr[i]+ " ");

        }

        System.out.println();

    }

    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,7,8};
        System.out.println("Original Array: ");
        printArray(arr);
        
        multiplyEvenOdd(arr);

        System.out.println("Modified array: ");
        printArray(arr);


    }
    
}
