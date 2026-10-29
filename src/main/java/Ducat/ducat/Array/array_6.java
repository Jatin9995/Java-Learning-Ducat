package Ducat.ducat.Array;

//WAP to display all elements odd position of SDA size 8

public class array_6 {

    public static void displayOddPosition(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            if(i%2!=0){
                System.out.print(arr[i] + " ");

            }
        }

        System.out.println();
    }
    
    public static void main(String[] args) {

        int arr[]={12,11,13,14,15,16,17,18};
        displayOddPosition(arr);
    

    
    
    }
}
