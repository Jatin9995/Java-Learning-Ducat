package Ducat.ducat.Array;

//WAP replace all odd elements by their cube of SDA size 8

public class array_9 {

    public static void replaceOddElementsByCube(int[] arr) {
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2!=0){
                arr[i]=arr[i]*arr[i]*arr[i];

            }
        }
    }

    public static void printArray(int[] arr) {

        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }


    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,7,8};

        System.out.println("Original array:");
        printArray(arr);

        replaceOddElementsByCube(arr);

        System.out.println("Array after replacing odd elements by their cube:");
        printArray(arr);
    
    
    }
    
}
