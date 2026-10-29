package Ducat.ducat.Array;
// variable arguments in array

public class variableArgumentsinArray {

    public static void sumOfAllInteger(int... a) { // ...a in called the variable arguments in array. you can add
                                                   // multiple integer in this method. no need to pass multiple variable
                                                   // in patameter. If variable argument is passsed in parameter then
                                                   // after this no other parameter will be required and
                                                   // accepted.

        System.out.println("Print Integer......................................");
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];

        }

        System.out.println("Sum of all integer is: " + sum);
        System.out.println("-----------------------------------------------------");

    }

    public static void main(String[] args) {

        sumOfAllInteger(11);
        sumOfAllInteger(11, 22);
        sumOfAllInteger(4, 5, 6, 3, 3, 5, 3, 2, 5, 5, 6, 6, 6, 6);
        sumOfAllInteger(2, 2, 2, 2, 6, 6, 7, 7, 6, 5);
        sumOfAllInteger(23, 43, 56, 78, 99, 76, 191);
        sumOfAllInteger(101, 239, 233, 544);
        sumOfAllInteger(23, 43, 21);
    }

}
