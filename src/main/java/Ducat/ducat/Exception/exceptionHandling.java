package Ducat.ducat.Exception;

import java.util.Scanner;

//An exception is an event, which occurs  during the excetution of a program that distrupt the normal flow of the program's instruction.
//Exceltion handling is used to handle the runtime error so that the regular flow of the application can be preserved..
//types of exception: 1. try, 2. catch, 3. finally, 4. throw, 5. throws

//try block: The try block contains the code that might throw an exception.
//catch block: The catch block contains the code that handles the exception.
//finally block: The finally block contains the code that is executed regardless of whether an exception is thrown or not.
//throw statement: The throw statement is used to throw an exception.
//throws statement: The throws statement is used to declare that a method might throw an exception.

public class exceptionHandling {

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3 };
    String s = "hi";

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the temp number: ");
    int n = sc.nextInt(); // sc.close(); is used to close the scanner object. to avoid the data leackage

    try {
      System.out.println("Hello Java.......................1");
      System.out.println("Hello Java.......................2");
      System.out.println("Hello Java.......................3");
      System.out.println("Hello Java.......................4");
      System.out.println("Hello Java.......................5");
      System.out.println(s.length());// Exception in thread "main" java.lang.NullPointerException: Cannot invoke
                                     // "String.length()" because "s" is null at
                                     // Ducat.ducat.Exception.exceptionHandling.main(exceptionHandling.java:25)

      System.out.println("Hello Java.......................6" + 100 / 0);
      System.out.println("Hello Java.......................7" + " " + arr[4]); // Exception in thread "main"
      // java.lang.ArrayIndexOutOfBoundsException:
      // Index 4 out of bounds for length 3 at
      // Ducat.ducat.Exception.exceptionHandling.main(exceptionHandling.java:16).
      // Error is occured in regular flow. Exceltion
      // handling is used to successfully terminate
      // your program.

    } catch (ArrayIndexOutOfBoundsException e) {
      e.printStackTrace();

    } catch (NullPointerException e) {
      e.printStackTrace();

    } catch (Exception e) { // Exception in catch block can handle all type of exceptions. Once it is used
                            // then no need to use other types of exceltion in catch block.
      System.err.println("Exception aaya....."); // exception ko red color me show karta hai
      e.printStackTrace();

    } finally {
      sc.close();// finaly block use karte hai taaki exception aaye ya na aaye. finally block
                 // jarur execute hoga. sc.close data leackage se bachne k liye use kiya jata hai
                 // agar exceltion hai to pehle catch handle karega or uske baad finally chalega
                 // or agar exception nahi hai to try k baad direct finally block chalega
      System.out.println("Finally block executed.....");
    }

    System.out.println("Hello Java.......................8");
    System.out.println("Hello Java.......................9");
    System.out.println("Hello Java.......................10");
    System.out.println("Hello Java.......................11");
    System.out.println("Hello Java.......................12");

    System.out.println("Your program successfully teriminated");

  }

}
