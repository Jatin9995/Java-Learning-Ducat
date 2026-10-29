package Ducat.ducat.Array;


//WAP to display all elements even position of SDA size 8.

public class array_5 {

    public static void displayEvenPositionArray(int[] arr) {
    
    for (int i=0; i<arr.length; i++){
// Check if the POSITION (i) is even
        if (i%2==0){
// Print the actual element at that position with a space
            System.out.print(arr[i]+ " ");
           
        }
    }

   System.out.println();
    
    }

    public static void main(String[] args) {

        int arr[]={12,11,13,14,15,16,17,18};
        displayEvenPositionArray(arr);
        

    }
    
}
