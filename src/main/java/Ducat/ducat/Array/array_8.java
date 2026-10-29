package Ducat.ducat.Array;

//WAP replace all even elements by their square of SDA size 8

public class array_8 {
    
    
    public static void replaceEvenElementswithSquare(int[] arr){
        for (int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                arr[i]=arr[i] * arr[i];

            } 
        }
    }

    public static void printArray(int[] arr){

        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");

        }

        System.out.println();

    }

    
    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,6,7,8};


       System.out.println("Before modification: ");
       printArray(arr);

       replaceEvenElementswithSquare(arr);

       System.out.println("After modification: ");
       printArray(arr);



    }
}
