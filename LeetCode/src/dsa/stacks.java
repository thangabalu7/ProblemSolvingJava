package dsa;

import java.util.Stack;

public class stacks {
	 public static void main(String[] args) {
	        Stack<Integer> stack = new Stack<>();
	        // Pushing elements onto stack
	        stack.push(10);
	        stack.push(20);
	        stack.push(30);
	        System.out.println("Stack: " + stack); // [10, 20, 30]
	        System.out.println(" Contains  :"+stack.search(10));
	        // Peek top element
	        System.out.println("Top element: " + stack.peek()); // 30

	        // Pop top element
	        stack.pop();
	        System.out.println("After pop: " + stack); // [10, 20]

	        // Check if stack is empty
	        System.out.println("Is stack empty? " + stack.isEmpty()); // false
	        System.out.println("Contains:"+stack.search(10));
	    }

}
