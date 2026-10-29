package Ducat.ducat.Array;


//WAP to replace an element in SDA by 0 size 8

class replaceElement {


    public static void replaceElementInArray(int[] arr, int index, int value) {

    if(index>=0 && index<arr.length){
        arr[index]=value;

        System.out.println("Element replaced successfully. New value of replaced element: " + arr[index]);

    }else{
        System.out.println("Invalid index position provided!");
    }
            

        }

    }




public class Array_16 {
    
public static void main(String[] args) {

     int[] arr={1,2,3,4,5,6,7,8};
     int index=5;
     int value=0;

     replaceElement.replaceElementInArray(arr, index, value);

     System.out.println("\nUpdated Array:");
     for (int i=0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
     }

      }    


}
