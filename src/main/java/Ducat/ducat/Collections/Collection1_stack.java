package Ducat.ducat.Collections;

import java.util.Stack;

/*
Stack is a class that follows LIFO (Last In First Out) principle.

*/

public class Collection1_stack {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(10); // push is used to add elements in an array
        stack.push(20);
        stack.push(30);
        System.out.println(stack); // Output: [10, 20, 30]

        System.out.println(stack.peek());// show top,the top element means the element that was added most recently
                                         // because it follows LIFO (Last in First Out)

        System.out.println(stack.pop());// remove top,top element means the element that was added most recently
        System.out.println(stack); // Output: [10, 20]

        stack.push(100);// Adds to top.
        System.out.println(stack);

        System.out.println(stack.isEmpty());

        System.out.println("Top element " + stack.peek());
        System.out.println("Remove top element " + stack.pop());

        System.out.println("After removing top element, printing the stack " + stack);

    }
}
