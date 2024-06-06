package lk;

public class StacksUsingLinkedLists {
	
	class Node {
	    int data;
	    Node next;

	    public Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	
	    private Node top;

	    public StacksUsingLinkedLists() {
	        this.top = null;
	    }

	    public void push(int value) {
	        Node newNode = new Node(value);
	        newNode.next = top;
	        top = newNode;
	    }

	    public int pop() {
	        if (isEmpty()) {
	            System.out.println("Stack is empty");
	            return -1;
	        } else {
	            int poppedValue = top.data;
	            top = top.next;
	            return poppedValue;
	        }
	    }

	    public int peek() {
	        if (isEmpty()) {
	            System.out.println("Stack is empty");
	            return -1;
	        } else {
	            return top.data;
	        }
	    }

	    public boolean isEmpty() {
	        return top == null;
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StacksUsingLinkedLists stack = new StacksUsingLinkedLists();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        System.out.println("Is stack empty? " + stack.isEmpty());
		
		
	
	}

}
