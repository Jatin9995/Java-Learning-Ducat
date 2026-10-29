package Ducat.ducat.Array;

public class Insertion {
    
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int newElement=25;
        int index=2;

        //create new array of big size
        int[] Arr2= new int[arr.length+1];

        //copy elements from old array to new array
        for(int i=0;i<arr.length;i++){
            Arr2[i]=arr[i];
        }

        //shift elements to right to make space for new element
        for(int i=Arr2.length-1;i>index;i--){
            Arr2[i]=Arr2[i-1];
        }
       

        //insert new element at given index
        Arr2[index]=newElement;

        //print new array
        for(int i=0;i<Arr2.length;i++){
            System.out.print(Arr2[i]+" ");
        }
        System.out.println();
//print old array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();


        


    }
}
