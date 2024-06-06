package ml;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.offer(11);
        queue.offer(22);
        queue.offer(33);
        
        
        // Removing and printing elements from the queue
        System.out.println(queue.poll());

       
        //Returns the Top Value 
        System.out.println(queue.peek());
        
        
        
        while (!queue.isEmpty()) {
        System.out.println(queue.poll());
    } 
        
        

	}

}
