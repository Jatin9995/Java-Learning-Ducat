package Ducat.ducat.Array;

class DeletionArrayElement {



  public static void deleteelement(int arr[], int index){

int[] newArr=new int[arr.length-1];

    for(int i=0; i<arr.length; i++){
        if (i<index){
           newArr[i] = arr[i];

        }else if (i > index) {
                newArr[i - 1] = arr[i];
            }

    }

    System.out.println("Array after deletion: ");
    for(int i=0; i<newArr.length; i++){
        System.out.print(newArr[i] + " ");

    }



  }

}



public class DeletionAnArray {

    public static void main(String[] args) {
    

 int[] arr={99,7,8,83,11};
  int index=3;

  DeletionArrayElement.deleteelement(arr,index);


    }   


    }


    

