package Ducat.ducat.Array;

//WAP replace all elements by their square of SDA size 8

public class array_7 {

    public static void replaceWithSquare(int[] arr){
        for (int i=0; i<arr.length; i++){
           arr[i]=arr[i]*arr[i];
            
            
        }

    }

    public static void printArray(int[] arr){
      for (int i=0; i<arr.length; i++){
        System.out.print(arr[i] + " ");

      }

      System.out.println();

    }

    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6,7,8};

        System.out.println("Before");
        printArray(arr);

        System.out.println("After");
        replaceWithSquare(arr);
        printArray(arr);
    
    
    }
    
}
