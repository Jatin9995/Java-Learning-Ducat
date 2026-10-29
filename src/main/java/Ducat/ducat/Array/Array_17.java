package Ducat.ducat.Array;

//WAP to change the search elements size 10.

class SearchChange{

    int searchelement;
    int changeElement;

    public static void SearchChangeElement(int[] arr, int searchelement, int changeElement){

        boolean found=false;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == searchelement){
                arr[i] = changeElement;
                found=true;
                System.out.println("Element found and changed successfully.");
                break;

            }
}

if(!found){
   System.out.println("Element " + searchelement + " not found in the array.");

}

    }
}

public class Array_17 {

    public static void main(String[] args) {

        int[] arr= {1,2,3,4,5,6,7,8,9,10};

        SearchChange.SearchChangeElement(arr,4, 11);

        System.out.println("\nUpdated Array:");
        for(int i=0; i<arr.length; i++){
             System.out.print(arr[i] + " ");

        }

       


    }
    
}
