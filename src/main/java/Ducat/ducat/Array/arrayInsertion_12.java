package Ducat.ducat.Array;

public class arrayInsertion_12 {
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int element = 12;
        int index = 3;



        //print old array
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");

        }

        System.out.println();


        //create new array
        int[] arr2=new int[arr.length+1];

        for (int i=0; i<arr.length; i++){
            arr2[i]=arr[i];
        }

        //shift elements to right
        for(int i=arr2.length-1; i>index; i--){
            arr2[i]=arr2[i-1];

        }

        arr2[index]=element;
        
       //print new array
       for(int i=0; i<arr2.length; i++){

        System.out.print(arr2[i] + " ")   ;

       }
         System.out.println();

    }

}
