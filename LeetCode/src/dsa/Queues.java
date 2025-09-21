package dsa;

import java.util.*;

public class Queues {
	 public static void main(String[] args) {
	        Queue<Integer> queue = new LinkedList<>();
	        // Enqueue (add elements)
	        queue.add(10);
	        queue.add(20);
	        queue.add(30);     
	        System.out.println("Queue: " + queue); // [10, 20, 30]

	        // Peek (front element)
	        System.out.println("Front element: " + queue.peek()); // 10

	        // Dequeue (remove element)
	        queue.remove();
	        System.out.println("After dequeue: " + queue); // [20, 30]

	        // Is empty
	        System.out.println("Is queue empty? " + queue.isEmpty()); // false
	    }
}
