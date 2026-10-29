package Ducat.ducat.Array;

//Search an element in an array

class searchElement{

    public static void search(int[] arr, int element){
      int i;
        for(i=0; i<arr.length; i++){

            if(arr[i]==element){
                System.out.println("Element ["+element+"] found at index : " + i);
               break;
            }
        }

        if(i==arr.length){
            System.out.println("Element ["+element+"] not found in the array");

        }

       

    }

    

}




public class SearchingAnArray {
    
public static void main(String[] args){
    
int[] arr={2,4,5,7,3,6,8};
int element=10;
System.out.println("Length of an Array is : " + arr.length);

searchElement.search(arr, element);

}

}
