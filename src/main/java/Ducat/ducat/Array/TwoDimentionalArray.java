package Ducat.ducat.Array;

/*
Two dimensional array is an array of array. Two dimensional array is used to store data in tabular form.
Two dimantional array is a collection of multiple 1 dimentional array. 

*/

public class TwoDimentionalArray {
    public static void main(String[] args) {

        int[][] arr = {
                { 1, 2, 3, 4, 5, 6, 7, 8 },
                { 12, 25, 36, 47, 58, 69, 70, 81 },
                { 123, 256, 367, 478, 589, 690, 701, 812 },
                { 1234, 2567, 3678, 4789, 5890, 6901, 7012, 8123 },
                { 12345, 25678, 36789, 47890, 58901, 69012, 70123, 81234 },
                { 123456, 256789, 367890, 478901, 589012, 690123, 701234, 812345 }

        };

        System.out.println(arr[4][4]); // 1st [] represent row & 2nd [] represent column. indexing for both row &
                                       // column starts from 0.

        System.out.println("Length of an array: " + arr.length);// counting total number of rows in array.
        System.out.println("Length of an array: " + arr[4].length);// counting total number of columns in array.

        System.out.println("-----------------------");

        int sum = 0;

        // print all array elements
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println("\nTotal Sum of all elements in array: " + sum);

    }

}
